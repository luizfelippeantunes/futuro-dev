/*
3 - Considere o array: let array = ['java', 'javascript', 'python', 'html', 'css'];
Utilize a estrutura de repetição for para escrever dois algoritmos: um que imprima no console a maior
palavra desse array e outro que imprima a menor. Considere o número de caracteres de cada palavra.
*/

let array = [
    'java',
    'javascript',
    'python',
    'html',
    'css'
]

function maiorPalavra() {
    let indiceMaior = 0
    let maiorPalavra = ''
    for (i = 0; i < array.length; i ++) {
        if (array[i].length > indiceMaior) {
            indiceMaior = array[i].length
            maiorPalavra = array[i]
        }
    }
    console.log('A maior palavra é: ' + maiorPalavra)
}

function menorPalavra() {
    let indiceMenor = Number.MAX_VALUE
    let menorPalavra = ''
    for (i = 0; i < array.length; i ++) {
        if (array[i].length < indiceMenor) {
            indiceMenor = array[i].length
            menorPalavra = array[i]
        }
    }
    console.log('A menor palavra é: ' + menorPalavra)

}

maiorPalavra()
menorPalavra()