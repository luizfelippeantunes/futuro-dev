package semana4.exercicios4;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        /*
        Um prédio possui 6 andares. Cada andar possui 10 moradores. Cada morador deve ser representado como uma string.
        Escreva um programa em java que capture todos os moradores dos 6 andares do prédio. Os dados devem ser armazenados
        em uma matriz bidimensional, onde cada linha representa os andares e cada coluna representa os moradores.
        Ao final, o programa deverá imprimir:
            Todos os moradores do primeiro andar
            O terceiro morador do segundo andar.
            Os cinco primeiros moradores do quarto andar.
         */
        //Programa criado pelo aluno Luiz Felippe Antunes - Turma Brava (FUTURO DEV)
        Scanner entrada = new Scanner(System.in);

        String[][] apartamento = new String[6][10];

        int linha;
        int coluna;

        for (linha = 0; linha < apartamento.length; linha++) {
            for (coluna = 0; coluna < apartamento[linha].length; coluna++) {
                System.out.println("Digite o nome do " + (coluna + 1) + "º morador do " + (linha + 1) + "º andar:");
                apartamento[linha][coluna] = entrada.nextLine();
            }
        }
        System.out.println();
        System.out.println("Os moradores do primeiro andar são:");
        for (coluna = 0; coluna < apartamento[0].length; coluna++){
            System.out.println(apartamento[0][coluna]);
        }
        System.out.println();
        System.out.println(apartamento[1][2] + " é o terceiro morador do segundo andar.");
        System.out.println();
        System.out.println("Os cinco primeiros moradores do quarto andar são:");
        for (coluna = 0; coluna < 5; coluna++){
            System.out.println(apartamento[3][coluna]);
        }
        entrada.close();
    }
}
