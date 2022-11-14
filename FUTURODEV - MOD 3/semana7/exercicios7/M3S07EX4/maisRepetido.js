/*
5 - Crie uma função que receba um array de inteiros e retorne o inteiro que mais se repete.
Array de teste: [2, 3, 2, 5, 8, 2, 3];.
Valor esperado no retorno da função: 2.
*/

let inteiros = [2, 3, 2, 5, 8, 2, 3]

function maisRepetido(lista) {

    let resultado = lista.reduce((acc, val) => {
        if (!acc[val]) 
            acc[val] = {
                "número": val,
                "quantidade": 1
            };
         else 
            acc[val]["quantidade"]++;
        
        return acc;
        console.log(resultado[0].quantidade)
    }, {});
    
    //console.log(Object.values(resultado));
}

maisRepetido(inteiros)

/*
    let valor = lista[0];
    let length = lista.length
    let index = []
    let contador = 0
    let x = 0
    let bol
    while (x < length) {
        for (let i = 0; i < lista.length; i++) {
            if (lista[x] === valor) {
                console.log(lista[x])
                contador += 1
            }
        }

        let obj = {
            "produto_id": lista[x],
            "quantidade": contador
        }
        if (index.length > 0) {
            index.forEach(itemLista => {
                if (itemLista.produto_id === obj.produto_id) {
                    bol = false;
                } else {
                    bol = true;
                }
            });
            if (bol == true) {
                index.push(obj);
            }
        } else if (index.length == 0) {
            index.push(obj);
        }
        x++
    }
    console.log(contador)
    return index;
*/
