package semana3.exercicios3;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        /*
        Em uma corrida de f�rmula 1, os 8 primeiros colocados ganham pontos para somar no campeonato mundial.
        O 8� colocado ganha 1 ponto, o 7� colocado ganha 2 pontos, o 6� colocado ganha 3 pontos, e assim sucessivamente,
        at� chegar ao 1� colocado que ganhar� 8 pontos. Escreva um programa que capture a posi��o de um corredor de f�rmula 1.
        A posi��o deve ser capturada como um n�mero inteiro. O programa dever� pontuar o corredor conforme a posi��o informada
        por ele. O programa deve mostrar na tela a quantidade de pontos obtidos na corrida.
        */
        //Programa criado pelo aluno Luiz Felippe Antunes - Turma Brava (FUTURO DEV)
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o nome do piloto:");
        String piloto = entrada.nextLine();
        piloto = piloto.trim();

        System.out.println("Digite a coloca��o do piloto na corrida: (Entre 1 e 8)");
        int posicao = Integer.parseInt(entrada.nextLine());

        int pontuacao = 0;

        if(posicao < 1 || posicao > 8){
            System.out.println("Posi��o inv�lida!");
            System.out.println("### FIM DO PROGRAMA ###");
        }else{
            if(posicao == 1){
                pontuacao = 8;
                System.out.printf("O piloto %s ficou em %d� lugar, somando %d pontos no campeonato.", piloto, posicao, pontuacao);
            }
            if(posicao == 2){
                pontuacao = 7;
                System.out.printf("O piloto %s ficou em %d� lugar, somando %d pontos no campeonato.", piloto, posicao, pontuacao);
            }
            if(posicao == 3){
                pontuacao = 6;
                System.out.printf("O piloto %s ficou em %d� lugar, somando %d pontos no campeonato.", piloto, posicao, pontuacao);
            }
            if(posicao == 4){
                pontuacao = 5;
                System.out.printf("O piloto %s ficou em %d� lugar, somando %d pontos no campeonato.", piloto, posicao, pontuacao);
            }
            if(posicao == 5){
                pontuacao = 4;
                System.out.printf("O piloto %s ficou em %d� lugar, somando %d pontos no campeonato.", piloto, posicao, pontuacao);
            }
            if(posicao == 6){
                pontuacao = 3;
                System.out.printf("O piloto %s ficou em %d� lugar, somando %d pontos no campeonato.", piloto, posicao, pontuacao);
            }
            if(posicao == 7){
                pontuacao = 2;
                System.out.printf("O piloto %s ficou em %d� lugar, somando %d pontos no campeonato.", piloto, posicao, pontuacao);
            }
            if(posicao == 8){
                pontuacao = 1;
                System.out.printf("O piloto %s ficou em %d� lugar, somando %d ponto no campeonato.", piloto, posicao, pontuacao);
            }
        }
        entrada.close();
    }
}