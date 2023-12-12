<?php
// Incluye el archivo de conexión a la base de datos
include 'conexion.php';

// Obtiene los datos del formulario
$User = $_POST['Matricula'];
$Contraseña = $_POST['Pass'];

// Verifica si las credenciales corresponden al administrador
if ($User == "0000" && $Contraseña == "admin") {
    echo "
        <script>
            alert('Usted ha iniciado sesión como administrador');
            window.location.href = 'Home_Docente.php';
        </script>
    ";
} else {
    // Consulta SQL para verificar las credenciales del usuario en la base de datos
    $sql = "SELECT * FROM alumnos WHERE Matricula = ? AND Contraseña = ?";
    $stmt = mysqli_prepare($conn, $sql);
    mysqli_stmt_bind_param($stmt, "ss", $User, $Contraseña);
    mysqli_stmt_execute($stmt);
    mysqli_stmt_store_result($stmt);

    if (mysqli_stmt_num_rows($stmt) == 1) {
        // Inicio de sesión exitoso, redirige al usuario a su página principal
        session_start();
        $_SESSION['username'] = $User; // Almacena la matrícula del usuario en la sesión
        echo "
            <script>
                alert('Inicio de sesión exitoso');
                window.location.href = '../paginas_emergentes/Home_Alumno.php';
            </script>
        ";
    } else{
        // El usuario no existe o la contraseña es incorrecta, redirige al usuario a la página de inicio
        echo "
            <script>
                alert('El usuario o la contraseña son incorrectos');
                window.location.href = '../../index.html';
            </script>
        ";
    }

    // Cierra la declaración preparada
    mysqli_stmt_close($stmt);
}

// Cierra la conexión a la base de datos
mysqli_close($conn);
?>
