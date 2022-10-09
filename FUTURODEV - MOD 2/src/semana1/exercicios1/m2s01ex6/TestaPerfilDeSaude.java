package semana1.exercicios1.m2s01ex6;

import java.util.Scanner;

public class TestaPerfilDeSaude {
    public static void main(String[] args) {
        PerfilDeSaude ps1 = new PerfilDeSaude();

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o seu nome:");
        ps1.nome = entrada.nextLine();
        ps1.nome = ps1.nome.trim();

        System.out.println("Digite o seu sobrenome:");
        ps1.sobrenome = entrada.nextLine();
        ps1.sobrenome = ps1.sobrenome.trim();

        System.out.println("Digite o seu sexo:");
        ps1.sexo = entrada.nextLine();
        ps1.sexo = ps1.sexo.trim();

        System.out.println("Digite o seu peso:");
        ps1.peso = Double.parseDouble(entrada.nextLine());

        System.out.println("Digite a sua altura:");
        ps1.altura = Double.parseDouble(entrada.nextLine());

        System.out.println("Digite o dia que voc� nasceu:");
        ps1.diaNasc = Integer.parseInt(entrada.nextLine());

        System.out.println("Digite o m�s que voc� nasceu:");
        ps1.mesNasc = Integer.parseInt(entrada.nextLine());

        System.out.println("Digite o ano que voc� nasceu:");
        ps1.anoNasc = Integer.parseInt(entrada.nextLine());

        String dataNasc = String.valueOf(ps1.diaNasc) + "/" + String.valueOf(ps1.mesNasc) + "/" + String.valueOf(ps1.anoNasc);

        System.out.printf("%n%s %s, %s, tem %.2fm de altura e %.2f kg, nasceu em %s e portanto tem %d anos.%n",
                ps1.nome, ps1.sobrenome, ps1.sexo, ps1.altura, ps1.peso, dataNasc, ps1.idade(ps1.diaNasc, ps1.mesNasc, ps1.anoNasc));
        System.out.printf("O seu IMC � de %.2f kg/m2.%n", ps1.IMC(ps1.altura, ps1.peso));
        System.out.println("A sua frequ�ncia card�aca m�xima � de " + ps1.freqMaxima() + ".");
        System.out.println("E seu intervalo de frequ�ncia card�aca alvo � de " + ps1.freqAlvo(ps1.freqMaxima()) + ".");

        entrada.close();
    }
}
