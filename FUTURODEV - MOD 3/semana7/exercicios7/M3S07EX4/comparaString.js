/*
7 - Crie uma função que receba uma string word e outra string ending. Verifique se a string ending é o final da string word. Considere que a string ending sempre será menor que a string word.
Valor de teste: 'roberto' e 'rto'
Valor esperado no retorno da função: true

verificaFimPalavra('roberto', 'rto');
Retorno esperado: true

verificaFimPalavra('joaofernando', 'fernan');
Retorno esperado: false
*/

let nome1 = 'roberto'
let finalNome1 = 'rto'
let nome2 = 'joaofernando'
let finalNome2 = 'fernan'

function comparaString(word, ending){
    let qtd = ending.length
    if (word.substring(word.length-qtd,word.length) === ending){
        return true
    } else {return false}
}

console.log(comparaString(nome1, finalNome1))
console.log(comparaString(nome2, finalNome2))