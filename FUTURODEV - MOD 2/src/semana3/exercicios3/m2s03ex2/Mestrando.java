package semana3.exercicios3.m2s03ex2;

public class Mestrando extends PosGraduacao {

    private boolean dissertacao;

    public Mestrando(String nome, int anoFormatura, int anoIngresso, int matricula, boolean artigo, boolean trote) {
        super(nome, anoFormatura, anoIngresso, matricula, artigo);
        this.dissertacao = dissertacao;
    }
}