package semana1.exercicios1.m2s01ex1;

public class TestaConta {
    public static void main(String[] args) {
        ContaBancaria c1 = new ContaBancaria();

        c1.setAgencia(1111);
        c1.setNumero(123456);
        c1.setNomeDoTitular("Luiz Felippe");
        c1.setDataAbertura("13/08/2022");

        System.out.printf("%nA conta nº %d, agência nº %d, aberta em %s, pertence à %s.%n", c1.getNumero(), c1.getAgencia(), c1.getDataAbertura(), c1.getNomeDoTitular());
        System.out.printf("Saldo atual de R$ %.2f. E limite de R$ %.2f disponível.%n%n", c1.getSaldo(), c1.getLimite());

        c1.sacar(500);
        System.out.printf("Saldo atual de R$ %.2f. E limite de R$ %.2f disponível.%n%n", c1.getSaldo(), c1.getLimite());

        c1.depositar(300);
        System.out.printf("Saldo atual de R$ %.2f. E limite de R$ %.2f disponível.%n%n", c1.getSaldo(), c1.getLimite());

        c1.depositar(2500);
        System.out.printf("Saldo atual de R$ %.2f. E limite de R$ %.2f disponível.%n%n", c1.getSaldo(), c1.getLimite());

        c1.sacar(1000);
        System.out.printf("Saldo atual de R$ %.2f. E limite de R$ %.2f disponível.%n%n", c1.getSaldo(), c1.getLimite());

        c1.sacar(1300);
        System.out.printf("Saldo atual de R$ %.2f. E limite de R$ %.2f disponível.%n%n", c1.getSaldo(), c1.getLimite());

        c1.sacar(2000);
        System.out.printf("Saldo atual de R$ %.2f. E limite de R$ %.2f disponível.%n%n", c1.getSaldo(), c1.getLimite());
    }
}
