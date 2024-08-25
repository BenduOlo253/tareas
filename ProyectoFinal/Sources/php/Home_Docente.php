<?php
// Incluir el archivo de conexión a la base de datos
include "conexion.php";

// Consulta SQL para obtener datos de la base de datos
$sql = "SELECT * FROM alumnos";
$result = mysqli_query($conn, $sql);

// Verificar si hay resultados
if ($result) {
    // Crear la estructura básica del HTML con estilos CSS en el head
    echo "<html>
            <head>
                <link rel='stylesheet' href='../css/Docentes.css'>
                <script>        
                    function acerca_de() {
                        // Especifica la URL y otros parámetros de la nueva ventana
                        var url = '../paginas_emergentes/acerca_de.html';
                        var nombreVentana = '_blank';
                        var opciones = 'width=600,height=400';
            
                        // Abre la nueva ventana
                        window.open(url, nombreVentana, opciones);
                    }
                </script>
            </head>";

    // Cuerpo del documento HTML
    echo "<body>
            <!-- Menú de navegación -->
            <ul class='menu'>
                <li><a href='#' onclick='acerca_de()'>Acerca de</a></li>
                <li><a href='#'>Opciones</a>
                    <ul class='submenu'>
                        <li><a href='../../index.html'>Cerrar sesión</a></li>
                    </ul>
                </li>
            </ul>
            <h1>Lista de Alumnos</h1>";

    // Verificar si hay al menos un resultado
    if (mysqli_num_rows($result) > 0) {
        // Crear la tabla y encabezados
        echo "<table>
                    <tr>
                        <th>Usuario</th>
                        <th>Contraseña</th>
                        <th>Nombres</th>
                        <th>Primer Apellido</th>
                        <th>Segundo Apellido</th>
                        <th>Correo</th>
                        <th>Nacimiento</th>
                        <th>Fotografía</th>
                    </tr>";

        // Iterar sobre los resultados y mostrar en la tabla
        while ($row = mysqli_fetch_assoc($result)) {
            echo "<tr>
                    <td>" . htmlspecialchars($row["Usuario"]) . "</td>
                    <td>" . htmlspecialchars($row["Contraseña"]) . "</td>
                    <td>" . htmlspecialchars($row["Nombres"]) . "</td>
                    <td>" . htmlspecialchars($row["primApellido"]) . "</td>
                    <td>" . htmlspecialchars($row["segApellido"]) . "</td>
                    <td>" . htmlspecialchars($row["Correo"]) . "</td>
                    <td>" . date("d/m/Y", strtotime($row["Nacimiento"])) . "</td>
                    <td><img src='../images/" . htmlspecialchars($row["Fotografia"]) . "' alt='Foto del usuario'></td>
                </tr>";
        }

        // Cerrar la tabla
        echo "</table>";
    } else {
        // Mostrar mensaje si no hay resultados
        echo "<p>No hay resultados</p>";
    }

    // Cerrar el cuerpo y el HTML
    echo "</body>
        </html>";

    // Liberar el conjunto de resultados
    mysqli_free_result($result);
} else {
    // Mostrar mensaje de error si la consulta falla
    echo "Error en la consulta: " . mysqli_error($conn);
}

// Cerrar la conexión a la base de datos
mysqli_close($conn);
?>
