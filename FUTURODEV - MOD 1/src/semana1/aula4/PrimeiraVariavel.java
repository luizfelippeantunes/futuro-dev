package semana1.aula4;

import java.util.Scanner;

public class PrimeiraVariavel {
    public static void main(String[] args){
        int anoAtual = 2022;
        int anoNasc;
        int idade;
        char inicial;
        String nome;
        double altura;
        boolean estadoCivilEntrada;
        String estadoCivil;

        Scanner entradaDados = new Scanner(System.in);

        System.out.println("Digite o seu nome:");
        nome = entradaDados.nextLine();

        inicial = nome.charAt(0);

        System.out.printf("%s, em que ano você nasceu?%n", nome);
        anoNasc = entradaDados.nextInt();

        idade = anoAtual - anoNasc;

        System.out.printf("%s, qual sua altura?%n", nome);
        altura = entradaDados.nextDouble();

        System.out.printf("%s, você é casado? (True ou False)%n", nome);
        estadoCivilEntrada = entradaDados.nextBoolean();

        if (estadoCivilEntrada == true){
            estadoCivil = "casado";
        } else {
            estadoCivil = "solteiro";
        }

        System.out.printf("%s, começa com a letra %c, nasceu em %d e portanto tem %d anos, tem %.2fm. de altura e é %s.", nome, inicial, anoNasc, idade, altura,estadoCivil);
    }
}