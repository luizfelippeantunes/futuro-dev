package semana2.exercicios2;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        /*
        Crie um programa em Java que, utilizando a classe Scanner, pe�a ao usu�rio para inserir as notas do semestre,
        e deve retornar a m�dia final. O programa deve pedir 3 notas, que devem ser n�meros reais, e retornar um n�mero
        real com 2 casas depois da v�rgula, com o texto ?Sua m�dia final �:? seguido do valor.
         */
        //Programa criado pelo aluno Luiz Felippe Antunes - Turma Brava (FUTURO DEV)
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nome = entrada.nextLine();
        nome = nome.trim();

        System.out.println("Digite a sua primeira nota:");
        double nota1 = Double.parseDouble(entrada.nextLine());
        if (nota1 < 0 || nota1 > 10){
            System.out.println("Nota inv�lida, digite novamente uma nota entre 0 e 10:");
            nota1 = Double.parseDouble(entrada.nextLine());
        }

        System.out.println("Digite a sua segunda nota:");
        double nota2 = Double.parseDouble(entrada.nextLine());
        if (nota2 < 0 || nota2 > 10){
            System.out.println("Nota inv�lida, digite novamente uma nota entre 0 e 10:");
            nota2 = Double.parseDouble(entrada.nextLine());
        }

        System.out.println("Digite a sua terceira nota:");
        double nota3 = Double.parseDouble(entrada.nextLine());
        if (nota3 < 0 || nota3 > 10){
            System.out.println("Nota inv�lida, digite novamente uma nota entre 0 e 10:");
            nota3 = Double.parseDouble(entrada.nextLine());
        }

        double media = (nota1 + nota2 + nota3) / 3;

        System.out.printf("%s, a sua m�dia final �: %.2f.", nome,media);

        entrada.close();
    }
}
