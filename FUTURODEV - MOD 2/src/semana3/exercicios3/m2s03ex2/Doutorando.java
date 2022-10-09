package semana3.exercicios3.m2s03ex2;

public class Doutorando extends PosGraduacao {

    private boolean tese;

    public Doutorando(String nome, int anoFormatura, int anoIngresso, int matricula, boolean artigo, boolean tese) {
        super(nome, anoFormatura, anoIngresso, matricula, artigo);
        this.tese = tese;
    }
}