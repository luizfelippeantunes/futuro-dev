//1 - Crie um algoritmo que imprima na tela o fatorial de 10.

function fatorial (numero){
    let fatorial = numero
    for (i = 1; i<numero; i++){
        fatorial *= i;
    }
    console.log(fatorial)
}

fatorial(4)