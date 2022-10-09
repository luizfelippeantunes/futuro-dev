package semana3.aula4;

import java.util.Scanner;

public class Tarefa1 {
    public static void main(String[] args) {
        /* Em uma elei��o para prefeito, houveram 10 candidatos concorrendo para o cargo.
        Escreva um programa em java que capture o nome do candidato e a quantidade de votos obtidos na elei��o.
        O programa deve imprimir as seguintes informa��es:
        - O nome do cadidato mais votado
        - O nome do candidato menos votado */
        Scanner entrada = new Scanner(System.in);
        int maisVotado = Integer.MIN_VALUE;
        int menosVotado = Integer.MAX_VALUE;
        String nomeMaisVotado = "";
        String nomeMenosVotado = "";
        for (int contador = 1; contador <= 3; contador++) {
            System.out.println("Digite o nome do candidato n� " + contador + ":");
            String nome = entrada.nextLine();
            System.out.println("Digite a quantidade de votos do candidato n� " + contador + ":");
            int votos = Integer.parseInt(entrada.nextLine());
            while (votos < 0) {
                System.out.println("Quantidade de votos inv�lida, digite novamente:");
                votos = Integer.parseInt(entrada.nextLine());
            }
            if (votos > maisVotado) {
                maisVotado = votos;
                nomeMaisVotado = nome;
            }
            if (votos < menosVotado) {
                menosVotado = votos;
                nomeMenosVotado = nome;
            }
        }
        if (menosVotado == 0 && maisVotado == 0) {
            System.out.println("A elei��o foi anulada pois nenhum candidato recebeu votos.");
        } else {
            if (menosVotado == 0) {
                System.out.println("O candidato mais votado foi o " + nomeMaisVotado + " com um total de " + maisVotado + " votos.");
                System.out.println("O candidato menos votado foi o " + nomeMenosVotado + " com nenhum voto computado.");
            } else {
                System.out.println("O candidato mais votado foi o " + nomeMaisVotado + " com um total de " + maisVotado + " votos.");
                System.out.println("O candidato menos votado foi o " + nomeMenosVotado + " com um total de " + menosVotado + " votos.");
            }
        }
        entrada.close();
    }
}