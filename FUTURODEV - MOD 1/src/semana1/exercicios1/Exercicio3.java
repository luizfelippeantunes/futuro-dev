package semana1.exercicios1;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        /*
        Você pode utilizar o código do exercício anterior para este exercício.
        Crie um programa em Java que, utilizando a classe Scanner, pergunte ao usuário seu sobrenome,
        depois seu nome, e então escreva na tela o nome completo do usuário, seguido por suas iniciais.
        Por exemplo: ?Olá Fulano Silva, suas iniciais são F.S.?
         */
        //Programa criado pelo aluno Luiz Felippe Antunes - Turma Brava (FUTURO DEV)
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite seu primeiro nome:");
        String nome = entrada.nextLine();

        System.out.println("Digite seu sobrenome:");
        String sobrenome = entrada.nextLine();

        nome = nome.trim();
        sobrenome = sobrenome.trim();
        char inicialNome = nome.charAt(0);
        char inicialSobrenome = sobrenome.charAt(0);

        String nomeCompleto = nome + " " + sobrenome;

        System.out.printf("%s, suas iniciais são: %s.%s.", nomeCompleto, inicialNome, inicialSobrenome);

        entrada.close();
    }
}
