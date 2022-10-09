package semana4.aula2.banco.main;

import semana4.aula2.banco.models.Cliente;
import semana4.aula2.banco.models.Conta;
import semana4.aula2.banco.models.ContaCorrente;
import semana4.aula2.banco.models.ContaPoupanca;

public class Semana3Aula2 {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente("Leonardo",
                "Furghi", "12312321");
        cc.setLimite(50);
        System.out.println("Limite de cc com saldo 0: R$" + cc.getLimite());

        Conta c1 = cc;
        c1.depositar(100);
        System.out.println("Saldo de cc após depósito: R$" + c1.getSaldo());


        // continua sendo um objeto Cliente
        Object o = new Cliente();
        System.out.println("Classe de o: " + o.getClass());


        ContaCorrente contaCorrente2 = new ContaCorrente("", "", "");
        Conta c2 = new Conta("", "", "");

        // contaCorrente2 = c2;
        // ERRO pois eu só posso guardar uma referência da subclasse dentro de ref da superclasse,
        // não o inverso.

        // Cliente cli = c2;
        // ERRO pois essas classes não tem relação de herança.


        Conta contaOrigem = new Conta("Marcelo",
                "Teixeira", "14123423");
        contaOrigem.depositar(100);

        Conta contaDestino = new Conta("Joni",
                "Silva", "13412432");

        contaOrigem.transferePara(contaDestino, 20);

        System.out.println("Saldo do Joni: R$" + contaDestino.getSaldo());

        ContaCorrente ccOrigem = new ContaCorrente("Igor",
                "Medeiros", "12312");
        ccOrigem.depositar(100);

        ContaCorrente ccDestino = new ContaCorrente("Monica",
                "Cancellier", "2342");

        ccOrigem.transferePara(ccDestino, 20);
        System.out.println("Saldo da Mônica: R$" + ccDestino.getSaldo());

        ContaPoupanca cpDestino = new ContaPoupanca("Murilo",
                "Dircksen", "1231");

        ccOrigem.transferePara(cpDestino, 20);
    }
}
