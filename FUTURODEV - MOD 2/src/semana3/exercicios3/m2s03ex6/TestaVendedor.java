package semana3.exercicios3.m2s03ex6;

public class TestaVendedor {
    public static void main(String[] args) {

        Vendedor joao = new VendedorComissionado("Joao", "Silva", 1000, 0.1);
        Vendedor pedro = new Vendedor("Pedro", "Souza", 500);

        joao.setValorVendidoMes(100);

        System.out.println(joao.toString());
        System.out.println();
        System.out.println(pedro.toString());
        System.out.println();
        System.out.println("O salário do mês do " + joao.getNome() + " foi de R$ " + joao.getSalario() + " reais.");
        System.out.println();
        System.out.println("O salário do mês do " + pedro.getNome() + " foi de R$ " + pedro.getSalario() + " reais.");
    }
}
