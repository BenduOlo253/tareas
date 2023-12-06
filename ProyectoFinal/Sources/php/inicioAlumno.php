<?php
// Incluye el archivo de conexión a la base de datos
include 'conexion.php';

// Obtiene los datos del formulario
$User = $_POST['Usuario'];
$Contraseña = $_POST['Pass'];

// Verifica si las credenciales corresponden al administrador
if ($User == "0000" && $Contraseña == "admin") {
    echo "
        <script>
            alert('Usted ha iniciado sesión como administrador');
            window.location.href = '../php/Docentes.php';
        </script>
    ";
} else {
    // Consulta SQL para verificar las credenciales del usuario en la base de datos
    $sql = "SELECT * FROM alumnos WHERE Usuario = '$User' AND Contraseña = '$Contraseña'";

    $result = mysqli_query($conn, $sql);

    if ($result->num_rows > 0) {
        // Credenciales correctas, redirigir al usuario a su página principal
        echo "
            <script>
                alert('Inicio de sesión exitoso');
                window.location.href = '../paginas_emergentes/pagina_principalAlumno1.php';
            </script>
        ";
    } else {
        // El usuario no existe, redirigir al usuario a la página de inicio
        echo "
            <script>
                alert('El usuario que usted ingresó no existe');
                window.location.href = '../../index.html';
            </script>
        ";
    }
}
?>

