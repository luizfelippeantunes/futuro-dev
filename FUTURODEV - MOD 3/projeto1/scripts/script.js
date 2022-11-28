var itens = []
let valorTotal = 0
let precos = new Map()

onload = function () {

    document.getElementById("inputItem").addEventListener("keydown", (e) => {   
        if (e.key === 'Enter' || e.which == 13 || e.keyCode == 13 ) {            
            inserir();
        }     
    });

    let listaStorage = localStorage.getItem("itens");
    let precoStorage = localStorage.getItem("precos");
    let totalStorage = localStorage.getItem("valorTotal");

    if (precoStorage){
        precos = new Map(JSON.parse(precoStorage));
    }

    if (totalStorage){
        valorTotal = JSON.parse(totalStorage)
    }

    if (listaStorage) {
        itens = JSON.parse(listaStorage);
    }

    preencherLista();
}

function inserir(e) {

    if (document.getElementById("inputItem").value.length >= 2) {

        let tr = document.getElementById("inputItem").value;

        let obj_tarefa = { id: parseInt(Math.random()*100), conteudo: tr };

        itens.push(obj_tarefa);

        document.getElementById("inputItem").value = "";
    
        document.getElementById("gif").style.visibility = "visible";

        setTimeout(function(){
            document.getElementById("gif").style.visibility = "hidden";
        }, 3000);

        preencherLista();

        limpaErroCampoVazio();

    } else {
    erroCampoVazio();
    }
}

function preencherLista() {

    document.querySelector("#valorTotal").textContent="R$ " + valorTotal.toFixed(2);

    let listaCompras = document.getElementById("lista");

    listaCompras.innerText = "";

    for (let i = 0; i < this.itens.length; i++) {
        let checked = verificaCheck(`ck${itens[i].id}`);
        if (checked){
            listaCompras.innerHTML += `<li class='itemLista' id='${itens[i].id}'>
            <input type="checkbox" class="itemCompra" id='ck${itens[i].id}' checked="checked" onclick='comprarItem(this, "p"+${itens[i].id})'>
            <p class="produto" id='p${itens[i].id}' style="text-decoration: line-through">${itens[i].conteudo}</p>
            <img id="img"+${itens[i].id} src='./icons/delete.svg' class='iconDel' onclick='apagaItem(${itens[i].id}, "ck"+${itens[i].id}, ${i})'></li>`
            //document.getElementById(`p${itens[i].id}`).style.textDecoration = "line-through";
        } else {
            listaCompras.innerHTML += `<li class='itemLista' id='${itens[i].id}'>
            <input type="checkbox" class="itemCompra" id='ck${itens[i].id}' onclick='comprarItem(this)'>
            <p class="produto" id='p${itens[i].id}'>${itens[i].conteudo}</p>
            <img id="img"+${itens[i].id} src='./icons/delete.svg' class='iconDel' onclick='apagaItem(${itens[i].id}, "ck"+${itens[i].id}, ${i})'></li>`
        }
    }

    localStorage.setItem("itens", JSON.stringify(itens));

}

function erroCampoVazio() {
    let erro = document.getElementById("erroCampoVazio");
    erro.style.visibility = "visible";
}

function limpaErroCampoVazio() {
    let erro = document.getElementById("erroCampoVazio");
    erro.style.visibility = "hidden";
}

function apagarTodosItens(e) {
    let listaCompra = document.getElementById("lista");
    listaCompra.innerHTML = "";

    limpaErroCampoVazio();

    localStorage.clear();

    itens = [];

    valorTotal = 0
    document.querySelector("#valorTotal").textContent="R$ " + valorTotal.toFixed(2)
}

function apagaItem (idLinha, idCheckbox, index){
    if (document.querySelector(`#${idCheckbox}`).checked){
        valorTotal -= precos.get(idCheckbox)
        document.querySelector("#valorTotal").textContent="R$ " + valorTotal.toFixed(2)
    }

    itens.splice(index,1);

    precos.delete(idCheckbox);
    
    preencherLista();

    localStorage.setItem("precos", JSON.stringify(Array.from(precos.entries())));
    localStorage.setItem("valorTotal", JSON.stringify(valorTotal));
}

function comprarItem (e, idParagrafo) {
    if (e.checked == false){
        valorTotal -= precos.get(e.id)
    }
        else {
                do {
                    valorItem = prompt("Digite o valor do item: ")
                    precos.set(e.id, valorItem)
                } while (valorItem <= 0 || isNaN(valorItem));
            valorTotal += parseFloat(valorItem)
            }
    document.getElementById(idParagrafo).style.textDecoration = "line-through";
    document.querySelector("#valorTotal").textContent="R$ " + valorTotal.toFixed(2);
    localStorage.setItem("precos", JSON.stringify(Array.from(precos.entries())));
    localStorage.setItem("valorTotal", JSON.stringify(valorTotal));
}

function verificaCheck(idCheckbox) {
    return precos.get(idCheckbox) != undefined
}