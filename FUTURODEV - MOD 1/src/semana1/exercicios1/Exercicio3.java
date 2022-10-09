package semana1.exercicios1;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        /*
        Voc� pode utilizar o c�digo do exerc�cio anterior para este exerc�cio.
        Crie um programa em Java que, utilizando a classe Scanner, pergunte ao usu�rio seu sobrenome,
        depois seu nome, e ent�o escreva na tela o nome completo do usu�rio, seguido por suas iniciais.
        Por exemplo: ?Ol� Fulano Silva, suas iniciais s�o F.S.?
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

        System.out.printf("%s, suas iniciais s�o: %s.%s.", nomeCompleto, inicialNome, inicialSobrenome);

        entrada.close();
    }
}
