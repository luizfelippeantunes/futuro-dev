package semana2.aula1;

import java.util.Scanner;

public class ConversaoDeTipos {
    public static void main(String[] args) {
        int idade = 33;
        double altura = 1.75;

        int alturaInt = (int) altura;

        String idadeString = Integer.toString(idade);

        System.out.println("Sua idade é: " + idadeString + " anos.");

        //altura = Double.parseDouble("1.75");

        //System.out.println(altura);

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a sua altura:");
        String alturaString = entrada.nextLine();

        altura = Double.parseDouble(alturaString);

        System.out.println(altura);
    }
}
