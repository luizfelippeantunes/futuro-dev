package semana3.exercicios3;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        /*
        Continuando o assunto da fórmula 1, imagine que um campeonato é composto de 10 corridas no total.
        Escreva um programa que capture as posições de um corredor de fórmula 1 nas 10 corridas do campeonato.
        O programa deve somar os pontos obtidos pelo corredor a partir de cada posição informada.
        O programa deve imprimir o total de pontos obtidos pelo corredor.
        */
        //Programa criado pelo aluno Luiz Felippe Antunes - Turma Brava (FUTURO DEV)
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o nome do piloto:");
        String piloto = entrada.nextLine();
        piloto = piloto.trim();

        int pontuacao = 0;
        int corrida = 1;

        while (corrida <= 10) {
            System.out.printf("Digite a colocação do piloto %s na %dª corrida: (Entre 1 e 8)%n", piloto, corrida);
            int posicao = Integer.parseInt(entrada.nextLine());
            while (posicao < 1 || posicao > 8) {
                System.out.printf("Posição inválida! Digite a posição do %s na %dª corrida novamente: (Entre 1 e 8)%n", piloto, corrida);
                posicao = Integer.parseInt(entrada.nextLine());
            }
            if (posicao == 1) {
                pontuacao = pontuacao + 8;
            }
            if (posicao == 2) {
                pontuacao = pontuacao + 7;
            }
            if (posicao == 3) {
                pontuacao = pontuacao + 6;
            }
            if (posicao == 4) {
                pontuacao = pontuacao + 5;
            }
            if (posicao == 5) {
                pontuacao = pontuacao + 4;
            }
            if (posicao == 6) {
                pontuacao = pontuacao + 3;
            }
            if (posicao == 7) {
                pontuacao = pontuacao + 2;
            }
            if (posicao == 8) {
                pontuacao = pontuacao + 1;
            }
            corrida++;
        }
        System.out.printf("O piloto %s terminou o campeonato com %d pontos.", piloto, pontuacao);
        entrada.close();
    }
}