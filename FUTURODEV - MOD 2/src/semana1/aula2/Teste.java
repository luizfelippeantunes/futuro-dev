package semana1.aula2;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        int a = 10;
        int b = a;

        b = 20;

        System.out.println("Valor de 'a' é: " + a);
        System.out.println("Valor de 'b' é: " + b);


        Conta c1 = new Conta();
        c1.depositar(100);

        Conta c2 = c1;

        c2.depositar(50);

        System.out.println(c1.getSaldo());
        System.out.println(c2.getSaldo());

        System.out.println(c1);
        System.out.println(c2);

        System.out.println(c1 == c2);

        Conta conta1 = new Conta();
        Conta conta2 = new Conta();

        conta1.titular.nome = "Luna";
        conta1.saldo = 50;

        conta2.titular.nome = "Ricardo";
        conta2.saldo = 50;

        System.out.println(conta1 == conta2);

        System.out.println(conta1.saldo == conta2.saldo);

        Scanner input = new Scanner(System.in);

        System.out.println("Insira um valor para transferir: ");

        double valorTransferencia = Double.parseDouble(input.nextLine());

        conta1.transferePara(conta2, valorTransferencia);

        System.out.printf("O saldo da conta de %s é de R$%.2f.%n", conta1.titular.nome, conta1.getSaldo());
        System.out.printf("O saldo da conta de %s é de R$%.2f.%n", conta2.titular.nome, conta2.getSaldo());
    }
}
