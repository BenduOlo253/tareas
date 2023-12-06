
function habilitarEdicion() {
    document.getElementById("datosForm").reset();
    document.getElementById("datosForm").style.display = "block";
    document.getElementById("nombres").style.display = "none";
    document.getElementById("nuevosNombres").style.display = "inline-block";

    document.getElementById("apellidoPaterno").style.display = "none";
    document.getElementById("nuevoApellidoPaterno").style.display = "inline-block";

    document.getElementById("apellidoMaterno").style.display = "none";
    document.getElementById("nuevoApellidoMaterno").style.display = "inline-block";

    document.getElementById("correoElectronico").style.display = "none";
    document.getElementById("nuevoCorreoElectronico").style.display = "inline-block";

    document.getElementById("genero").style.display = "none";
    document.getElementById("nuevoGenero").style.display = "inline-block";

    document.getElementById("matricula").style.display = "none";
    document.getElementById("nuevaMatricula").style.display = "inline-block";

    document.querySelector('button[onclick="habilitarEdicion()"]').style.display = "none";
    document.querySelector('button[onclick="guardarCambios()"]').style.display = "block";
}

function guardarCambios() {
    var nuevosNombres = document.getElementById("nuevosNombres").value;
    var nuevoApellidoPaterno = document.getElementById("nuevoApellidoPaterno").value;
    var nuevoApellidoMaterno = document.getElementById("nuevoApellidoMaterno").value;
    var nuevoCorreoElectronico = document.getElementById("nuevoCorreoElectronico").value;
    var nuevoGenero = document.getElementById("nuevoGenero").value;
    var nuevaMatricula = document.getElementById("nuevaMatricula").value;

    // Realiza la solicitud AJAX para enviar los nuevos datos al servidor
    fetch('actualizar_datos.php', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/x-www-form-urlencoded',
        },
        body: 'nuevosNombres=' + encodeURIComponent(nuevosNombres) +
              '&nuevoApellidoPaterno=' + encodeURIComponent(nuevoApellidoPaterno) +
              '&nuevoApellidoMaterno=' + encodeURIComponent(nuevoApellidoMaterno) +
              '&nuevoCorreoElectronico=' + encodeURIComponent(nuevoCorreoElectronico) +
              '&nuevoGenero=' + encodeURIComponent(nuevoGenero) +
              '&nuevaMatricula=' + encodeURIComponent(nuevaMatricula)
    })
    .then(response => response.json())
    .then(data => {
        console.log(data); // Maneja la respuesta del servidor (éxito o error)
    })
    .catch(error => {
        console.error('Error:', error);
    });

    // Restablece la interfaz después de guardar cambios
    document.getElementById("datosForm").style.display = "none";
    document.getElementById("nombres").style.display = "inline-block";
    document.getElementById("nuevosNombres").style.display = "none";

    document.getElementById("apellidoPaterno").style.display = "inline-block";
    document.getElementById("nuevoApellidoPaterno").style.display = "none";

    document.getElementById("apellidoMaterno").style.display = "inline-block";
    document.getElementById("nuevoApellidoMaterno").style.display = "none";

    document.getElementById("correoElectronico").style.display = "inline-block";
    document.getElementById("nuevoCorreoElectronico").style.display = "none";

    document.getElementById("genero").style.display = "inline-block";
    document.getElementById("nuevoGenero").style.display = "none";

    document.getElementById("matricula").style.display = "inline-block";
    document.getElementById("nuevaMatricula").style.display = "none";

    document.querySelector('button[onclick="habilitarEdicion()"]').style.display = "block";
    document.querySelector('button[onclick="guardarCambios()"]').style.display = "none";
}