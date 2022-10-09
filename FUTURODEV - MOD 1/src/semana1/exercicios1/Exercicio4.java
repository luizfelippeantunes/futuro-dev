package semana1.exercicios1;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        /*
        Crie um programa em Java que pergunte ao usuário seu último sobrenome e em seguida exiba
        na tela o texto "Olá, X. Seu sobrenome contém y letras?, onde X é o sobrenome em letras
        maiúsculas, e y é a quantidade de letras desse sobrenome.
        */
        //Programa criado pelo aluno Luiz Felippe Antunes - Turma Brava (FUTURO DEV)
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite seu último sobrenome:");
        String sobrenome = entrada.nextLine();

        sobrenome = sobrenome.trim();
        sobrenome = sobrenome.toUpperCase();
        int sobrenomeContador = sobrenome.length();

        System.out.printf("Olá %s, seu sobrenome contém %d letras.", sobrenome, sobrenomeContador);

        entrada.close();
    }
}
