<?php
include "conexion.php";
$modo = 0;
    $imagen = '';
    if (isset($_FILES["fotousuario"])){
        $file = $_FILES["fotousuario"];
        $nombre = $file["name"];
        $ruta_provisional = $file["tmp_name"];
        $carpeta = "../images/Fotografias_de_Perfil/";
    }else{
        $imagen = "../images/Uroboros.jpg";
    }
    $src = $carpeta.$nombre;
    move_uploaded_file($ruta_provisional, $src);
    $imagen = "Fotografias_de_Perfil/".$nombre;

    // Obtenemos los demás datos del formulario
    $matricula = mysqli_real_escape_string($conn, $_POST['matricula']);
    $primer_apellido = mysqli_real_escape_string($conn, $_POST['apellido_paterno']);
    $segundo_apellido = mysqli_real_escape_string($conn, $_POST['apellido_materno']);
    $nombre = mysqli_real_escape_string($conn, $_POST['Nombres']);
    $correo = mysqli_real_escape_string($conn, $_POST['correo']);
    $genero = mysqli_real_escape_string($conn, $_POST['genero']);
    $fecha_nacimiento = mysqli_real_escape_string($conn, $_POST['date']);    

    // Si el género es "Otro", obtenemos el texto correspondiente
    if ($genero == "O") {
        $genero = mysqli_real_escape_string($conn, $_POST['otro-genero-texto']);
    }
    if ($modo == 1) {

        // Sentencia SQL para actualizar los campos en la tabla
        $sql = $conn->prepare("UPDATE alumnos SET Usuario = ?, primApellido = ?, segApellido = ?, Nombres = ?, Correo = ?, Genero = ?, Nacimiento = ?, Fotografia = ? WHERE Usuario = ?");
        $sql->bind_param("sssssssss", $matricula, $primer_apellido, $segundo_apellido, $nombre, $correo, $genero, $fecha_nacimiento, $imagen, $matricula);

        // Verifica si ocurrieron errores durante la ejecución de la consulta
        if ($sql->execute() === FALSE) {
            echo "
            <script>
                alert('Error al actualizar el registro');
                window.location.href = '../paginas_emergentes/Registro.html';
            </script> " . $sql->error;
        } else {
            // El usuario se registró con éxito, redirigir al usuario a la página principal
            echo "
                <script>
                    alert('Registro actualizado correctamente!!!');
                    window.location.href = '../../index.html';
                </script>
            ";
        }

    } else {
        // Verificamos si el usuario ya existe
        $verificacion = "SELECT * FROM alumnos WHERE Usuario = '$matricula'";
        $resultado = mysqli_query($conn, $verificacion);

        if (mysqli_num_rows($resultado) > 0) {
            // El usuario ya existe, redirigir al usuario a la página principal
            echo "
                <script>
                    alert('El usuario que ingresó ya existe');
                    window.location.href = '../../index.html';
                </script>
            ";
        }
        // Prepara la consulta SQL con prevención de inyección de SQL
        $sql = $conn->prepare("INSERT INTO alumnos (Usuario, primApellido, segApellido, Nombres, Correo, Genero, Nacimiento, Fotografia) VALUES (?, ?, ?, ?, ?, ?, ?, ?)");
        // Vincula los parámetros y ejecuta la consulta
        $sql->bind_param("ssssssss", $matricula, $primer_apellido, $segundo_apellido, $nombre, $correo, $genero, $fecha_nacimiento, $imagen);
        $sql->execute();

        // Verifica si ocurrieron errores durante la ejecución de la consulta
        if ($sql->errno) {
             echo "
            <script>
                alert('Error en la ejecución de la consulta');
                window.location.href = '../paginas_emergentes/Registro.html';
            </script> " . $sql->error;
        } else {
            // El usuario se registró con éxito, redirigir al usuario a la página principal
            echo "
                <script>
                    alert('El usuario se registró con éxito!!!');
                    window.location.href = '../../index.html';
                </script>
            ";
        }

        // Cierra la consulta
        $sql->close();
    }
?>
