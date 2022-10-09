package semana2.exercicios2;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        /*
        Crie um programa em Java que, utilizando a classe Scanner, pergunte ao usu�rio a seguinte frase:
        "Adivinhe qual n�mero de 1 a 5 eu estou pensando?". Na sequ�ncia, o usu�rio deve inserir um n�mero
        entre 1 e 5, e o seu programa deve gerar aleatoriamente outro n�mero, tamb�m de 1 a 5. Se o n�mero
        gerado for o mesmo que o usu�rio inseriu, o programa deve escrever na tela "Voc� acertou!", mas se for
        diferente, o programa deve escrever: "Voc� errou, o n�mero correto era X", onde X � o
        n�mero gerado aleatoriamente pelo programa.
         */
        //Programa criado pelo aluno Luiz Felippe Antunes - Turma Brava (FUTURO DEV)
        Scanner entrada = new Scanner(System.in);

        System.out.println("### DESAFIO - ADIVINHE O N�MERO ###");
        System.out.println("");
        System.out.println("Digite um n�mero de 1 a 5:");
        int numeroUser = Integer.parseInt(entrada.nextLine());
        int numeroAleatorio = (int)(Math.random()*(5-1)+1);

        if(numeroUser == numeroAleatorio){
            System.out.println("Voc� acertou!");
        }else{
            System.out.println("Voc� errou! O n�mero correto era o " + numeroAleatorio + ".");
        }
        entrada.close();
    }
}
