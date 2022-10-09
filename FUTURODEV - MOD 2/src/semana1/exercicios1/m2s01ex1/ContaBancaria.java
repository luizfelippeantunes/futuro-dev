package semana1.exercicios1.m2s01ex1;

public class ContaBancaria {
    private String nomeDoTitular;
    private int numero;
    private int agencia;
    private double saldo;
    private double limite = 1000;
    private String dataAbertura;

    public boolean sacar(double valor) {
        if (this.getSaldo() + this.getLimite() >= valor) {
            this.saldo -= valor;
            System.out.printf("Saque de R$ %.2f realizado com sucesso.%n", valor);
            return true;
        } else {
            System.out.printf("Saque de R$ %.2f não realizado. Saldo insuficiente e não possui limite suficiente para utilizar.%n", valor);
            return false;
        }
    }

    public void depositar(double valor) {
        this.saldo += valor;
        System.out.printf("Depósito de R$ %.2f realizado com sucesso.%n", valor);
    }

    public double getSaldo() {
        return this.saldo;
    }

    public double getLimite() {
        if (this.saldo < 0) {
            return this.limite + this.saldo;
        }
        return limite;
    }

    public String getNomeDoTitular() {
        return nomeDoTitular;
    }

    public int getNumero() {
        return numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public String getDataAbertura() {
        return dataAbertura;
    }

    public void setNomeDoTitular(String nomeDoTitular) {
        this.nomeDoTitular = nomeDoTitular;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public void setDataAbertura(String dataAbertura) {
        this.dataAbertura = dataAbertura;
    }
}
