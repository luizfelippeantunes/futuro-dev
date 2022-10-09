package semana3.aula2;

import java.util.Scanner;

public class Tarefa2 {
    public static void main(String[] args) {
        /*Escreva um programa em java que apresente um menu num�rico para o usu�rio com 5 op��es de pratos em um restaurante.
        A op��o 1 representa o prato frango frito, a op��o 2 representa costela assada, a op��o 3 representa frngo � milanesa,
        a op��o 4 representa peixe empanado, e a op��o 5 representa macarr�o ao molho branco.
        O usu�rio deve fornecer a op��o como n�mero inteiro.
        E o programa deve imprimir o prato escolhido pelo usu�rio, de acordo com a op��o num�rica escolhida.*/

        //Exerc�cio feito pelo aluno Luiz Felippe - Turma Brava

        Scanner entrada = new Scanner(System.in);
        System.out.println("Escolha o seu prato, digitando o n�mero desejado: \n" +
                "1 - Frango Frito \n" +
                "2 - Costela Assada \n" +
                "3 - Frango � milanesa \n" +
                "4 - Peixe empanado \n" +
                "5 - Macarr�o ao molho branco \n");
        int prato = entrada.nextInt();
        switch (prato){
            case 1:
                System.out.println("Prato escolhido: Frango Frito");
                break;
            case 2:
                System.out.println("Prato escolhido: Costela Assada");
                break;
            case 3:
                System.out.println("Prato escolhido: Frango � milanesa");
                break;
            case 4:
                System.out.println("Prato escolhido: Peixe empanado");
                break;
            case 5:
                System.out.println("Prato escolhido: Macarr�o ao molho branco");
                break;
            default:
                System.out.println("N�mero do prato inv�lido!");
                break;
        }
        entrada.close();
    }
}
