package semana2.exercicios2;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        /*
        Crie um programa em Java que, utilizando a classe Scanner, pe�a ao usu�rio para inserir um n�mero inteiro.
        O programa deve verificar se o n�mero � par ou �mpar, e exibir essa informa��o de volta ao usu�rio.
        */
        //Programa criado pelo aluno Luiz Felippe Antunes - Turma Brava (FUTURO DEV)
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um n�mero:");
        int numero = Integer.parseInt(entrada.nextLine());

        if (numero % 2 == 0){
            System.out.println("O n�mero digitado � par.");
        } else{
            System.out.println("O n�mero digitado � �mpar.");
        }
        entrada.close();
    }
}