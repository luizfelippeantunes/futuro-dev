package semana2.exercicios2;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        /*
        Crie um programa em Java que, utilizando a classe Scanner, simule uma calculadora. O programa deve pedir
        um número, depois outro, e por último uma operação. O sistema deve aceitar como operação qualquer uma
        dessas 4 opções: ?somar?, ?subtrair?, ?multiplicar? ou "dividir", e realizar a operação correspondente
        entre os 2 números inseridos, para então escrever na tela do usuário o resultado.
         */
        //Programa criado pelo aluno Luiz Felippe Antunes - Turma Brava (FUTURO DEV)
        Scanner entrada = new Scanner(System.in);

        System.out.println("");
        System.out.println("### CALCULADORA DO LUIZ FELIPPE ###");
        System.out.println("");
        System.out.printf("Escolha uma das operações abaixo:%n%n" +
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
                System.out.printf("Você escolheu somar os valores: %.2f + %.2f = %.2f.", valor1, valor2, resultado);
            } if (operacao.equals("-")){
                double resultado = valor1 - valor2;
                System.out.printf("Você escolheu subtrair os valores: %.2f - %.2f = %.2f.", valor1, valor2, resultado);
            } if (operacao.equals("/")){
                double resultado = valor1 / valor2;
                System.out.printf("Você escolheu dividir os valores: %.2f ÷ %.2f = %.2f.", valor1, valor2, resultado);
            } if (operacao.equals("*")){
                double resultado = valor1 * valor2;
                System.out.printf("Você escolheu multiplicar os valores: %.2f x %.2f = %.2f.", valor1, valor2, resultado);
            }
        } else{
            System.out.println("Operação incorreta, tente novamente!");
            System.out.println("### FIM DO PROGRAMA ###");
        }
        entrada.close();
    }
}
