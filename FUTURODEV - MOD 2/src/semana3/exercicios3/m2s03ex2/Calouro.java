package semana3.exercicios3.m2s03ex2;

public class Calouro extends Graduacao {

    private boolean trote;

    public Calouro(String nome, int anoFormatura, int anoIngresso, int matricula, boolean estagio, boolean trote) {
        super(nome, anoFormatura, anoIngresso, matricula, estagio);
        this.trote = trote;
    }
}