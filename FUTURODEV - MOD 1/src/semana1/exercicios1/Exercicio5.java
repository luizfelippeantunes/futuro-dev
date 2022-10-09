package semana1.exercicios1;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        /*
        Crie um programa em Java que pergunte ao usuário: nome, idade e se gosta de praticar algum esporte.
        Crie 3 variáveis para guardar as respostas do usuário: uma deve receber um valor textual (string),
        outra deve receber um valor numérico (int), e outra um valor de verdadeiro ou falso (boolean).
        Faça com que esses 3 valores sejam exibidos de volta para o usuário.
         */
        //Programa criado pelo aluno Luiz Felippe Antunes - Turma Brava (FUTURO DEV)
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite seu nome completo:");
        String nomeCompleto = entrada.nextLine();
        nomeCompleto = nomeCompleto.trim();

        System.out.println("Digite a sua idade:");
        int idade = Integer.parseInt(entrada.nextLine());

        System.out.println("Você gosta de praticar esportes? (TRUE ou FALSE)");
        boolean esporte = entrada.nextBoolean();
        if (esporte == true) {
            System.out.printf("Olá %s, você tem %d anos e gosta de praticar esportes.", nomeCompleto, idade);
        } else {
            System.out.printf("Olá %s, você tem %d anos e não gosta de praticar esportes.", nomeCompleto, idade);
        }
        entrada.close();
    }
}
