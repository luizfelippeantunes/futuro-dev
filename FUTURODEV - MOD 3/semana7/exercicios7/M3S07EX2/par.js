//3 - Crie uma lógica que recebe um número inteiro e determina se ele e par ou ímpar.

function par (numero){
    if (numero%2 == 0){
        console.log('O número '+numero+' é PAR!')
    } else {
        console.log('O número '+numero+' é ÍMPAR!')
    }
}

par(6)