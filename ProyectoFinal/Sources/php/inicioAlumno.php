<?php
    include 'conexion.php';
    
    // Obtiene los datos del formulario
    $User = $_POST['Usuario'];
    $Contraseña = $_POST['Pass'];
    $opcion = $_POST['login_option'];

    if($opcion == "Docente" && ($User == "0000" && $Contraseña == "EQUISDE")){
        echo "
            <script>
                alert('Usted ha iniciado sesion como administrador');
                window.location.href = '../html/pagina_principalDocente.html';
            </script>
        ";
    }



    // Consulta SQL para verificar las credenciales del usuario
    $sql = "SELECT * FROM alumnos WHERE Usuario = '$User' AND Contraseña = '$Contraseña'";

    $ejecutar = mysqli_query($conexion, $sql);

    if ($ejecutar->num_rows > 0) {
        // Aquí puedes redirigir al usuario a su página principal, por ejemplo
        echo "
            <script>
                alert('Inicio de sesion exitoso');
                window.location.href = '../html/pagina_principalAlumno.html';
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
