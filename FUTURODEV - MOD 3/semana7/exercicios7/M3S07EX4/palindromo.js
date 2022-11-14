/* 1 - Crie uma função que receba uma string e retorne true se for um palíndromo, ou false, se não for.

Exemplo de palíndromo: arara
verificaPalindrome('arara')
Retorno esperado: true

verificaPalindrome('desenvolvimento')
Retorno esperado: false

*/

let palavra = 'reviver'
let array = []
let inversa = ''

function inverterString(palavra) {
    for (i=0; i < palavra.length; i++) {
        array.unshift(palavra.substr(i, 1))
    }
    inversa = array.join('')
    return inversa
}

function palindromo(palavra){
    if(palavra === inverterString(palavra)){
        return true
    }else {return false}
}

console.log(palindromo(palavra))