package semana3.aula2;

import java.util.Scanner;

public class Tarefa2 {
    public static void main(String[] args) {
        /*Escreva um programa em java que apresente um menu numérico para o usuário com 5 opções de pratos em um restaurante.
        A opção 1 representa o prato frango frito, a opção 2 representa costela assada, a opção 3 representa frngo à milanesa,
        a opção 4 representa peixe empanado, e a opção 5 representa macarrão ao molho branco.
        O usuário deve fornecer a opção como número inteiro.
        E o programa deve imprimir o prato escolhido pelo usuário, de acordo com a opção numérica escolhida.*/

        //Exercício feito pelo aluno Luiz Felippe - Turma Brava

        Scanner entrada = new Scanner(System.in);
        System.out.println("Escolha o seu prato, digitando o número desejado: \n" +
                "1 - Frango Frito \n" +
                "2 - Costela Assada \n" +
                "3 - Frango à milanesa \n" +
                "4 - Peixe empanado \n" +
                "5 - Macarrão ao molho branco \n");
        int prato = entrada.nextInt();
        switch (prato){
            case 1:
                System.out.println("Prato escolhido: Frango Frito");
                break;
            case 2:
                System.out.println("Prato escolhido: Costela Assada");
                break;
            case 3:
                System.out.println("Prato escolhido: Frango à milanesa");
                break;
            case 4:
                System.out.println("Prato escolhido: Peixe empanado");
                break;
            case 5:
                System.out.println("Prato escolhido: Macarrão ao molho branco");
                break;
            default:
                System.out.println("Número do prato inválido!");
                break;
        }
        entrada.close();
    }
}
