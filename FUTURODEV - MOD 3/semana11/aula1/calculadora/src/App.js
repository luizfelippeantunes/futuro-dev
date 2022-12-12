import { useState } from 'react'
import BotaoCalculadora from './components/button'
import './App.css'

function App() {
  
  let [resultado, setResultado] = useState('')
  
  function adicionaValor(valor){
    setResultado(resultado + valor)
  }
  
  function total(){
    setResultado(eval(resultado))
  }
  
  function AC(){
    setResultado(' ')
  }

  let calculadora = [['1', '2', '3','+'], ['4', '5', '6','-'], ['7', '8', '9','*'], ['0','10','100', '/']]

  return (
    <div>
      <table>
      <tr>
        <td><button id="display">{resultado}</button></td>
      </tr>
      {
          calculadora.map((e) => 
          <tr> { e.map((ele) => <BotaoCalculadora valor={ele} onclick={adicionaValor}></BotaoCalculadora>) }</tr>
          ) 
        }
        <tr>
          <BotaoCalculadora valor="AC" classe="ac" onclick={AC}></BotaoCalculadora>
          <BotaoCalculadora valor="." onclick={adicionaValor}></BotaoCalculadora>
          <BotaoCalculadora valor="=" onclick={total}></BotaoCalculadora>         
        </tr>
    </table>
    </div>
  );
}

export default App;
