/*
2 - Crie uma função que receba um array de inteiros e retorne o índice do maior valor.
Array de teste: [2, 3, 6, 7, 10, 1];.
Valor esperado no retorno da função: 4.
*/

let inteiros = [2, 3, 6, 7, 10, 1]

function indiceMaior(lista){
    console.log(lista.indexOf(Math.max.apply(null, lista)))
}

indiceMaior(inteiros)