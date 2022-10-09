/*
Na classe Time, crie o método comprarJogador que recebe como parâmetro um jogador.
Preste a atenção para os requisitos deste método:

- Um time não pode ter jogadores duplicados na lista. Utilize o método contains da lista de
jogadores para saber se o jogador já existe na lista.
- Como a lista do time é de usuários e engloba jogadores e técnico, precisamos filtarar os jogadores.
Para isso, crie um método chamado filtraJogadores sem parâmetros. Esse método deve retornar uma lista só com os jogadores.
- Dentro do método filtraJogadores, percorra a lista de usuários e, para cada usuário faça um if para saber se
o usuário é um jogador. Utilize o operador instanceof visto em sala.
- Se o usuário for um jogador, adicione-o na lista de jogadores.
- Invoque este método dentro do método comprarJogador para pegar a lista de jogadores.
- Dentro da lista de jogadores, faça um if com o método contains para saber se o jogador já existe.
- Se não existir, adicione-o na lista de usuários e diminua o saldo do time do preço do jogador.
- Para que o contains da lista funcione, implemente o método equals no jogador. No equals, compare os jogadores pela matrícula.
 */

package semana4.exercicios4.m2s04ex3;

public class Incremento {

    // FORAM REALIZADAS AS ALTERAÇÕES DIRETAMENTE NA CLASSE "TIME" DO EXERCÍCIO 2

}
