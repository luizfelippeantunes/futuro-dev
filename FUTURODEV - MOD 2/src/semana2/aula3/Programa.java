package semana2.aula3;

public class Programa {
    public static void main(String[] args) {
        Cliente guido = new Cliente("Guido Filho", "123.456.789-00", "Programador");
        Conta contaDoGuido = new Conta(1234, 5678, guido, 1000);
        contaDoGuido.depositar(300);
        System.out.println("Agência da conta: " + contaDoGuido.getAgencia());
        System.out.println("Número da conta: " + contaDoGuido.getNumeroConta());
        System.out.println("Saldo atual da conta: " + contaDoGuido.getSaldo());
        System.out.println("Limite atual da conta: " + contaDoGuido.getLimite());
        boolean conseguiSacar = contaDoGuido.sacar(500);
        System.out.println(conseguiSacar);
        System.out.println("Saldo depois do saque: " + contaDoGuido.getSaldo());
        System.out.println(contaDoGuido.getTitular().getNome());
    }
}