package semana3.exercicios3.m2s03ex2;

public abstract class Estudante {
    private String nome;
    private int anoFormatura;
    private int anoIngresso;
    private int matricula;

    public Estudante(String nome, int anoFormatura, int anoIngresso, int matricula) {
        this.nome = nome;
        this.anoFormatura = anoFormatura;
        this.anoIngresso = anoIngresso;
        this.matricula = matricula;
    }
}