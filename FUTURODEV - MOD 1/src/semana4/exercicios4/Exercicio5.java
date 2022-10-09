package semana4.exercicios4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Exercicio5 {
    public static void main(String[] args) {
        /*
        Repita o procedimento do exerc�cio 3 para criar um array list com os 15 alunos da escola.
        No entanto, voc� deve usar o conceito de pilha para refazer o algoritmo que adiciona os alunos.
        Depois de adicionar os alunos, imprima a lista de alunos.
        Para simular o t�rmino de matr�cula de cinco alunos, utilize o conceito da pilha para remover
        os cinco alunos com matr�cula cancelada.
        */
        //Programa criado pelo aluno Luiz Felippe Antunes - Turma Brava (FUTURO DEV)
        Scanner entrada = new Scanner(System.in);

        Stack<String> alunos = new Stack<>();

        for(int i = 1; i <= 15; i++){
            System.out.printf("Digite o nome do %d� aluno:%n", i);
            alunos.push(entrada.nextLine());
        }

        System.out.println();
        System.out.println("Alunos matriculados: " + alunos);

        for(int i =1; i <= 5; i++){
            System.out.println();
            System.out.println("O aluno " + alunos.peek() + " teve a sua matr�cula cancelada!");
            alunos.pop();
        }

        System.out.println();
        System.out.println("Ainda h� " + alunos.size() + " alunos com matr�culas ativas. S�o eles: " + alunos);

        entrada.close();
    }
}
