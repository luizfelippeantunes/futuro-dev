/*
6 - Crie uma função que receba um número natural (número inteiro não negativo) N e retorne o somatório de todos os números de 1 até N.
Valor de teste: N = 5.
Valor esperado no retorno da função: 1+2+3+4+5 = 15.

Fórmula P.A.: Soma = (a1 + an)*n/2
*/

let numero = 5

function progressaoAritmetica(numero){
    let soma = (1+numero)*numero/2
    return soma
}

console.log(progressaoAritmetica(numero))