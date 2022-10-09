package semana2.aula4;

import java.util.Scanner;

public class TestaMaiorIdade {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual o seu nome?");
        String nome = entrada.nextLine();
        System.out.println("Qual sua idade?");
        int idade = entrada.nextInt();
        if (idade >= 18){
            System.out.println(nome + " tem " + idade + " anos e portanto é maior de idade.");
        } else {
            System.out.println(nome + " tem " + idade + " anos e portanto é menor de idade.");
        }
        entrada.close();
    }
}