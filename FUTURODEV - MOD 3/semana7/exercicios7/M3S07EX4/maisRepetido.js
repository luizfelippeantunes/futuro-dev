/*
5 - Crie uma função que receba um array de inteiros e retorne o inteiro que mais se repete.
Array de teste: [2, 3, 2, 5, 8, 2, 3];.
Valor esperado no retorno da função: 2.
*/

let inteiros = [2, 3, 2, 5, 8, 2, 3]

function maisRepetido(lista) {
    let maisRepetido
    let repeticoes = 0
    // lista.sort()
    for (let i = 0; i < lista.length; i++) {
        let numero = lista[i]
        let repeticao = 0
        for (let i = 0; i < lista.length; i++) {
            if (lista[i] === numero) {
                repeticao += 1
            }
        }
        if (repeticao > repeticoes) {
            repeticoes = repeticao
            maisRepetido = lista[i]
        }
    }
    return maisRepetido
}

console.log('O número mais repetido é o: ' + maisRepetido(inteiros))