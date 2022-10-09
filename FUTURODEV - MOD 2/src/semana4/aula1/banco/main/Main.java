package semana4.aula1.banco.main;

import semana4.aula1.banco.models.ContaCorrente;
import semana4.aula1.banco.models.ContaPoupanca;
import semana4.aula1.banco.models.Cliente;
import semana4.aula1.banco.models.Conta;

public class Main {
    public static void main(String[] args) {

        //instanciar c1 corrente e c1 poupança, usando atributos e métodos de Conta
        ContaCorrente cc = new ContaCorrente("Luna",
                "Oliveira", "28342837");

        cc.depositar(100);
        System.out.println("Depositados 100 na c1 corrente.");
        cc.setLimite(50);
        System.out.println("Definido limite de 50 para a c1 corrente.");

        System.out.println("Saldo é: " + cc.getSaldo());

        ContaPoupanca cp = new ContaPoupanca("Marina",
                "Larissa", "4564654");

        cp.setAtiva(true);
        cp.depositar(300);
        // cp.setLimite(50); // não existe aqui
        System.out.println("Saldo da c1 poupança: " + cp.getSaldo());

        Conta c1 = new Conta("José",
                "Yuri", "298759854");
        // c1.setLimite(50); // não existe aqui
        // apenas para exemplificar o modificador de acesso protected:
        // System.out.println(c1.teste());

        c1.depositar(200);
        System.out.println("Saldo da Conta é: " + c1.getSaldo());

        Conta c2 = new Conta("José",
                "Yuri", "298759854");
        c2.depositar(200);

        System.out.println("c1 é igual a c2?");
        System.out.println(c1.equals(c2));

        Conta c3 = c1; // mesma

        System.out.println("c3 é igual a c1?");
        System.out.println(c1.equals(c3));
        System.out.println("Conta: " + c1);
        System.out.println("c3: " + c3);

        int idade = 31;
        int idade2 = idade;

        Conta c4 = null;

        System.out.println("c1 é igual a c4?");
        System.out.println(c1.equals(c4));

        System.out.println("teste".equals("teste"));
        System.out.println(10);
        System.out.println(5.5);
        System.out.println(cp);

        System.out.println(soma(1.5, 3.2));

        Cliente cli = new Cliente();

        Cliente cli2 = new Cliente();

        System.out.println("cli é igual cli2?");
        System.out.println(cli.equals(cli2));
    }

    public static int soma(int a, int b) {
        return a + b;
    }

    public static double soma(double a, double b) {
        return a + b;
    }
}
