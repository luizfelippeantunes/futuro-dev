  let visor = ""
  let anterior = ""
  let num1 = ""
  let num2 = ""
  let resultado = ""
  function tecla(tecla){
    if(tecla == "=") {
        console.log(visor + "\n" + eval(visor))
      document.getElementById('result').innerHTML=eval(visor)
    }
    if (tecla == "+" || tecla == "-" || tecla == "*" || tecla == "/") {
      if (num1 == "") {
        resultado = visor
        visor = visor + tecla
      } else {
        operacao = tecla
        visor = visor + tecla
      }
    } else {
      visor = visor + tecla
    }

    document.getElementById('result').innerHTML = visor
  }
