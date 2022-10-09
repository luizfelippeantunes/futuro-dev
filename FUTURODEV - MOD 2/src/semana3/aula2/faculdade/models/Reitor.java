package semana3.aula2.faculdade.models;

import semana4.aula1.faculdade.models.Funcionario;

public class Reitor extends Funcionario {

    @Override
    public double getGastos() {
        return 0;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + " É reitor.";
    }
}