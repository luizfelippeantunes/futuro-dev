package semana2.exercicios2;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        /*
        Crie um programa em Java que, utilizando a classe Scanner, peça ao usuário que digite sua altura
        (2 ou mais casas depois da vírgula), depois peça que o usuário digite seu peso, e então calcule o IMC
        e exiba essa informação ao usuário. Fórmula IMC = peso / (altura x altura).
        */
        //Programa criado pelo aluno Luiz Felippe Antunes - Turma Brava (FUTURO DEV)
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nome = entrada.nextLine();
        nome = nome.trim();

        System.out.println("Digite a sua altura: (em metros)");
        double altura = Double.parseDouble(entrada.nextLine());

        System.out.println("Digite o seu peso: (em quilos)");
        double peso = Double.parseDouble(entrada.nextLine());

        double imc = peso / (altura * altura);

        System.out.printf("%s, você tem %.2f metros de altura e %.2f kg, totalizando um IMC de %.2f.%n", nome, altura, peso, imc);

        entrada.close();
    }
}
