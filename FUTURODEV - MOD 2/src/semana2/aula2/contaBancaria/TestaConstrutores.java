package semana2.aula2.contaBancaria;

import java.util.Scanner;

public class TestaConstrutores {
    public static void main(String[] args) {
        System.out.println(soma(2, 2));

        Scanner input = new Scanner(System.in);

        System.out.println("Me diga seu nome:");
        String nome = input.nextLine();

        System.out.println("Me diga seu sobrenome:");
        String sobrenome = input.nextLine();

        System.out.println("Me diga seu CPF:");
        String cpf = input.nextLine();

        System.out.println("Quanto você quer depositar na abertura da conta?");
        double saldoInicial = Double.parseDouble(input.nextLine());

        Conta c1 = new Conta(nome, sobrenome, cpf, saldoInicial);

        System.out.println(Conta.getTotalContas());

        Conta c2 = new Conta("Marina", "Röhrig", "99988877766", 500);
        System.out.println("Total de contas após criar c2: " + Conta.getTotalContas());

        Cliente cli = new Cliente("Monica", "Cancellier", "11122333445");
        Cliente cliente2 = new Cliente();
        cliente2.setNome("Luna");
        System.out.println(cliente2);

        System.out.printf("A pessoa titular da conta 1 é: %s %s, com CPF: %s e saldo de R$%.2f",
                c1.getTitular().getNome(), c1.getTitular().getSobrenome(),
                c1.getTitular().getCpf(), c1.getSaldo());

        System.out.println("Qual valor você deseja sacar?");
        double saque = Double.parseDouble(input.nextLine());

        c1.sacar(saque);

        System.out.printf("O novo saldo de %s é R$%.2f",
                c1.getTitular().getNome(), c1.getSaldo());

        Conta c3 = new Conta("José", "Junges", "123123123");
    }

    public static int soma(int a, int b) {
        return a + b;
    }
}
