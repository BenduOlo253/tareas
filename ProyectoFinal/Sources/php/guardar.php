<?php
// Incluir el archivo de conexión a la base de datos
include "conexion.php";

// Obtener el modo de operación del formulario (1 para actualizar, otro para registrar)
$modo = mysqli_real_escape_string($conn, $_POST["Actualizar_Usuario"]);

// Modo 1: Actualizar usuario existente
if ($modo == "1") {
    // Iniciar sesión
    session_start();

    // Verificar si el usuario está autenticado
    if (!isset($_SESSION['username'])) {
        header("Location: ../../index.html"); // Redirige al usuario si no está autenticado
        exit();
    }

    $matricula = $_SESSION['username'];

    // Verificar si se cargó un archivo de imagen
    if (isset($_FILES["fotousuario"])) {
        // Procesar la imagen y almacenarla en el servidor
        $file = $_FILES["fotousuario"];
        $nombre = $file["name"];
        $ruta_provisional = $file["tmp_name"];
        $carpeta = "../images/Fotografias_de_Perfil/";
        $src = $carpeta . $nombre;
        move_uploaded_file($ruta_provisional, $src);
        $imagen = "Fotografias_de_Perfil/" . $nombre;
    }

    // Obtener otros datos del formulario
    $Usuario = mysqli_real_escape_string($conn, $_POST['Usuario']);
    $contraseña = mysqli_real_escape_string($conn, $_POST['Contraseña']);
    $primer_apellido = mysqli_real_escape_string($conn, $_POST['apellido_paterno']);
    $segundo_apellido = mysqli_real_escape_string($conn, $_POST['apellido_materno']);
    $nombre = mysqli_real_escape_string($conn, $_POST['Nombres']);
    $correo = mysqli_real_escape_string($conn, $_POST['correo']);
    $genero = mysqli_real_escape_string($conn, $_POST['genero']);
    $fecha_nacimiento = mysqli_real_escape_string($conn, $_POST['date']);

    // Si el género es "Otro", obtener el texto correspondiente
    if ($genero == "O") {
        $genero = mysqli_real_escape_string($conn, $_POST['otro-genero-texto']);
    }

    // Preparar la sentencia SQL para actualizar los campos en la tabla
    $sql = $conn->prepare("UPDATE alumnos SET Usuario = ?, Contraseña = ?, primApellido = ?, segApellido = ?, Nombres = ?, Correo = ?, Genero = ?, Nacimiento = ?, Fotografia = ? WHERE Matricula = ?");
    $sql->bind_param("ssssssssss", $Usuario, $contraseña, $primer_apellido, $segundo_apellido, $nombre, $correo, $genero, $fecha_nacimiento, $imagen, $matricula);

    // Verificar si ocurrieron errores durante la ejecución de la consulta
    if ($sql->execute() == FALSE) {
        echo "
        <script>
            alert('Error al actualizar el registro');
            window.location.href = '../paginas_emergentes/prueba.php';
        </script> ";
    } else {
        // Éxito al actualizar, redirigir al usuario a la página de edición de perfil
        echo "
            <script>
                alert('Registro actualizado correctamente!!!');
                window.location.href ='../paginas_emergentes/Editar_Perfil.php';
            </script>
        ";
    }

} else {
    // Modo distinto de 1: Registrar nuevo usuario

    // Establecer una imagen predeterminada
    $imagen = 'https://th.bing.com/th/id/R.b2b34517339101a111716be1c203f354?rik=e5WHTShSpipi3Q&pid=ImgRaw&r=0';

    // Verificar si se cargó un archivo de imagen
    if (isset($_FILES["fotousuario"])) {
        // Procesar la imagen y almacenarla en el servidor
        $file = $_FILES["fotousuario"];
        $nombre = $file["name"];
        $ruta_provisional = $file["tmp_name"];
        $carpeta = "../images/Fotografias_de_Perfil/";
        $src = $carpeta . $nombre;
        move_uploaded_file($ruta_provisional, $src);
        $imagen = "Fotografias_de_Perfil/" . $nombre;
    }

    // Obtener otros datos del formulario
    $matricula = mysqli_real_escape_string($conn, $_POST['Matricula']);
    $Usuario = mysqli_real_escape_string($conn, $_POST['Usuario']);
    $contraseña = mysqli_real_escape_string($conn, $_POST['Contraseña']);
    $primer_apellido = mysqli_real_escape_string($conn, $_POST['apellido_paterno']);
    $segundo_apellido = mysqli_real_escape_string($conn, $_POST['apellido_materno']);
    $nombre = mysqli_real_escape_string($conn, $_POST['Nombres']);
    $correo = mysqli_real_escape_string($conn, $_POST['correo']);
    $genero = mysqli_real_escape_string($conn, $_POST['genero']);
    $fecha_nacimiento = mysqli_real_escape_string($conn, $_POST['date']);

    // Si el género es "Otro", obtener el texto correspondiente
    if ($genero == "O") {
        $genero = mysqli_real_escape_string($conn, $_POST['otro-genero-texto']);
    }

    // Verificar si el usuario ya existe
    $verificacion = "SELECT * FROM alumnos WHERE Matricula = '$matricula'";
    $resultado = mysqli_query($conn, $verificacion);

    if (mysqli_num_rows($resultado) > 0) {
        // El usuario ya existe, redirigir al usuario a la página principal
        echo "
            <script>
                alert('El usuario que ingresó ya existe');
                window.location.href = '../../index.html';
            </script>
        ";
    } else {
        // Preparar la consulta SQL con prevención de inyección de SQL
        $sql = $conn->prepare("INSERT INTO alumnos (Matricula, Usuario, Contraseña, primApellido, segApellido, Nombres, Correo, Genero, Nacimiento, Fotografia) VALUES (?,?, ?, ?, ?, ?, ?, ?, ?, ?)");
        // Vincular los parámetros y ejecutar la consulta
        $sql->bind_param("ssssssssss", $matricula, $Usuario, $contraseña, $primer_apellido, $segundo_apellido, $nombre, $correo, $genero, $fecha_nacimiento, $imagen);
        $sql->execute();

        // Verificar si ocurrieron errores durante la ejecución de la consulta
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
    }
    // Cerrar la consulta
    $sql->close();
}

// Cerrar la conexión a la base de datos
mysqli_close($conn);
?>
