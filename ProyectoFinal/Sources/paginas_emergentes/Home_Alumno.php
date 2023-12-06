<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Currículum Vitae</title>
    <link rel = "stylesheet" href = "../">
</head>
<body>
    <div id="contenido">
        <div id="datos-container">
            <h1>Currículum Vitae</h1>

            <form id="datosForm">
                <div class="datos">
                    <strong>Nombres:</strong> <span id="nombres">Juan</span>
                    <input type="text" id="nuevosNombres" name="nuevosNombres" style="display:none;">
                </div>

                <div class="datos">
                    <strong>Apellido Paterno:</strong> <span id="apellidoPaterno">Pérez</span>
                    <input type="text" id="nuevoApellidoPaterno" name="nuevoApellidoPaterno" style="display:none;">
                </div>

                <div class="datos">
                    <strong>Apellido Materno:</strong> <span id="apellidoMaterno">Gómez</span>
                    <input type="text" id="nuevoApellidoMaterno" name="nuevoApellidoMaterno" style="display:none;">
                </div>

                <div class="datos">
                    <strong>Correo Electrónico:</strong> <span id="correoElectronico">juan.perez@example.com</span>
                    <input type="text" id="nuevoCorreoElectronico" name="nuevoCorreoElectronico" style="display:none;">
                </div>

                <div class="datos">
                    <strong>Género:</strong> <span id="genero">Masculino</span>
                    <input type="text" id="nuevoGenero" name="nuevoGenero" style="display:none;">
                </div>

                <div class="datos">
                    <strong>Matrícula:</strong> <span id="matricula">123456</span>
                    <input type="text" id="nuevaMatricula" name="nuevaMatricula" style="display:none;">
                </div>

                <button type="button" onclick="habilitarEdicion()">Editar Datos</button>
                <button type="button" style="display:none;" onclick="guardarCambios()">Guardar Cambios</button>
            </form>
        </div>
    </div>
    <script src = "../js/scriptPagAl.js"></script>
</body>
</html>