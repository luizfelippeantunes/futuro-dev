package semana3.aula2.faculdade.models;

import semana4.aula1.faculdade.models.Funcionario;

public class Professor extends Funcionario {
    private int horasDeAula;

    @Override
    public double getGastos() {
        return this.getSalario() + this.horasDeAula * 10;
    }

    public int getHorasDeAula() {
        return horasDeAula;
    }

    public void setHorasDeAula(int horasDeAula) {
        this.horasDeAula = horasDeAula;
    }

    @Override
    public String getInfo() {
        String infoBasica = super.getInfo();
        String infoProfessor = infoBasica + " Horas de aula: " + this.horasDeAula;

        return infoProfessor;
    }
}
