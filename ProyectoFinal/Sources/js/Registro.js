// Definición de la URL de la imagen por defecto
const defaultFile = 'https://th.bing.com/th/id/R.9aa85e332b03e2559e476b8d14b2def9?rik=E6uwz7gAOpTwgw&pid=ImgRaw&r=0';

// Obtiene referencia al elemento de entrada de archivo y a la etiqueta de la imagen
const file = document.getElementById('foto');
const img = document.getElementById('img');

// Añade un event listener al cambio en el elemento de entrada de archivo
file.addEventListener('change', e => {
  // Verifica si se seleccionó un archivo
  if (e.target.files[0]) {
    // Crea un objeto FileReader para leer el contenido del archivo
    const reader = new FileReader();

    // Función que se ejecuta al cargar el contenido del archivo
    reader.onload = function (e) {
      // Actualiza la fuente de la imagen con los datos codificados en base64 del archivo
      img.src = e.target.result;
    };

    // Lee el contenido del archivo como datos URL (base64)
    reader.readAsDataURL(e.target.files[0]);
  } else {
    // Si no se selecciona ningún archivo, muestra la imagen por defecto
    img.src = defaultFile;
  }
});