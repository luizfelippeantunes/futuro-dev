package semana4.aula2.empresa.models;

public class Fatura implements ContaAPagar {

    private Fornecedor fornecedor;
    private double valorNotaFiscal;

    @Override
    public double calculaGastos() {
        return this.getValorNotaFiscal();
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public double getValorNotaFiscal() {
        return valorNotaFiscal;
    }

    public void setValorNotaFiscal(double valorNotaFiscal) {
        this.valorNotaFiscal = valorNotaFiscal;
    }
}
