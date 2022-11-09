let valor = 9

let asterisco = '*'
let espaco = ' '
let contador = 0

for(i = 1; i <= valor; i = i+2){
    let str = ''
    if (contador > 0 && i < valor){
        str = espaco.repeat((valor-i)/2)+asterisco+espaco.repeat(contador)+asterisco
    } else {
        str = espaco.repeat((valor-i)/2)+asterisco.repeat(i)
    }
    contador = i;
    console.log(str)
}