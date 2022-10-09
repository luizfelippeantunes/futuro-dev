package semana4.aula2.empresa.models;

import java.util.List;

public class FolhaPagamento {
    private double total;

    public void calculaTotal(List<Funcionario> listaDeFuncionarios) {
        for (Funcionario funcionario : listaDeFuncionarios) {
            this.total += funcionario.calculaSalario();
        }
    }

    public void calculaTotalGastos(List<ContaAPagar> lista) {
        for (ContaAPagar divida : lista) {
            this.total += divida.calculaGastos();
        }
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
