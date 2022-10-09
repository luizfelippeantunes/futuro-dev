package semana2.aula4;

public class Programa {
    public static void main(String[] args) {
        //A planta da casa � a classe, e a casa constru�da � o objeto
        //A especifica��o do cliente � a classe e o cliente criado � o objeto
        //Criando um objeto cliente, usando o operador new atrav�s do construtor do cliente
        Cliente guido = new Cliente("Guido Filho", "123.456.789-00", "Programador");
        //A especifica��o da conta � a classe, e a conta aberta � o objeto
        //Criando um objeto da classe Conta usando o operador new usando o construtor
        Conta contaDoGuido = new Conta(1234, 5678, guido, 1000);
        //Vamos pedir para a conta depositar 300 reais para n�s, chamando o m�todo depositar
        contaDoGuido.depositar(300);
        //imprimindo os dados da conta
        System.out.println("Ag�ncia da conta: " + contaDoGuido.getAgencia());
        System.out.println("N�mero da conta: " + contaDoGuido.getNumeroConta());
        System.out.println("Saldo atual da conta: " + contaDoGuido.getSaldo());
        System.out.println("Limite atual da conta: " + contaDoGuido.getLimite());
        //Vamos sacar uma quantia da conta O retorno do sucesso do saque ser� armazenado em uma vari�vel do tipo boolean
        boolean conseguiSacar = contaDoGuido.sacar(500);
        //imprimindo o sucesso do saque
        System.out.println(conseguiSacar);
        //imprimindo o saldo depois do saque
        System.out.println("Saldo depois do saque: " + contaDoGuido.getSaldo());
        //Imprimindo o nome do cliente da conta
        System.out.println(contaDoGuido.getTitular().getNome());
    }
}
