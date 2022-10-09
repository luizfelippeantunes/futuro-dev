package semana2.aula2.contaBancaria;

public class Conta {
    private static int totalContas;
    private Cliente titular;
    private double saldo;

    private double limite;

    private boolean ativa = true;

    private int numeroDeConta;

    public Conta(String nome, String sobrenome, String cpf, double saldoInicial) {
        this(nome, sobrenome, cpf);
        this.depositar(saldoInicial);
    }

    public Conta(String nomeTitular, String sobrenomeTitular, String cpfTitular) {
        this.titular = new Cliente(nomeTitular, sobrenomeTitular, cpfTitular);
        this.numeroDeConta = ++totalContas;
    }

    public boolean sacar(double valorSaque) {
        if (this.saldo - valorSaque >= this.limite) {
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
        return this.saldo + this.limite;
    }

    public Cliente getTitular() {
        return titular;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
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
}
