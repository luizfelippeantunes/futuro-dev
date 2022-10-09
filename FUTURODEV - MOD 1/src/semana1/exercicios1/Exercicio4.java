package semana1.exercicios1;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        /*
        Crie um programa em Java que pergunte ao usu�rio seu �ltimo sobrenome e em seguida exiba
        na tela o texto "Ol�, X. Seu sobrenome cont�m y letras?, onde X � o sobrenome em letras
        mai�sculas, e y � a quantidade de letras desse sobrenome.
        */
        //Programa criado pelo aluno Luiz Felippe Antunes - Turma Brava (FUTURO DEV)
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite seu �ltimo sobrenome:");
        String sobrenome = entrada.nextLine();

        sobrenome = sobrenome.trim();
        sobrenome = sobrenome.toUpperCase();
        int sobrenomeContador = sobrenome.length();

        System.out.printf("Ol� %s, seu sobrenome cont�m %d letras.", sobrenome, sobrenomeContador);

        entrada.close();
    }
}
