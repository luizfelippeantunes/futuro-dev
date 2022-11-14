/*
4 - Crie uma função que receba um array de nomes e retorne o nome com a maior quantidade de caracteres.
Array de teste: ['José', 'Lucas', 'Nádia', 'Fernanda', 'Cairo', 'Joana'];.
Valor esperado no retorno da função: Fernanda.
*/

let nomes = ['José', 'Lucas', 'Nádia', 'Fernanda', 'Cairo', 'Joana']

function maiorNome(lista){
    console.log(lista.sort((a,b) => b.length - a.length)[0])
}

maiorNome(nomes)