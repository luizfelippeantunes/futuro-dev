package semana1.exercicios1;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        /*
        Crie um programa em Java que, utilizando a classe Scanner, pergunte ao usuário seu sobrenome, depois seu nome,
        e então escreva na tela, em uma única ?string?, o nome completo do usuário. Informe também ao usuário quantas letras
        tem no nome dele. Por exemplo: ?Olá Fulano Silva, seu nome possui 11 letras.?.
         *///Programa criado pelo aluno Luiz Felippe Antunes - Turma Brava (FUTURO DEV)
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite seu primeiro nome:");
        String nome = entrada.nextLine();

        System.out.println("Digite seu sobrenome:");
        String sobrenome = entrada.nextLine();

        nome = nome.trim();
        sobrenome = sobrenome.trim();

        String nomeCompleto = nome + " " + sobrenome;
        int nomeContador = (nome.length()) + (sobrenome.length());

        System.out.printf("%s, seu nome completo possui %d letras.", nomeCompleto, nomeContador);

        entrada.close();
    }
}
