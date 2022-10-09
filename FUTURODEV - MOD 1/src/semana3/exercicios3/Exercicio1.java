package semana3.exercicios3;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        /*
        O ano é dividido em quatro estações: Verão, Outono, Inverno e Primavera.
        Escreva um programa que capture a estação do ano atual do usuário.
        O usuário deve informar a estação do ano como um número inteiro, a saber:
            -Se o usuário informar o número 1, significa verão.
            -Se o usuário informar o número 2, significa outono.
            -Se o usuário informar o número 3, significa inverno.
            -Se o usuário informar o número 4, significa primavera.
        Após o programa capturar a estação do ano do usuário como um número inteiro, o programa deve imprimir
        na tela o nome da estação correspondente ao número digitado pelo usuário.
        */
        //Programa criado pelo aluno Luiz Felippe Antunes - Turma Brava (FUTURO DEV)
        Scanner entrada = new Scanner(System.in);

        System.out.printf("Escolha a estação atual do ano:%n" +
                "Digite 1 - Verão%n" +
                "Digite 2 - Outono%n" +
                "Digite 3 - Inverno%n" +
                "Digite 4 - Primavera%n");
        int estacao = Integer.parseInt(entrada.nextLine());

        if(estacao < 1 || estacao > 4){
            System.out.println("Opção inválida!");
            System.out.println("### FIM DO PROGRAMA ###");
        }else{
            if(estacao == 1){
                System.out.println("Você escolheu a estação: Verão!");
            }
            if(estacao == 2){
                System.out.println("Você escolheu a estação: Outono!");
            }
            if(estacao == 3){
                System.out.println("Você escolheu a estação: Inverno!");
            }
            if(estacao == 4){
                System.out.println("Você escolheu a estação: Primavera!");
            }
        }
        entrada.close();
    }
}
