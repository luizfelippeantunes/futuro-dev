package semana4.aula1.banco.models;

public class ContaCorrente extends Conta {
    public ContaCorrente(String nomeTitular, String sobrenomeTitular, String cpfTitular) {
        super(nomeTitular, sobrenomeTitular, cpfTitular);
        System.out.println("Conta Corrente criada!");
    }

    public ContaCorrente(String nomeTitular, String sobrenomeTitular,
                         String cpfTitular, double saldoInicial) {
        super(nomeTitular, sobrenomeTitular, cpfTitular, saldoInicial);
        System.out.println("Conta Corrente criada!");
    }

    private double limite;

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public double getSaldo() {
        // apenas para exemplificar o modificador de acesso protected:
        // System.out.println(teste());
        return this.limite + super.getSaldo();
    }
}
