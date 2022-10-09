package semana2.exercicios2;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        /*
        Crie um programa em Java que, utilizando a classe Scanner, peça ao usuário para inserir um número inteiro.
        O programa deve verificar se o número é par ou ímpar, e exibir essa informação de volta ao usuário.
        */
        //Programa criado pelo aluno Luiz Felippe Antunes - Turma Brava (FUTURO DEV)
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número:");
        int numero = Integer.parseInt(entrada.nextLine());

        if (numero % 2 == 0){
            System.out.println("O número digitado é par.");
        } else{
            System.out.println("O número digitado é ímpar.");
        }
        entrada.close();
    }
}