package semana1.exercicios1.m2s01ex5;

import java.util.Scanner;

public class TestaFrequenciaCardiaca {
    public static void main(String[] args) {
        FrequenciaCardiaca fc1 = new FrequenciaCardiaca();

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o seu nome:");
        fc1.nome = entrada.nextLine();
        fc1.nome = fc1.nome.trim();

        System.out.println("Digite o seu sobrenome:");
        fc1.sobrenome = entrada.nextLine();
        fc1.sobrenome = fc1.sobrenome.trim();

        System.out.println("Digite o dia que você nasceu:");
        fc1.diaNasc = Integer.parseInt(entrada.nextLine());

        System.out.println("Digite o mês que você nasceu:");
        fc1.mesNasc = Integer.parseInt(entrada.nextLine());

        System.out.println("Digite o ano que você nasceu:");
        fc1.anoNasc = Integer.parseInt(entrada.nextLine());

        String dataNasc = String.valueOf(fc1.diaNasc) + "/" + String.valueOf(fc1.mesNasc) + "/" + String.valueOf(fc1.anoNasc);

        System.out.printf("%n%s %s nasceu em %s e portanto tem %d anos.%n", fc1.nome, fc1.sobrenome, dataNasc, fc1.idade(fc1.diaNasc, fc1.mesNasc, fc1.anoNasc));
        System.out.println("A sua frequência cardíaca máxima é de " + fc1.freqMaxima() + ".");
        System.out.println("E seu intervalo de frequência cardíaca alvo é de " + fc1.freqAlvo(fc1.freqMaxima()) + ".");

        entrada.close();
    }
}
