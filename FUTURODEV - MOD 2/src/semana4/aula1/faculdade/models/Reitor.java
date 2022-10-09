package semana4.aula1.faculdade.models;

public class Reitor extends Funcionario {

    @Override
    public double getGastos() {
        return this.getSalario();
    }
    @Override
    public String getInfo() {
        return super.getInfo() + " É reitor.";
    }
}