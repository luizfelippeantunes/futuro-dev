package semana3.exercicios3.m2s03ex2;

public class Veterano extends Graduacao{

    private boolean tcc;

    public Veterano(String nome, int anoFormatura, int anoIngresso, int matricula, boolean estagio, boolean tcc) {
        super(nome, anoFormatura, anoIngresso, matricula, estagio);
        this.tcc = tcc;
    }
}
