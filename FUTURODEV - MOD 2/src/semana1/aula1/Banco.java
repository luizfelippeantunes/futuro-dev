package semana1.aula1;

public class Banco {
    public static void main(String[] args) {

        Conta minhaConta = new Conta();

        minhaConta.nomeTitular = "Luiz Felippe Antunes";
        minhaConta.saldo = 1000;
        minhaConta.limite = 500;

        System.out.printf("O cliente %s possui um saldo de R$ %.2f%n", minhaConta.nomeTitular, minhaConta.saldo);

        minhaConta.sacar(200);
        System.out.printf("O cliente %s possui um saldo de R$ %.2f%n", minhaConta.nomeTitular, minhaConta.saldo);

        minhaConta.depositar(700);
        System.out.printf("O cliente %s possui um saldo de R$ %.2f%n", minhaConta.nomeTitular, minhaConta.saldo);

        System.out.printf("O cliente %s possui um saldo total de R$ %.2f (Saldo + Limite)%n", minhaConta.nomeTitular, minhaConta.getSaldo());
    }
}