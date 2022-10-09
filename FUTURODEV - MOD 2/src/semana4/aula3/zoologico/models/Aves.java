package semana4.aula3.zoologico.models;

public abstract class Aves extends Animal{

    protected boolean temAsas;

    public Aves(String nome, String cor, double tamanho, double peso, boolean temAsas) {
        super(nome, cor, tamanho, peso);
        this.temAsas = temAsas;
    }
}
