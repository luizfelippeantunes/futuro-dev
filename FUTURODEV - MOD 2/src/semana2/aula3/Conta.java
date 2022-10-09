package semana2.aula3;

public class Conta {
    private int agencia;
    private int numeroConta;
    private double saldo;
    private double limite;
    private Cliente titular;

    public Conta(int agencia, int numeroConta, Cliente titular, double limite) {
        this.agencia = agencia;
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.limite = limite;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public boolean sacar(double valor) {
        if (this.saldo < valor || valor <= 0) {
            return false;
        } else {
            this.saldo -= valor;
            return true;
        }
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getLimite() {
        return limite;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
}
