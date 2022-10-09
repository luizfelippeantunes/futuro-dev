package semana3.aula1.models;

public class ContaPoupanca extends Conta {
    public ContaPoupanca(String nomeTitular, String sobrenomeTitular, String cpfTitular) {
        super(nomeTitular, sobrenomeTitular, cpfTitular);
    }

    public ContaPoupanca(String nomeTitular, String sobrenomeTitular,
                         String cpfTitular, double saldoInicial) {
        super(nomeTitular, sobrenomeTitular, cpfTitular, saldoInicial);
    }
}
