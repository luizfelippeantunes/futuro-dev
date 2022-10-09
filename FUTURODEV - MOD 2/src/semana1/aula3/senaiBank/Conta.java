package semana1.aula3.senaiBank;

public class Conta {
    private int agencia;
    private int conta;
    private char digito;
    private double saldo = 0;

    private double limite = 1000;
    private Cliente titular = new Cliente();

    public double getSaldo() {
        return saldo;
    }

    public double getLimite() {
        return limite;
    }

    public Cliente getTitular() {
        return titular;
    }

    public int getConta() {
        return conta;
    }

    public int getAgencia() {
        return agencia;
    }

    public char getDigito() {
        return digito;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public void setDigito(char digito) {
        this.digito = digito;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public void deposita(double valor) {
        this.saldo += valor;
    }

    public boolean saca(double valor) {
        if (valor <= this.saldo) {
            this.saldo -= valor;
            return true;
        }
        return false;
    }


}
