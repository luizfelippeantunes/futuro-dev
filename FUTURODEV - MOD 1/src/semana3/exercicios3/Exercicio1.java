package semana3.exercicios3;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        /*
        O ano � dividido em quatro esta��es: Ver�o, Outono, Inverno e Primavera.
        Escreva um programa que capture a esta��o do ano atual do usu�rio.
        O usu�rio deve informar a esta��o do ano como um n�mero inteiro, a saber:
            -Se o usu�rio informar o n�mero 1, significa ver�o.
            -Se o usu�rio informar o n�mero 2, significa outono.
            -Se o usu�rio informar o n�mero 3, significa inverno.
            -Se o usu�rio informar o n�mero 4, significa primavera.
        Ap�s o programa capturar a esta��o do ano do usu�rio como um n�mero inteiro, o programa deve imprimir
        na tela o nome da esta��o correspondente ao n�mero digitado pelo usu�rio.
        */
        //Programa criado pelo aluno Luiz Felippe Antunes - Turma Brava (FUTURO DEV)
        Scanner entrada = new Scanner(System.in);

        System.out.printf("Escolha a esta��o atual do ano:%n" +
                "Digite 1 - Ver�o%n" +
                "Digite 2 - Outono%n" +
                "Digite 3 - Inverno%n" +
                "Digite 4 - Primavera%n");
        int estacao = Integer.parseInt(entrada.nextLine());

        if(estacao < 1 || estacao > 4){
            System.out.println("Op��o inv�lida!");
            System.out.println("### FIM DO PROGRAMA ###");
        }else{
            if(estacao == 1){
                System.out.println("Voc� escolheu a esta��o: Ver�o!");
            }
            if(estacao == 2){
                System.out.println("Voc� escolheu a esta��o: Outono!");
            }
            if(estacao == 3){
                System.out.println("Voc� escolheu a esta��o: Inverno!");
            }
            if(estacao == 4){
                System.out.println("Voc� escolheu a esta��o: Primavera!");
            }
        }
        entrada.close();
    }
}
