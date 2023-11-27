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
        echo "
            <script>
                alert('Inicio de sesion exitoso');
                window.location.href = '../../pagina_principal.html';
            </script>
        ";
    } else {
        echo "
            <script>
                alert('El usuario que usted ingresó no existe');
                window.location.href = '../../index.html';
            </script>
        ";
    }
?>
