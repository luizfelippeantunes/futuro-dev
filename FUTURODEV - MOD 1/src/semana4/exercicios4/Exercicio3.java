package semana4.exercicios4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        /*
        Uma escola precisa cadastrar seus alunos matriculados. Escreva um programa em java que capture os 15 alunos
        da institui��o. Os alunos devem ser armazenados em um array list. O programa deve imprimir:
            Os alunos com �ndices �mpares no array list.
            O �ltimo aluno da lista.
            O tamanho da lista de alunos.
         */
        //Programa criado pelo aluno Luiz Felippe Antunes - Turma Brava (FUTURO DEV)
        Scanner entrada = new Scanner(System.in);

        List<String> alunos = new ArrayList<>();

        for(int i = 1; i <= 15; i++){
            System.out.printf("Digite o nome do %d� aluno:%n", i);
            alunos.add(entrada.nextLine());
        }
        System.out.println();
        System.out.println("Os alunos com �ndices �mpares no array list s�o:");
        for(int i = 1; i < 15; i = i+2){
            System.out.println(alunos.get(i));
        }
        System.out.println();
        System.out.println("�ltimo aluno matriculado: " + alunos.get(alunos.size() - 1));
        System.out.println();
        System.out.println("Total de alunos matriculados: " + alunos.size());

        entrada.close();
    }
}