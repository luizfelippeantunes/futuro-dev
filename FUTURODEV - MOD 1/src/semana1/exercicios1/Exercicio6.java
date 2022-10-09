package semana1.exercicios1;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        /*
        Crie um programa em Java que faça 2 perguntas ao usuário: primeiro, pergunte o ano de nascimento. Depois, pergunte
        o ano atual. Em seguida, exiba na tela o texto ?Sua idade é x ou y?, onde x é a idade do usuário caso ele já tenha
        feito aniversário neste ano, e y é a idade caso ele ainda não tenha aniversariado no ano corrente.
         */
        //Programa criado pelo aluno Luiz Felippe Antunes - Turma Brava (FUTURO DEV)
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nomeCompleto = entrada.nextLine();
        nomeCompleto = nomeCompleto.trim();

        System.out.println("Digite o ano do seu nascimento:");
        int anoNascimento = Integer.parseInt(entrada.nextLine());

        System.out.println("Digite o ano atual:");
        int anoAtual = Integer.parseInt(entrada.nextLine());

        int idadeX = (anoAtual - anoNascimento);
        int idadeY = (anoAtual - anoNascimento)-1;

        System.out.printf("Olá %s, se você já fez aniversário nesse ano você tem %d anos.%n" +
                "Caso você não tenha feito aniversário ainda, você tem %d anos.", nomeCompleto, idadeX, idadeY );

        entrada.close();
    }
}
