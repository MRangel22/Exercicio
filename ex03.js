var inpA = document.getElementById("inpA");
var div = document.getElementById("d-resultado");

function mostrarClas() {
  var anos = inpA.value;
  var exp;
  if (anos >= 0 && anos <= 1) {
    exp = "Iniciante";
  } else if (anos > 1 && anos <= 3) {
    exp = "Intermediário";
  } else if (anos > 3 && anos <= 6) {
    exp = "Avançado";
  } else {
    exp = "Jedi Master";
  }

  div.innerText = exp;
}
