package semana4.aula1.empresa.models;

public class FuncionarioMensalista extends Funcionario {

    private double salario;

    @Override
    public double calculaSalario() {
        return this.salario;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + " Salário: R$ " + this.salario + ".";
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
