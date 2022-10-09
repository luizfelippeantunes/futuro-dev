package semana1.exercicios1;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        /*
        Crie um programa em Java que pergunte ao usu�rio: nome, idade e se gosta de praticar algum esporte.
        Crie 3 vari�veis para guardar as respostas do usu�rio: uma deve receber um valor textual (string),
        outra deve receber um valor num�rico (int), e outra um valor de verdadeiro ou falso (boolean).
        Fa�a com que esses 3 valores sejam exibidos de volta para o usu�rio.
         */
        //Programa criado pelo aluno Luiz Felippe Antunes - Turma Brava (FUTURO DEV)
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite seu nome completo:");
        String nomeCompleto = entrada.nextLine();
        nomeCompleto = nomeCompleto.trim();

        System.out.println("Digite a sua idade:");
        int idade = Integer.parseInt(entrada.nextLine());

        System.out.println("Voc� gosta de praticar esportes? (TRUE ou FALSE)");
        boolean esporte = entrada.nextBoolean();
        if (esporte == true) {
            System.out.printf("Ol� %s, voc� tem %d anos e gosta de praticar esportes.", nomeCompleto, idade);
        } else {
            System.out.printf("Ol� %s, voc� tem %d anos e n�o gosta de praticar esportes.", nomeCompleto, idade);
        }
        entrada.close();
    }
}
