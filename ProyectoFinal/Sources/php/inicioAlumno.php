<?php
    include 'conexion.php';
    
    // Obtiene los datos del formulario
    $User = $_POST['Usuario'];
    $Contraseña = $_POST['Pass'];

    // Consulta SQL para verificar las credenciales del usuario
    $sql = "SELECT * FROM alumnos WHERE Usuario = '$User' AND Contraseña = '$Contraseña'";

    $ejecutar = mysqli_query($conexion, $sql);

    if ($ejecutar->num_rows > 0) {
        // Aquí puedes redirigir al usuario a su página principal, por ejemplo
        ob_start();
        header("Location: ../Sources/pagina_principal.html");
        ob_end_flush();
    } else {
        echo "Matrícula o contraseña incorrecta";
        ob_start();
        header("Location: ../Sources/index.html");
        ob_end_flush();
    }
?>
