const valor = 5

let asterisco = '*'
let espaco = ' '

for(i = 1; i <= valor; i = i+2){
    console.log(espaco.repeat((valor-i)/2)+asterisco.repeat(i))
}