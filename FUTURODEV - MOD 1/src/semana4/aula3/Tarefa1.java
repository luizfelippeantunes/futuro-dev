package semana4.aula3;

import java.util.Scanner;

public class Tarefa1 {
    public static void main(String[] args) {
        String nomeMaisVotado = "";
        String nomeMenosVotado = "";
        String[] nomesDosCandidatos = new String[10];
        int quantidadeVoto;
        int quantidadeMaisVotado = Integer.MIN_VALUE;
        int quantidadeMenosVotado = Integer.MAX_VALUE;
        int contador = 0;
        Scanner scanner = new Scanner(System.in);

        while (contador < 10) {
            System.out.println("Digite seu nome:");
            nomesDosCandidatos[contador] = scanner.nextLine();
            System.out.println(nomesDosCandidatos[contador] + ", quantos votos você teve?");
            quantidadeVoto = Integer.parseInt(scanner.nextLine());
            while (quantidadeVoto < 0) {
                System.out.println("Quantidade de votos não pode ser negativa. Digite novamente:");
                quantidadeVoto = Integer.parseInt(scanner.nextLine());
            }
            if (quantidadeVoto > quantidadeMaisVotado) {
                quantidadeMaisVotado = quantidadeVoto;
                nomeMaisVotado = nomesDosCandidatos[contador];
            }
            if (quantidadeVoto < quantidadeMenosVotado) {
                quantidadeMenosVotado = quantidadeVoto;
                nomeMenosVotado = nomesDosCandidatos[contador];
            }
            contador++;
        }

        System.out.println("O candidato mais votado foi: " + nomeMaisVotado + ", com " + quantidadeMaisVotado + " votos.");
        System.out.println("O cantidato menos votado foi: " + nomeMenosVotado + ", com " + quantidadeMenosVotado + " votos.");
        System.out.println("Nomes de todos os candidatos:");
        for (contador = 0; contador < 10; contador++) {
            System.out.println(nomesDosCandidatos[contador]);
        }
        scanner.close();
    }
}
