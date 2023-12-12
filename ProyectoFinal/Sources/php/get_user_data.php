<?php
// get_user_data.php

// Conecta a tu base de datos (usando los mismos datos de conexión que login.php)

session_start();

// Verifica si el usuario está autenticado
if (!isset($_SESSION['username'])) {
    header("Location: login.html"); // Redirige al usuario si no está autenticado
    exit();
}

$username = $_SESSION['username'];

// Obtén los datos del usuario desde la base de datos
$sql = "SELECT * FROM alumnos WHERE matricula = '$username'";
$result = $conn->query($sql);

if ($result->num_rows > 0) {
    $userData = $result->fetch_assoc();
    echo json_encode($userData);
} else {
    echo "Error al obtener datos del usuario.";
}

$conn->close();
?>
