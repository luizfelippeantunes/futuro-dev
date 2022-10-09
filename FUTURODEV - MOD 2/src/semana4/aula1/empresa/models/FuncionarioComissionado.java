package semana4.aula1.empresa.models;

public class FuncionarioComissionado extends Funcionario {

    private double percentualComissao;
    private double valorVendas;

    @Override
    public double calculaSalario() {
        return this.valorVendas * (this.percentualComissao/100);
    }

    @Override
    public String getInfo() {
        return super.getInfo() + " Percentual de comissionamento: "
                + this.percentualComissao + "%. Total de vendas: "
                + this.valorVendas + ".";
    }

    public double getPercentualComissao() {
        return percentualComissao;
    }

    public void setPercentualComissao(double percentualComissao) {
        this.percentualComissao = percentualComissao;
    }

    public double getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }
}
