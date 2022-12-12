function BotaoCalculadora(param) {
    const { classe, valor, onclick } = param
    return <td><button className={classe} onClick={() => {onclick(valor)}}>{valor}</button></td>
}

export default BotaoCalculadora