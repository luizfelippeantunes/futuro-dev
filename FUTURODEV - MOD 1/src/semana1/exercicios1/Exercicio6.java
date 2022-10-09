package semana1.exercicios1;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        /*
        Crie um programa em Java que fa�a 2 perguntas ao usu�rio: primeiro, pergunte o ano de nascimento. Depois, pergunte
        o ano atual. Em seguida, exiba na tela o texto ?Sua idade � x ou y?, onde x � a idade do usu�rio caso ele j� tenha
        feito anivers�rio neste ano, e y � a idade caso ele ainda n�o tenha aniversariado no ano corrente.
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

        System.out.printf("Ol� %s, se voc� j� fez anivers�rio nesse ano voc� tem %d anos.%n" +
                "Caso voc� n�o tenha feito anivers�rio ainda, voc� tem %d anos.", nomeCompleto, idadeX, idadeY );

        entrada.close();
    }
}
