package semana4.aula3.zoologico.models;

public abstract class Mamiferos extends Animal{

    private boolean mama;

    public Mamiferos(String nome, String cor, double tamanho, double peso, boolean mama) {
        super(nome, cor, tamanho, peso);
        this.mama = mama;
    }

    public boolean mamar(){
        return this.mama;
    }
}
