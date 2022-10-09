package semana4.aula1.empresa.models;

import java.util.List;

public class FolhaPagamento {
    private double total;

    public void calculaTotal(List<Funcionario> listaDeFuncionarios) {
        for (Funcionario funcionario : listaDeFuncionarios){
            this.total += funcionario.calculaSalario();
        }
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
