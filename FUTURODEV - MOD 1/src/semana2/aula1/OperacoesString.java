package semana2.aula1;

import java.util.Scanner;

public class OperacoesString {
    public static void main(String[] args) {
        //String nome = "Luiz Felippe";
        //System.out.println(nome.length());

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nome = entrada.nextLine();

        System.out.println("Digite seu sobrenome:");
        String sobrenome = entrada.nextLine();

        String nomeCompleto = nome + " " + sobrenome; //para unir o nome e sobrenome

        System.out.printf("%s, seu nome completo possui %d caracteres.", nomeCompleto, nomeCompleto.length());

        System.out.println(); //apenas para pular uma linha no resultado
        System.out.println(nome.toUpperCase()); //Para deixar tudo maiusculo
        System.out.println(sobrenome.toLowerCase()); //Para deixar tudo minusculo

        System.out.println(nome.trim()); //para retirar os espaços no inicio e no final do valor digitado pelo usuário

        System.out.println(nome.equals("luiz")); //usado para comparar strings (case sensitive)
        System.out.println(nome.equalsIgnoreCase("luiz")); //usado para comparar strings (ignorando o case sensitive)

        System.out.println(nome);
    }
}
