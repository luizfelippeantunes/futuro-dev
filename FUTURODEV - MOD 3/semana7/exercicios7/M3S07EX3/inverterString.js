/*
2 - Utilize a estrutura de repetição for para desenvolver um algoritmo que seja capaz de inverter uma palavra. 
Por exemplo, a palavra “banana” seria invertida para “ananab”. Utilize a string abaixo como exemplo, depois 
troque por outras para verificar se seu algoritmo está funcionando corretamente.
*/

let palavra = 'Luiz'
let array = []
let inversa = ''

function inverterString(palavra) {
    for (i=0; i < palavra.length; i++) {
        array.unshift(palavra.substr(i, 1))
    }
    inversa = array.join('')
}

inverterString(palavra)
console.log(inversa)