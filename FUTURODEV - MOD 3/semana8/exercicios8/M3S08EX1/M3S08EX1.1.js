/*
let numeros = [25, 64, 4, 9, 81, 36, 49, 1, 100, 121, 16 ];
1 - Crie funções utilizando arrow functions que retorne em um novo array e em ordem crescente:
- O dobro de cada valor dentro desse array
- A metade de cada valor dentro desse array
- A raiz de cada valor dentro desse array
*/

let numeros = [25, 64, 4, 9, 81, 36, 49, 1, 100, 121, 16]

let dobro = (array) => {
    let ordenado = array.sort(function (a, b){
        return a - b;
    })
    let dobroOrdenado = []
    for (let x = 0; x < ordenado.length; x++){
        let dobro = ordenado[x] * 2
        dobroOrdenado.push(dobro)
    }
    return dobroOrdenado
}

let metade = (array) => {
    let ordenado = array.sort(function (a, b){
        return a - b;
    })
    let metadeOrdenado = []
    for (let x = 0; x < ordenado.length; x++){
        let metade = ordenado[x] / 2
        metadeOrdenado.push(metade)
    }
    return metadeOrdenado
}

let raiz = (array) => {
    let ordenado = array.sort(function (a, b){
        return a - b;
    })
    let raizOrdenado = []
    for (let x = 0; x < ordenado.length; x++){
        let raiz = Math.sqrt(ordenado[x])
        raizOrdenado.push(raiz)
    }
    return raizOrdenado
}

console.log(dobro(numeros))
console.log(metade(numeros))
console.log(raiz(numeros))