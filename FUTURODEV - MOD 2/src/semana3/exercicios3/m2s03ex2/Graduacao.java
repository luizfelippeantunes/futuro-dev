package semana3.exercicios3.m2s03ex2;

public abstract class Graduacao extends Estudante {

    private boolean estagio;

    public Graduacao(String nome, int anoFormatura, int anoIngresso, int matricula, boolean estagio) {
        super(nome, anoFormatura, anoIngresso, matricula);
        this.estagio = estagio;
    }
}