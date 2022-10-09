package semana3.exercicios3.m2s03ex5;

public class VendedorComissionado extends Vendedor {
    protected double taxaComissao;

    public double getTaxaComissao() {
        return taxaComissao;
    }

    public void setTaxaComissao(double taxaComissao) {
        if (taxaComissao >= 0 && taxaComissao <= 1) {
            this.taxaComissao = taxaComissao;
        } else {
            System.out.println("Valor de comiss�o inv�lido.");
        }
    }

    public double getSalario() {
        return super.salarioBase + (this.taxaComissao * super.valorVendidoMes);
    }
}
