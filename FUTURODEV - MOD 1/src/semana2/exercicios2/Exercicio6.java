package semana2.exercicios2;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        /*
        Crie um programa em Java que, utilizando a classe Scanner, pergunte ao usuário a seguinte frase:
        "Adivinhe qual número de 1 a 5 eu estou pensando?". Na sequência, o usuário deve inserir um número
        entre 1 e 5, e o seu programa deve gerar aleatoriamente outro número, também de 1 a 5. Se o número
        gerado for o mesmo que o usuário inseriu, o programa deve escrever na tela "Você acertou!", mas se for
        diferente, o programa deve escrever: "Você errou, o número correto era X", onde X é o
        número gerado aleatoriamente pelo programa.
         */
        //Programa criado pelo aluno Luiz Felippe Antunes - Turma Brava (FUTURO DEV)
        Scanner entrada = new Scanner(System.in);

        System.out.println("### DESAFIO - ADIVINHE O NÚMERO ###");
        System.out.println("");
        System.out.println("Digite um número de 1 a 5:");
        int numeroUser = Integer.parseInt(entrada.nextLine());
        int numeroAleatorio = (int)(Math.random()*(5-1)+1);

        if(numeroUser == numeroAleatorio){
            System.out.println("Você acertou!");
        }else{
            System.out.println("Você errou! O número correto era o " + numeroAleatorio + ".");
        }
        entrada.close();
    }
}
