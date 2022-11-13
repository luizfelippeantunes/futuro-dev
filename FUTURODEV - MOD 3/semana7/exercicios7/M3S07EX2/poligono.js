/*
2 - Crie uma lógica que receba o número de lados de um polígono regular e a medida do lado (em cm). 
Deve-se calcular e consolar o seguinte:
Se o número de lados for igual a 3 escrever "triângulo" e o valor da área
Se o número de lados for igual a 4 escrever "quadrado" e o valor da área.
Se o número de lados for igual a 5 escrever "pentágono" e o valor da área.
Caso o número de lados seja inferior a 3 escrever "não é polígono".
*/

let lados = 5
let medida = 5
let area = 0

function poligono(lados, medida) {

    if (lados < 3) {
        console.log('Nao é um polígono.')
    } else if (lados == 3) {
        area = (medida * medida) / 2
        console.log('É um triângulo de área: ' + area.toFixed(2))
    } else if (lados == 4) {
        area = medida * medida
        console.log('É um quadrado de área: ' + area.toFixed(2))
    } else if (lados == 5) {
        area = (5 * Math.pow(medida, 2)) / (4 * Math.sqrt((5 - 2 * Math.sqrt(5))))
        console.log('É um pentagono de área: ' + area.toFixed(2))
    } else {
        console.log('Quantidade de lados inválida.')
    }
}

poligono(lados, medida)
