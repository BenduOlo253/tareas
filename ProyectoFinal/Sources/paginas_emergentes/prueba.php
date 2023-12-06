<!DOCTYPE html>
<html lang="es">

<head>
    <!-- Configuración del documento -->
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="../css/Registro.css">
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

    </script>
</head>

<body>
    <!-- Contenido principal -->
    <main>
        <!-- Encabezado del formulario de registro -->
        <h1>Regístrate!</h1>
        
        <!-- Formulario de registro -->
        <form action="../php/guardar.php" method="post" class="formulario_register" enctype="multipart/form-data">

            <!-- Obtener datos de la base de datos -->
            <?php
                // Incluir el archivo de conexión a la base de datos
                include "../php/conexion.php";

                // Consulta SQL para obtener datos de la base de datos
                $sql = "SELECT * FROM alumnos";
                $result = mysqli_query($conn, $sql);

                // Verificar si hay resultados
                if ($result->num_rows > 0) {
                    // Iterar sobre los resultados y mostrar en el formulario
                    while ($row = $result->fetch_assoc()) {
                        echo "<div>
                                <img src='../php/" . htmlspecialchars($row["Fotografia"]) . "' alt='Avatar' id='img' />
                                <input type='file' name='fotousuario' id='foto' accept='image/*' />
                                <label for='foto'>Agregar foto de perfil</label>
                            </div>";

                        echo "<div>
                                <input type='number' placeholder='Matricula' name='matricula' value='" . htmlspecialchars($row["Usuario"]) . "' required>
                            </div>";

                        echo "<div>
                                <input type='text' placeholder='Nombres' name='Nombres' value='" . htmlspecialchars($row["Nombres"]) . "' required>
                            </div>";

                        echo "<div>
                                <input type='text' placeholder='Apellido Paterno' name='apellido_paterno' value='" . htmlspecialchars($row["primApellido"]) . "' required>
                            </div>";

                        echo "<div>
                                <input type='text' placeholder='Apellido Materno' name='apellido_materno' value='" . htmlspecialchars($row["segApellido"]) . "' required>
                            </div>";

                        echo "<div>
                                <input type='email' placeholder='Correo Electrónico' name='correo' value='" . htmlspecialchars($row["Correo"]) . "' required><br>
                            </div>";

                        echo "<div class='genero'>
                                <label>Genero:</label>
                                Mujer<input type='radio' name='genero' value='Mujer' required onclick='ocultarOtroGenero()'>
                                Hombre<input type='radio' name='genero' value='Hombre' required onclick='ocultarOtroGenero()'>
                                Otro<input type='radio' name='genero' value='O' onchange='mostrarOcultarOtroGenero()'>
                            </div>";

                        echo "<div id='otro-genero' style='display:none;'>
                                <label for='otro-genero-texto'>Especifique su género:</label>
                                <input type='text' name='otro-genero-texto' id='otro-genero-texto' />
                            </div>";

                        echo "<div>
                                <label>Fecha de nacimiento: </label><input type='date' name='date' id='Fecha_de_Nacimiento' value='" . htmlspecialchars($row["Nacimiento"]) . "' required>
                            </div>";
                    }

                    // Liberar el conjunto de resultados
                    $result->free_result();
                } else {
                    // Mostrar mensaje si no hay resultados
                    echo "<p>No hay resultados</p>";
                }

                // Cerrar la conexión a la base de datos
                mysqli_close($conn);
            ?>

            <!-- Botones de Limpiar y Registrarse -->
            <div>
                <input type="reset" name="Limpiar" id="signIn-button" value="Limpiar">
            </div>

            <div>
                <button type="submit">Registrarse</button><a href = "../../index.html">Cancelar</a>
            </div>

        </form>
    </main>

    <!-- Inclusión del script externo para el manejo de eventos en el formulario -->
    <script src="../js/Registro.js"></script>

</body>

</html>
