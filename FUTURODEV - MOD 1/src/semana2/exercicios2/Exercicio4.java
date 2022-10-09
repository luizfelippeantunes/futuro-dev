package semana2.exercicios2;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        /*
        Crie um programa em Java que, utilizando a classe Scanner, peça ao usuário para inserir as notas do semestre,
        e deve retornar a média final. O programa deve pedir 3 notas, que devem ser números reais, e retornar um número
        real com 2 casas depois da vírgula, com o texto ?Sua média final é:? seguido do valor.
         */
        //Programa criado pelo aluno Luiz Felippe Antunes - Turma Brava (FUTURO DEV)
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nome = entrada.nextLine();
        nome = nome.trim();

        System.out.println("Digite a sua primeira nota:");
        double nota1 = Double.parseDouble(entrada.nextLine());
        if (nota1 < 0 || nota1 > 10){
            System.out.println("Nota inválida, digite novamente uma nota entre 0 e 10:");
            nota1 = Double.parseDouble(entrada.nextLine());
        }

        System.out.println("Digite a sua segunda nota:");
        double nota2 = Double.parseDouble(entrada.nextLine());
        if (nota2 < 0 || nota2 > 10){
            System.out.println("Nota inválida, digite novamente uma nota entre 0 e 10:");
            nota2 = Double.parseDouble(entrada.nextLine());
        }

        System.out.println("Digite a sua terceira nota:");
        double nota3 = Double.parseDouble(entrada.nextLine());
        if (nota3 < 0 || nota3 > 10){
            System.out.println("Nota inválida, digite novamente uma nota entre 0 e 10:");
            nota3 = Double.parseDouble(entrada.nextLine());
        }

        double media = (nota1 + nota2 + nota3) / 3;

        System.out.printf("%s, a sua média final é: %.2f.", nome,media);

        entrada.close();
    }
}
