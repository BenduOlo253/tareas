<!DOCTYPE html>
<html lang="es">

<head>
    <!-- Configuración del documento -->
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="../css/Editar_Perfil.css">
    <title>Regístrate</title>

    <!-- Script para manejar la visualización del campo de "otro género" -->
    <script>
        // Función para mostrar u ocultar el campo "otro género" según la selección
        function mostrarOcultarOtroGenero() {
            var otroGenero = document.getElementById("otro-genero");
            if (document.getElementById("genero-otro").checked) {
                otroGenero.style.display = "block";
            } else {
                otroGenero.style.display = "none";
            }
        }

        // Función para ocultar el campo "otro género"
        function ocultarOtroGenero() {
            var otroGenero = document.getElementById("otro-genero");
            otroGenero.style.display = "none";
        }

        function acerca_de() {
            // Especifica la URL y otros parámetros de la nueva ventana
            var url = "acerca_de.html";
            var nombreVentana = "_blank";
            var opciones = "width=600,height=400";

            // Abre la nueva ventana
            window.open(url, nombreVentana, opciones);
        }

    </script>
</head>

<body>
    <!-- Contenido principal -->
    <main>
        <!-- Menú de navegación -->
        <ul class='menu'>
            <li><a href='Home_Alumno.php'>Inicio</a></li>
            <li><a href='#' onclick="acerca_de()">Acerca de</a></li>
            <li class='submenu'><a href='#'>Opciones</a>
                <ul class='submenu'>
                    <li><a href='../../index.html'>Cerrar sesión</a></li>
                </ul>
            </li>
        </ul>
        
        <!-- Encabezado del formulario de registro -->
        <h1>Modifica tu perfil</h1>
        
        <!-- Formulario de registro -->
        <form action="../php/guardar.php" method="post" class="formulario_register" enctype="multipart/form-data">

            <!-- Obtener datos de la base de datos -->
            <?php
            // Incluir el archivo de conexión a la base de datos
            include "../php/conexion.php";

            session_start();

            // Verifica si el usuario está autenticado
            if (!isset($_SESSION['username'])) {
                header("Location: ../../index.html"); // Redirige al usuario si no está autenticado
                exit();
            }

            $matricula = $_SESSION['username'];

            // Consulta SQL para obtener datos de la base de datos
            $sql = "SELECT * FROM alumnos WHERE Matricula = ?";
            $stmt = mysqli_prepare($conn, $sql);
            mysqli_stmt_bind_param($stmt, "s", $matricula);
            mysqli_stmt_execute($stmt);
            $result = mysqli_stmt_get_result($stmt);

            // Verificar si hay resultados
            if ($result->num_rows > 0) {
                $userData = $result->fetch_assoc();
                echo "<div>
                        <img src='../images/" . $userData["Fotografia"] . "' alt='Avatar' id='img' />
                        <input type='file' name='fotousuario' id='foto' accept='image/*' />
                        <label for='foto'>Modificar fotografia de perfil</label>
                    </div>
                    <div>
                        <label for='Usuario'>Usuario</label>
                        <input type='text' placeholder='Usuario' name='Usuario' value='" . $userData["Usuario"] . "' required>
                    </div>
                    <div>
                        <label for='Contraseña'>Contraseña</label>
                        <input type='text' placeholder='Contraseña' name='Contraseña' value='" . $userData["Contraseña"] . "' required>
                    </div>

                    <div>
                        <label for='Nombres'>Nombres</label>
                        <input type='text' placeholder='Nombres' name='Nombres' value='" . $userData["Nombres"] . "' required>
                    </div>

                    <div>
                        <label for='apellido_paterno'>Apellido Paterno</label>
                        <input type='text' placeholder='Apellido Paterno' name='apellido_paterno' value='" . $userData["primApellido"] . "' required>
                    </div>

                    <div>
                        <label for='apellido_materno'>Apellido Paterno</label>
                        <input type='text' placeholder='Apellido Materno' name='apellido_materno' value='" . $userData["segApellido"] . "' required>
                    </div>

                    <div>
                        <label for='correo'>Correo</label>
                        <input type='email' placeholder='Correo Electrónico' name='correo' value='" . $userData["Correo"] . "' required><br>
                    </div>

                    <div class='genero'>
                        <label>Genero:</label>
                        Mujer<input type='radio' name='genero' id='genero-mujer' value='Mujer' required onclick='ocultarOtroGenero()'>
                        Hombre<input type='radio' name='genero' id='genero-hombre' value='Hombre' required onclick='ocultarOtroGenero()'>
                        Otro<input type='radio' name='genero' id='genero-otro' value='O' onchange='mostrarOcultarOtroGenero()'>
                    </div>

                    <div id='otro-genero' style='display:none;'>
                        <label for='otro-genero-texto'>Especifique su género:</label>
                        <input type='text' name='otro-genero-texto' id='otro-genero-texto' />
                    </div>
                    <div>
                        <input name='Actualizar_Usuario' type='hidden' value='1'>
                    </div>

                    <div>
                        <label>Fecha de nacimiento: </label><input type='date' name='date' id='Fecha_de_Nacimiento' value='" . $userData["Nacimiento"] . "' required>
                    </div>";
            };
            // Cerrar la conexión a la base de datos
            mysqli_close($conn);
            ?>

            <!-- Botones de Limpiar y Registrarse -->
            <div>
                <input type="reset" name="Limpiar" id="signIn-button" value="Limpiar">
            </div>

            <div>
                <button type="submit"> Guardar</button><a href="Home_Alumno.php">Cancelar</a>
            </div>

        </form>
    </main>

    <!-- Inclusión del script externo para el manejo de eventos en el formulario -->
    <script src="../js/Registro.js"></script>

</body>
</html>
