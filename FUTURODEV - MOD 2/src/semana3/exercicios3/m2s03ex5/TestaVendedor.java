package semana3.exercicios3.m2s03ex5;

public class TestaVendedor {
    public static void main(String[] args) {

        VendedorComissionado fulano = new VendedorComissionado();

        fulano.setNome("Fulano");
        fulano.setSobrenome("Pereira");
        fulano.setValorVendidoMes(100);
        fulano.setSalarioBase(1000);
        fulano.setTaxaComissao(1);

        System.out.println("o salário do mês do " + fulano.getNome() + " foi de " + fulano.getSalario() + " reais.");
    }
}
