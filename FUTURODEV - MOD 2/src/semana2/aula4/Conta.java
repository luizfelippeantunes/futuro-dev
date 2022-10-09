package semana2.aula4;

public class Conta {
    //Vamos criar os atributos combinados em sala de aula para a classe conta
    //Criando o atributo agencia do tipo inteiro
    private int agencia;
    //Criando o atributo numero da conta do tipo inteiro
    private int numeroConta;
    //Criando o atributo saldo do tipo double
    private double saldo;
    //Criando o atributo limite do tipo double
    private double limite;
    //O cliente titular da conta
    private Cliente titular;

    //Assim como fizemos no cliente, vamos criar o construtor da conta vamos passar no construtor a agencia, o numero da conta e o titular e o limite

    public Conta(int agencia, int numeroConta, Cliente titular, double limite) {
        this.agencia = agencia;
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.limite = limite;
    }

    //Vamos criar agora os m�todos depositar e sacar
    //M�todo depositar que recebe um valor do tipo double como parametro
    public void depositar(double valor) {
        //Incrementa o saldo da conta com o valor recebido como parametro, simulando o dep�sito bancario
        this.saldo += valor;
    }

    //M�todo sacar que recebe um valor do tipo double como parametro
    public boolean sacar(double valor) {
        //Vamos fazer um if para ver se o valor est� menor ou igual ao saldo
        if (this.saldo < valor || valor <= 0) {
            //Estamos verificando se o saldo � menor que o valor ou se o valor � menor ou igual a 0
            //Se isso for verdade, o saque n�o acontece e o m�todo retorna falso
            return false;
        } else {
            //Caso o contr�rio, o saque � realizado, subtraindo o saldo do valor
            this.saldo -= valor;
            //Desta forma, retorna verdadeiro
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
