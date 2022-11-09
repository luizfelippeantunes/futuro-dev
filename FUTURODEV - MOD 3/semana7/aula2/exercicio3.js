const valor = 5

let asterisco = '*'
let espaco = ' '

for(i = 0; i < valor; i++){
    console.log(espaco.repeat(valor-i)+asterisco.repeat(i+1))
}