// URL de la imagen por defecto
const defaultFile = 'https://stonegatesl.com/wp-content/uploads/2021/01/avatar-300x300.jpg';

// Obtener elementos del DOM
const file = document.getElementById('foto');
const img = document.getElementById('img');

// Agregar un event listener al cambio de archivo en el input
file.addEventListener('change', e => {
  // Verificar si se seleccionó un archivo
  if (e.target.files[0]) {
    // Crear un objeto FileReader para leer el archivo
    const reader = new FileReader();
    
    // Configurar la función que se ejecutará al cargar el archivo
    reader.onload = function (e) {
      // Cambiar la fuente de la imagen al contenido del archivo cargado
      img.src = e.target.result;
    };

    // Leer el archivo como una URL de datos (data URL)
    reader.readAsDataURL(e.target.files[0]);
  } else {
    // Si no se selecciona un archivo, mostrar la imagen por defecto
    img.src = defaultFile;
  }
});
