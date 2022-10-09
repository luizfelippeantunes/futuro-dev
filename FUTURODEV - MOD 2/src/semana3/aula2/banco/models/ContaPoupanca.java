package semana3.aula2.banco.models;

import semana4.aula1.banco.models.Conta;

public class ContaPoupanca extends Conta {
    public ContaPoupanca(String nomeTitular, String sobrenomeTitular, String cpfTitular) {
        super(nomeTitular, sobrenomeTitular, cpfTitular);
    }

    public ContaPoupanca(String nomeTitular, String sobrenomeTitular,
                         String cpfTitular, double saldoInicial) {
        super(nomeTitular, sobrenomeTitular, cpfTitular, saldoInicial);
    }
}
