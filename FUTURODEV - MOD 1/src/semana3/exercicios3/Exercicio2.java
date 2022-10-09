package semana3.exercicios3;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        /*
        Em uma corrida de fórmula 1, os 8 primeiros colocados ganham pontos para somar no campeonato mundial.
        O 8º colocado ganha 1 ponto, o 7º colocado ganha 2 pontos, o 6º colocado ganha 3 pontos, e assim sucessivamente,
        até chegar ao 1º colocado que ganhará 8 pontos. Escreva um programa que capture a posição de um corredor de fórmula 1.
        A posição deve ser capturada como um número inteiro. O programa deverá pontuar o corredor conforme a posição informada
        por ele. O programa deve mostrar na tela a quantidade de pontos obtidos na corrida.
        */
        //Programa criado pelo aluno Luiz Felippe Antunes - Turma Brava (FUTURO DEV)
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o nome do piloto:");
        String piloto = entrada.nextLine();
        piloto = piloto.trim();

        System.out.println("Digite a colocação do piloto na corrida: (Entre 1 e 8)");
        int posicao = Integer.parseInt(entrada.nextLine());

        int pontuacao = 0;

        if(posicao < 1 || posicao > 8){
            System.out.println("Posição inválida!");
            System.out.println("### FIM DO PROGRAMA ###");
        }else{
            if(posicao == 1){
                pontuacao = 8;
                System.out.printf("O piloto %s ficou em %dª lugar, somando %d pontos no campeonato.", piloto, posicao, pontuacao);
            }
            if(posicao == 2){
                pontuacao = 7;
                System.out.printf("O piloto %s ficou em %dª lugar, somando %d pontos no campeonato.", piloto, posicao, pontuacao);
            }
            if(posicao == 3){
                pontuacao = 6;
                System.out.printf("O piloto %s ficou em %dª lugar, somando %d pontos no campeonato.", piloto, posicao, pontuacao);
            }
            if(posicao == 4){
                pontuacao = 5;
                System.out.printf("O piloto %s ficou em %dª lugar, somando %d pontos no campeonato.", piloto, posicao, pontuacao);
            }
            if(posicao == 5){
                pontuacao = 4;
                System.out.printf("O piloto %s ficou em %dª lugar, somando %d pontos no campeonato.", piloto, posicao, pontuacao);
            }
            if(posicao == 6){
                pontuacao = 3;
                System.out.printf("O piloto %s ficou em %dª lugar, somando %d pontos no campeonato.", piloto, posicao, pontuacao);
            }
            if(posicao == 7){
                pontuacao = 2;
                System.out.printf("O piloto %s ficou em %dª lugar, somando %d pontos no campeonato.", piloto, posicao, pontuacao);
            }
            if(posicao == 8){
                pontuacao = 1;
                System.out.printf("O piloto %s ficou em %dª lugar, somando %d ponto no campeonato.", piloto, posicao, pontuacao);
            }
        }
        entrada.close();
    }
}