package semana4.exercicios4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        /*
        Uma escola precisa cadastrar seus alunos matriculados. Escreva um programa em java que capture os 15 alunos
        da instituição. Os alunos devem ser armazenados em um array list. O programa deve imprimir:
            Os alunos com índices ímpares no array list.
            O último aluno da lista.
            O tamanho da lista de alunos.
         */
        //Programa criado pelo aluno Luiz Felippe Antunes - Turma Brava (FUTURO DEV)
        Scanner entrada = new Scanner(System.in);

        List<String> alunos = new ArrayList<>();

        for(int i = 1; i <= 15; i++){
            System.out.printf("Digite o nome do %dº aluno:%n", i);
            alunos.add(entrada.nextLine());
        }
        System.out.println();
        System.out.println("Os alunos com índices ímpares no array list são:");
        for(int i = 1; i < 15; i = i+2){
            System.out.println(alunos.get(i));
        }
        System.out.println();
        System.out.println("Último aluno matriculado: " + alunos.get(alunos.size() - 1));
        System.out.println();
        System.out.println("Total de alunos matriculados: " + alunos.size());

        entrada.close();
    }
}