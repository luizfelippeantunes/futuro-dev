package semana3.exercicios3.m2s03ex6;

public class VendedorComissionado extends Vendedor {
    protected double taxaComissao;

    public VendedorComissionado(String nome, String sobrenome, double salarioBase, double taxaComissao) {
        super(nome, sobrenome, salarioBase);
        this.taxaComissao = taxaComissao;
    }

    public double getTaxaComissao() {
        return taxaComissao;
    }

    public void setTaxaComissao(double taxaComissao) {
        if (taxaComissao >= 0 && taxaComissao <= 1) {
            this.taxaComissao = taxaComissao;
        } else {
            System.out.println("Valor de comissão inválido.");
        }
    }

    @Override
    public String toString() {
        return super.toString() + " Comissão de: " + (this.taxaComissao * 100) + "%.";
    }

    @Override
    public double getSalario() {
        return super.salarioBase + (this.taxaComissao * super.valorVendidoMes);
    }
}
