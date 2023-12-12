<!-- Home_Alumno.php -->
<!DOCTYPE html>
<html lang='es'>
<head>
    <!-- Configuración del documento -->
    <meta charset='UTF-8'>
    <meta name='viewport' content='width=device-width, initial-scale=1.0'>
    <title>Página de Inicio del Usuario</title>

    <!-- Script para abrir una nueva ventana -->
    <script>
        function acerca_de() {
            // Especifica la URL y otros parámetros de la nueva ventana
            var url = "acerca_de.html";
            var nombreVentana = "_blank";
            var opciones = "width=600,height=400";
            // Abre la nueva ventana
            window.open(url, nombreVentana, opciones);
        }
    </script>

    <!-- Enlace al archivo de estilo CSS -->
    <link rel='stylesheet' href='../css/Home_Alumno.css'>
</head>
<?php
// Incluye el archivo de conexión a la base de datos y comienza la sesión
include "../php/conexion.php";
session_start();

// Verifica si el usuario está autenticado
if (!isset($_SESSION['username'])) {
    header("Location: ../../index.html"); // Redirige al usuario si no está autenticado
    exit();
}

// Obtiene la matrícula del usuario de la sesión
$matricula = $_SESSION['username'];

// Consulta SQL para obtener datos de la base de datos
$sql = "SELECT * FROM alumnos WHERE Matricula = ?";
$stmt = mysqli_prepare($conn, $sql);
mysqli_stmt_bind_param($stmt, "s", $matricula);
mysqli_stmt_execute($stmt);
$result = mysqli_stmt_get_result($stmt);

if ($result->num_rows > 0) {
    // Obtiene los datos del usuario
    $userData = $result->fetch_assoc();

    // Muestra la estructura HTML de la página
    echo "
        <body>
            <!-- Menú de navegación -->
            <ul class='menu'>
                <li><a href='Home_Alumno.php'>Inicio</a></li>
                <li><a href='#' onclick='acerca_de()'>Acerca de</a></li>
                <li class='submenu'><a href='#'>Opciones</a>
                    <ul class='submenu'>
                        <li><a href='Editar_Perfil.php'>Editar datos</a></li>
                        <li><a href='../../index.html'>Cerrar sesión</a></li>
                    </ul>
                </li>
            </ul>

            <!-- Contenido principal -->
            <main>
                <!-- Saludo de bienvenida -->
                <h1>Bienvenido, <span id='nombreUsuario'>" . $userData['Usuario'] . "</span>!</h1>
                
                <!-- Formulario con los datos del usuario -->
                <form class='Datos_Usuario'>
                    <div>
                        <!-- Mostrar la fotografía del usuario -->
                        <img src='../images/" . $userData["Fotografia"] . "' alt='Foto del usuario'><br>
                    </div>
                    <div>
                        <!-- Mostrar la matrícula del usuario -->
                        <strong>Matricula: </strong> <span id='nombres'>" . $userData['Matricula'] . "</span><br>
                    </div>
                    <div>
                        <!-- Mostrar los nombres del usuario -->
                        <strong>Nombres:</strong> <span id='nombres'>" . $userData['Nombres'] . "</span><br>
                    </div>
                    <div>
                        <!-- Mostrar los apellidos del usuario -->
                        <strong>Apellidos:</strong> <span id='nombres'>". $userData['primApellido'] . " " . $userData['segApellido'] . "</span><br>
                    </div>
                    <div>
                        <!-- Mostrar el género del usuario -->
                        <strong>Genero: </strong> <span id='nombres'>" . $userData['Genero'] . "</span><br>
                    </div>
                    <div>
                        <!-- Mostrar la fecha de nacimiento del usuario -->
                        <strong>Fecha de nacimiento: </strong> <span id='nombres'>" . $userData['Nacimiento'] . "</span><br>
                    </div>
                    <div>
                        <!-- Mostrar el correo del usuario -->
                        <strong>Correo: </strong> <span id='nombres'>" . $userData['Correo'] . "</span><br>
                    </div>
                </form>
            </main>
        </body>
    ";
} else {
    echo "0 resultados.";
}

// Cierra la declaración preparada
mysqli_stmt_close($stmt);
?>
</html>
