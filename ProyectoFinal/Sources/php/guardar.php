<?php
    include 'conexion.php';

    // Obtiene los datos del formulario
    $nombre = $_POST['nombres'];
    $primer_apellido = $_POST['apellido_paterno'];
    $segundo_apellido = $_POST['apellido_materno'];
    $correo = $_POST['correo'];
    $nacimiento = $_POST['date'];
    $genero = $_POST['genero'];
    $matricula = $_POST['matricula'];
    

    if($genero == "O"){
        $genero = $_POST['otro-genero-texto'];
    }
    // Prepara la consulta SQL
    $sql = "INSERT INTO alumnos (Usuario, Nombres, primApellido, segApellido, Correo, Genero, Nacimiento) 
            VALUES ('$matricula', '$nombre', '$primer_apellido', '$segundo_apellido', '$correo', '$genero', '$nacimiento')";


    $verificarmat = mysqli_query($conexion, "SELECT * from alumnos WHERE Usuario = '$matricula'");
    
    $ejecutar = mysqli_query($conexion, $sql);

    if($ejecutar){
        echo "
            <script>
                alert('Usuario almacenado exitosamente');
                window.location.href = '../../index.html';
            </script>
        ";
    }else{
        echo "
            <script>
                alert('Error al almacenar los datos');
                window.location.href = '../../index.html';
            </script>
        ";
    }
?>
