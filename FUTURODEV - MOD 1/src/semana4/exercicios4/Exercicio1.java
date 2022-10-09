package semana4.exercicios4;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        /*
        Uma empresa decide registrar o sal�rio dos seus colaboradores, a fim de decidir a quantia a ser descontada
        para a previd�ncia privada. As regras do desconto seguem abaixo:
            Para sal�rios com valor menor que 1000 reais, o desconto � de 1%
            Para sal�rios entre 1000 at� 3000 reais, o desconto � de 2%
            Para sal�rios entre 3001 at� 5000 reais, o desconto � de 3%
            Para sal�rios acima de 5000 reais, o desconto � de 5%
        Escreva um programa em java que capture do usu�rio os sal�rios de 30 colaboradores. Os sal�rios devem ser
        armazenados em um vetor (array). O programa deve calcular o desconto a ser aplicado em cada sal�rio, de acordo
        com as regras acima. O programa deve imprimir ao final:
            O �ndice no vetor do maior sal�rio.
            O �ndice no vetor do menor sal�rio
            O maior sal�rio j� com o desconto aplicado.
            O menor sal�rio j� com o desconto aplicado.
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
            System.out.printf("Digite o %d� sal�rio:%n", (contador + 1));
            salarios[contador] = Double.parseDouble(entrada.nextLine());

            if (salarios[contador] < 1000) {
                salarioDescontado = (salarios[contador] * 0.99);
                System.out.printf("O sal�rio de R$ %.2f teve um desconto de 1 por cento, totalizando: R$ %.2f%n", salarios[contador], salarioDescontado);
            } else if (salarios[contador] <= 3000) {
                salarioDescontado = salarios[contador] * 0.98;
                System.out.printf("O sal�rio de R$ %.2f teve um desconto de 2 por cento, totalizando: R$ %.2f%n", salarios[contador], salarioDescontado);
            } else if (salarios[contador] <= 5000) {
                salarioDescontado = salarios[contador] * 0.97;
                System.out.printf("O sal�rio de R$ %.2f teve um desconto de 3 por cento, totalizando: R$ %.2f%n", salarios[contador], salarioDescontado);
            } else {
                salarioDescontado = salarios[contador] * 0.95;
                System.out.printf("O sal�rio de R$ %.2f teve um desconto de 5 por cento, totalizando: R$ %.2f%n", salarios[contador], salarioDescontado);
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
        System.out.printf("%nO �ndice do maior sal�rio �: %d%n", posicaoMaior);
        System.out.printf("O �ndice do menor sal�rio �: %d%n", posicaoMenor);
        System.out.printf("O maior sal�rio j� com os descontos � o de R$ %.2f%n", maiorSalario);
        System.out.printf("O menor sal�rio j� com os descontos � o de R$ %.2f%n", menorSalario);
        entrada.close();
    }
}