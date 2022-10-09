package semana3.exercicios3.m2s03ex2;

public abstract class PosGraduacao extends Estudante{

    private boolean artigo;

    public PosGraduacao(String nome, int anoFormatura, int anoIngresso, int matricula, boolean artigo) {
        super(nome, anoFormatura, anoIngresso, matricula);
        this.artigo = artigo;
    }
}