package semana4.exercicios4;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        /*
        Uma empresa decide registrar o salário dos seus colaboradores, a fim de decidir a quantia a ser descontada
        para a previdência privada. As regras do desconto seguem abaixo:
            Para salários com valor menor que 1000 reais, o desconto é de 1%
            Para salários entre 1000 até 3000 reais, o desconto é de 2%
            Para salários entre 3001 até 5000 reais, o desconto é de 3%
            Para salários acima de 5000 reais, o desconto é de 5%
        Escreva um programa em java que capture do usuário os salários de 30 colaboradores. Os salários devem ser
        armazenados em um vetor (array). O programa deve calcular o desconto a ser aplicado em cada salário, de acordo
        com as regras acima. O programa deve imprimir ao final:
            O índice no vetor do maior salário.
            O índice no vetor do menor salário
            O maior salário já com o desconto aplicado.
            O menor salário já com o desconto aplicado.
         */
        //Programa criado pelo aluno Luiz Felippe Antunes - Turma Brava (FUTURO DEV)
        Scanner entrada = new Scanner(System.in);
        int colaboradores = 30;
        int contador = 0;
        double[] salarios = new double[colaboradores];
        double maiorSalario = Integer.MIN_VALUE;
        double menorSalario = Integer.MAX_VALUE;
        double salarioDescontado = 0;
        int posicaoMaior = contador;
        int posicaoMenor = contador;

        while (contador < colaboradores) {
            System.out.println();
            System.out.printf("Digite o %dº salário:%n", (contador + 1));
            salarios[contador] = Double.parseDouble(entrada.nextLine());

            if (salarios[contador] < 1000) {
                salarioDescontado = (salarios[contador] * 0.99);
                System.out.printf("O salário de R$ %.2f teve um desconto de 1 por cento, totalizando: R$ %.2f%n", salarios[contador], salarioDescontado);
            } else if (salarios[contador] <= 3000) {
                salarioDescontado = salarios[contador] * 0.98;
                System.out.printf("O salário de R$ %.2f teve um desconto de 2 por cento, totalizando: R$ %.2f%n", salarios[contador], salarioDescontado);
            } else if (salarios[contador] <= 5000) {
                salarioDescontado = salarios[contador] * 0.97;
                System.out.printf("O salário de R$ %.2f teve um desconto de 3 por cento, totalizando: R$ %.2f%n", salarios[contador], salarioDescontado);
            } else {
                salarioDescontado = salarios[contador] * 0.95;
                System.out.printf("O salário de R$ %.2f teve um desconto de 5 por cento, totalizando: R$ %.2f%n", salarios[contador], salarioDescontado);
            }
            if (salarios[contador] > maiorSalario) {
                posicaoMaior = contador;
                maiorSalario = salarioDescontado;
            }
            if (salarios[contador] < menorSalario) {
                posicaoMenor = contador;
                menorSalario = salarioDescontado;
            }
            contador++;
        }
        System.out.printf("%nO índice do maior salário é: %d%n", posicaoMaior);
        System.out.printf("O índice do menor salário é: %d%n", posicaoMenor);
        System.out.printf("O maior salário já com os descontos é o de R$ %.2f%n", maiorSalario);
        System.out.printf("O menor salário já com os descontos é o de R$ %.2f%n", menorSalario);
        entrada.close();
    }
}