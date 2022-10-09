package semana3.aula1.models;

public class Conta {
    private static int totalContas;
    private Cliente titular;
    private double saldo;
    private boolean ativa = true;
    private int numeroDeConta;

  /*public Conta() {
    System.out.println("Conta nova criada com sucesso!");
  }*/

    public Conta(String nome, String sobrenome, String cpf, double saldoInicial) {
        this(nome, sobrenome, cpf);
        this.depositar(saldoInicial);
    }

    public Conta(String nomeTitular, String sobrenomeTitular, String cpfTitular) {
        this.titular = new Cliente(nomeTitular, sobrenomeTitular, cpfTitular);
        this.numeroDeConta = ++totalContas;
    }

    public boolean sacar(double valorSaque) {
        if (this.saldo - valorSaque >= this.saldo) {
            this.saldo -= valorSaque;
            return true;
        } else {
            return false;
        }
    }

    public void depositar(double valorDeposito) {
        this.saldo += valorDeposito;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public boolean isAtiva() {
        return this.ativa;
    }

    public int getNumeroDeConta() {
        return numeroDeConta;
    }

    public static int getTotalContas() {
        return totalContas;
    }

    protected String teste() {
        return "método acessível somente pelas subclasses e classes do mesmo pacote.";
    }

    @Override
    public String toString() {
        return String.format("Titular da conta: %s %s. Saldo atual: R$%.2f.%n",
                this.getTitular().getNome(), this.getTitular().getSobrenome(),
                this.getSaldo());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass())
            return false;

        Conta outra = (Conta) obj;

        return this.getTitular().equals(outra.getTitular())
                && this.saldo == outra.saldo;
    }
}
