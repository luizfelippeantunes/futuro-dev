package semana4.aula2.banco.main;

import semana4.aula2.banco.models.Conta;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    private static List<Conta> contas = new ArrayList<>();

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int opcao = 0;

        do {
            System.out.println("Escolha uma opção:");
            System.out.println("1- criar conta");
            System.out.println("2- ver saldo");
            System.out.println("3- sacar");
            System.out.println("4- depositar");
            System.out.println("0- sair");
            opcao = Integer.parseInt(input.nextLine());

            switch (opcao) {
                case 0:
                    System.out.println("Contas criadas nessa sessão:");
                    for (Conta conta : contas) {
                        System.out.printf("Conta nº %d do cliente %s %s com saldo %.2f.%n",
                                conta.getNumeroDeConta(), conta.getTitular().getNome(),
                                conta.getTitular().getSobrenome(), conta.getSaldo());
                    }
                    break;
                case 1:
                    //invoca metodo de criar conta
                    criaConta(input);
                    break;
                case 2:
                    //invoca metodo de saldo
                    verSaldo(input);
                    break;
                case 3:
                    //invoca sacar
                    sacar(input);
                    break;
                case 4:
                    //invoca depositar
                    depositar(input);
                    break;
                default:
                    System.out.println("Favor selecionar uma opção válida.");
            }
        } while (opcao != 0);
    }

    private static void criaConta(Scanner input) {
        System.out.println("Insira um nome:");
        String nome = input.nextLine();

        System.out.println("Insira um sobrenome:");
        String sobrenome = input.nextLine();

        System.out.println("Insira cpf:");
        String cpf = input.nextLine();

        Conta novaConta = new Conta(nome, sobrenome, cpf);
        contas.add(novaConta);
        System.out.println("Nova conta criada com sucesso! Número da conta: " +
                novaConta.getNumeroDeConta());
    }

    private static void verSaldo(Scanner input) {
        System.out.println("De qual conta vc quer ver o saldo?");
        int numeroDaConta = Integer.parseInt(input.nextLine());
        if (numeroDaConta >= contas.size()) {
            System.out.println("Conta não existe.");
        } else {
            Conta contaSelecionada = contas.get(numeroDaConta - 1);
            System.out.println(contaSelecionada.getSaldo());
        }
    }

    private static void sacar(Scanner input) {
        System.out.println("De qual conta vc quer sacar?");
        int numeroDaConta = Integer.parseInt(input.nextLine());

        if (numeroDaConta >= contas.size()) {
            System.out.println("Conta não existe.");
        } else {
            System.out.println("Qual valor do saque?");
            double valorSaque = Double.parseDouble(input.nextLine());

            Conta contaSelecionada = contas.get(numeroDaConta - 1);
            if (contaSelecionada.sacar(valorSaque)) {
                System.out.println("Saque realizado com sucesso.");
            } else {
                System.out.println("Não foi possível sacar. Saldo insuficiente.");
            }
        }
    }

    private static void depositar(Scanner input) {
        System.out.println("Para qual conta você quer depositar?");
        int numeroDaConta = Integer.parseInt(input.nextLine());

        if (numeroDaConta >= contas.size()) {
            System.out.println("Conta não existe.");
        } else {
            System.out.println("Qual valor do depósito?");
            double valorDeposito = Double.parseDouble(input.nextLine());
            Conta contaSelecionada = contas.get(numeroDaConta - 1);
            contaSelecionada.depositar(valorDeposito);
        }
    }
}
