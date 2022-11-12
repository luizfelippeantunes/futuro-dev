// A força do ataque é multiplicada pelo nível do pokemon
// Ex: Pikachu nível 30
// Ataque Rápido:
// Dano: 70 * (1 + 0,3)

// A defesa é utilizada com a seguinte multiplicação ao ataque recebido
// Ataque: 60
// Defesa: 50
// Dano total recebido: 60 * (1 - 0,5) = 30

// Se o Pokemon tiver vantagem de tipo, ele tem um bônus de 10% no seu ataque

const tipos = {
    "Elétrico": {
        forteContra: ['Água', 'Voador', 'Fogo'],
        fracoContra: ['Elétrico', 'Grama', 'Terra', 'Dragão']
    },
    "Fogo": {
        forteContra: ['Inseto', 'Planta', 'Gelo', 'Aço'],
        fracoContra: ['Pedra', 'Terrestre', 'Água']
    }
}

const pikachu = {
    tipo: "Elétrico",
    hp: 35,
    energia: 60,
    level: 30,
    defesa: 40,
    ataques: {
        "Ataque Rápido": {
            dano: 20,
            energiaConsumida: 18,
            chanceDeAcerto: 80
        },
        "Investida Trovão": {
            dano: 30,
            energiaConsumida: 9,
            chanceDeAcerto: 70
        },
        "Choque do Trovão": {
            dano: 40,
            energiaConsumida: 20,
            chanceDeAcerto: 50
        }
    }
}

const charizard = {
    tipo: "Fogo",
    hp: 78,
    energia: 84,
    level: 20,
    defesa: 60,
    ataques: {
        "Lança-Chamas": {
            dano: 70,
            energiaConsumida: 28,
            chanceDeAcerto: 40
        },
        "Rajada de Chamas": {
            dano: 39,
            energiaConsumida: 9,
            chanceDeAcerto: 70
        },
        "Soco de Fogo": {
            dano: 55,
            energiaConsumida: 28,
            chanceDeAcerto: 60
        }
    }
}

function vantagem(tipoAtacante, tipoOponente) {
    return tipos[tipoAtacante].forteContra.includes(tipoOponente)
}

function desvantagem(tipoAtacante, tipoOponente) {
    return tipos[tipoAtacante].fracoContra.includes(tipoOponente)
}

// function attack
// Essa Função deve receber o Pokemon que vai atacar, o nome do ataque, e o pokemon a ser atacado como parâmetros
// O valor do ataque deve ser de acordo com as regra já pré estabelecidas e o pokemon adversário deve ter seu status alterado

function attack(atacante, nomeAtaque, oponente) {
    let ataque = atacante.ataques[nomeAtaque].dano * (1 + atacante.level / 100)
    if (vantagem(atacante.tipo, oponente.tipo) === true) {
        ataque = ataque * 1.1
    }
    oponente.hp = oponente.hp - ataque
    if (oponente.hp > 0) {
        return 'HP do Oponente: ' + oponente.hp
    } else {
        return 'Oponente morreu.'
    }
}

// function regen
// Essa Função deve receber o Nome Pokemon como parâmetro
// Ele terá sua vida restaurada em x Pontos

function regen(atacante, x) {
    //console.log(atacante.hp)
    atacante.hp = atacante.hp + x        
    //console.log(atacante.hp)
}

// function focus
// Essa Função deve receber o Nome do Pokemon como parâmetro
// Todos os seus ataques com uma chance de acerto de mais 20%

function focus(atacante) {
    //for (x in atacante.ataques) {
    //    console.log(atacante.ataques[x].chanceDeAcerto)
    //}
    //console.log("------------")
    for (i in atacante.ataques) {
        atacante.ataques[i].chanceDeAcerto = atacante.ataques[i].chanceDeAcerto * 1.2
    }
    //for (x in atacante.ataques) {
    //    console.log(atacante.ataques[x].chanceDeAcerto)
    //}
}

// function defense
// Essa Função deve receber o Nome do Pokemon como parâmetro
// A sua defesa terá um bônus de 20%

function defense(atacante, x) {
    //console.log(atacante.defesa)
    atacante.defesa = atacante.defesa + x        
    //console.log(atacante.defesa)
}

// function learn
// Essa Função deve receber o Nome do Pokemon principal e o nome do Pokemon adversário como parâmetros
// O pokemon principal deverá aprender um dos movimentos do seu adversário e poderá utilizá-lo

function learn(atacante, oponente) {
    // Falta fazer essa função
    console.log('Falta implementar')
}

focus(pikachu)
focus(charizard)
regen(pikachu, 2)
defense(pikachu, 2)

console.log(attack(pikachu, "Choque do Trovão", charizard))
console.log(attack(pikachu, "Ataque Rápido", charizard))