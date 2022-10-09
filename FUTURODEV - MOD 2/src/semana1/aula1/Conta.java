package semana1.aula1;

public class Conta {
    String nomeTitular;
    double saldo;
    double limite;

    public void sacar(double valor){
        this.saldo -= valor;
        System.out.printf("Saque de R$ %.2f realizado com sucesso.%n", valor);
    }

    public void depositar (double valor){
        this.saldo += valor;
        System.out.printf("Depósito de R$ %.2f realizado com sucesso.%n", valor);
    }

    public double getSaldo(){
        return this.saldo + this.limite;
    }

}
