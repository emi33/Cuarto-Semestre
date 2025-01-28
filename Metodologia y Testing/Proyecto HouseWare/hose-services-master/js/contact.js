window.addEventListener("DOMContentLoaded", (event) => {
  document.getElementById("service").addEventListener("change", function () {
    const professionalSelect = document.getElementById("professional");
    professionalSelect.innerHTML = ""; // Limpiar las opciones anteriores

    const service = this.value;
    let options = [];

    switch (service) {
      case "electricidad":
        options = ["Juan", "Carlos", "Exequiel"];
        break;
      case "plomeria":
        options = ["Fernando", "Ignacio", "Carlos"];
        break;
      case "carpinteria":
        options = ["Luz", "Lucia", "Gabriel"];
        break;
      case "gas":
        options = ["Juana", "Luis", "Martin"];
        break;
      default:
        options = []; // En caso de que no se seleccione nada o una opción no válida
    }

    // Agregar la opción por defecto
    const defaultOption = document.createElement("option");
    defaultOption.value = "";
    defaultOption.textContent = "Seleccione un profesional";
    defaultOption.selected = true;
    defaultOption.disabled = true;
    professionalSelect.appendChild(defaultOption);

    // Agregar las nuevas opciones al desplegable de profesionales
    options.forEach(function (professional) {
      const optionElement = document.createElement("option");
      optionElement.value = professional.toLowerCase().replace(/\s+/g, "-");
      optionElement.textContent = professional;
      professionalSelect.appendChild(optionElement);
    });
  });
  document
    .getElementById("contactForm")
    .addEventListener("submit", function (event) {
      event.preventDefault(); // Evita el envío real del formulario para demostración

      // Obtén el contenedor del mensaje de confirmación
      const confirmationMessageContainer = document.getElementById(
        "confirmationMessage"
      );
      confirmationMessageContainer.textContent =
        "Su consulta fue enviada con éxito, a la brevedad estaremos comunicándonos";
      confirmationMessageContainer.style.color = "green"; // Cambia el color del texto
      confirmationMessageContainer.style.fontWeight = "bold"; // Texto en negrita
      confirmationMessageContainer.style.display = "block"; // Muestra el mensaje

      // Ocultar el mensaje después de 3 segundos (3000 ms)
      setTimeout(() => {
        confirmationMessageContainer.style.display = "none"; // Oculta el mensaje
      }, 3000);

      // Opcional: limpiar el formulario después de enviar
      document.getElementById("contactForm").reset();
    });
});
