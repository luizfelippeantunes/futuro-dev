package semana4.aula3.zoologico.models;

public abstract class Animal {
    private double tamanho;
    protected double peso;
    private String nome;
    private String cor;

    public Animal (String nome, String cor, double tamanho, double peso){
        this.nome = nome;
        this.cor = cor;
        this.tamanho =  tamanho;
        this.peso = peso;
    }

    public abstract void comer();

    public abstract void locomover(double distancia);

    public abstract void dormir();

    public double getTamanho() {
        return tamanho;
    }

    public double getPeso() {
        return peso;
    }

    public String getNome() {
        return nome;
    }

    public String getCor() {
        return cor;
    }
}
