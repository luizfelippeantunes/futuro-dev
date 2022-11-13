// 4 - Escreva um algoritmo que imprima no console o maior número primo entre 2 e 100.

let numeroFinal = 65
let listaPrimos = []

function NumerosPrimo(numero) {
    for (let divisor = 2; divisor < numero; divisor++) {
        if (numero % divisor === 0) {
            return false;
        }
    }
    return true;
}

function listaNumerosPrimos(limite) {
    for (let numero = 2; numero <= limite; numero++) {
        if (NumerosPrimo(numero)) 
            listaPrimos.push(numero);
    }
}

function maiorNumeroPrimo(limite) {
    listaNumerosPrimos(limite)
    console.log('Maior número primo do intervalo: ' + listaPrimos[listaPrimos.length - 1])
}

console.log('Intervalo: 2 a ' + numeroFinal + '.')
maiorNumeroPrimo(numeroFinal)
console.log('Números primos do intervalo: ' + listaPrimos + '.')

/*

### TESTES DO CÁLCULO DE FORMA "MANUAL", VERIFICANDO PRIMEIRO SE O NÚMERO É PAR, PARA NÃO PRECISAR PROCESSAR AS CONDIÇÕES

let numeroInicial = 2
let numeroFinal = 100
let primos = []
let maiorPrimo = null

function par(numero) {
    if (numero % 2 == 0) {
        return true
    } else {
        return false
    }
}

function maiorNumeroPrimo(numeroInicial, numeroFinal) {
    if (numeroFinal < 2) {
        console.log('Não há nenhum número primo no intervalo informado.')
    } else if (numeroFinal == 2) {
        console.log('Maior número primo: 2.')
    } else if (numeroFinal < 5) {
        console.log('Maior número primo: 3.')
    } else if (numeroFinal <= 6) {
        console.log('Maior número primo: 5.')
    } else {
        primos = [2, 3, 5]
        let i = numeroInicial
        //let cont = primos.length - 1
        let validaPrimo = false
        for (i; i <= numeroFinal; i++) {
            if (i > 0 & ! par(i)) {
                if (i % 3 != 0 & i % 5 != 0) {
                    for (cont = primos.length-1; cont >= 0; cont--) {
                        if (i / primos[cont] <= primos[cont]) {
                            maiorPrimo = i
                            validaPrimo = true
                        }
                    }
                }
                if (validaPrimo == true) {
                    primos.push(i)
                }
            }validaPrimo = false
        }
    }
    console.log('Maior número primo: ' + maiorPrimo + '.')
}

console.log('Intervalo: ' + numeroInicial + ' a ' + numeroFinal + '.')
maiorNumeroPrimo(numeroInicial, numeroFinal)
console.log('')
console.log('Números primos do intervalo: ' + primos+'.')

*/
