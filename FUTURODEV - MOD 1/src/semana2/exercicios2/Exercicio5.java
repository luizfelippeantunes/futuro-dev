package semana2.exercicios2;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        /*
        Crie um programa em Java que, utilizando a classe Scanner, simule uma calculadora. O programa deve pedir
        um n�mero, depois outro, e por �ltimo uma opera��o. O sistema deve aceitar como opera��o qualquer uma
        dessas 4 op��es: ?somar?, ?subtrair?, ?multiplicar? ou "dividir", e realizar a opera��o correspondente
        entre os 2 n�meros inseridos, para ent�o escrever na tela do usu�rio o resultado.
         */
        //Programa criado pelo aluno Luiz Felippe Antunes - Turma Brava (FUTURO DEV)
        Scanner entrada = new Scanner(System.in);

        System.out.println("");
        System.out.println("### CALCULADORA DO LUIZ FELIPPE ###");
        System.out.println("");
        System.out.printf("Escolha uma das opera��es abaixo:%n%n" +
                "+ para somar%n" +
                "- para subtrair%n" +
                "/ para dividir%n" +
                "* para multiplicar%n%n" +
                "Digite apenas o operador desejado:%n");
        String operacao = entrada.nextLine();

        if (operacao.equals("+") || operacao.equals("-") || operacao.equals("/") || operacao.equals("*")){

            System.out.println("Digite o primeiro valor:");
            double valor1 = Double.parseDouble(entrada.nextLine());

            System.out.println("Digite o segundo valor:");
            double valor2 = Double.parseDouble(entrada.nextLine());

            if (operacao.equals("+")) {
                double resultado = valor1 + valor2;
                System.out.printf("Voc� escolheu somar os valores: %.2f + %.2f = %.2f.", valor1, valor2, resultado);
            } if (operacao.equals("-")){
                double resultado = valor1 - valor2;
                System.out.printf("Voc� escolheu subtrair os valores: %.2f - %.2f = %.2f.", valor1, valor2, resultado);
            } if (operacao.equals("/")){
                double resultado = valor1 / valor2;
                System.out.printf("Voc� escolheu dividir os valores: %.2f � %.2f = %.2f.", valor1, valor2, resultado);
            } if (operacao.equals("*")){
                double resultado = valor1 * valor2;
                System.out.printf("Voc� escolheu multiplicar os valores: %.2f x %.2f = %.2f.", valor1, valor2, resultado);
            }
        } else{
            System.out.println("Opera��o incorreta, tente novamente!");
            System.out.println("### FIM DO PROGRAMA ###");
        }
        entrada.close();
    }
}
