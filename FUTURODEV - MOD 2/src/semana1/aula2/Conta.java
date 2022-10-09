package semana1.aula2;

public class Conta {
    public Cliente titular = new Cliente();
    public double saldo;
    public double limite = 50;

    public boolean sacar(double valor) {
        // this.saldo = this.saldo - valor;

        if (this.getSaldo() >= valor) {
            this.saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
            return true;
        } else {
            System.out.println("Saque de R$" + valor + " não realizado. Saldo insuficiente.");
            return false;
        }
    }

    public void depositar(double valor) {
        this.saldo += valor;
        System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
    }

    public double getSaldo() {
        return this.saldo + this.limite;
    }

    public String getNomeTitular() {
        return this.titular.nome;
    }

    public void transferePara(Conta conta, double valor) {
        if (this.sacar(valor)) {
            conta.depositar(valor);
        }
    }
}
