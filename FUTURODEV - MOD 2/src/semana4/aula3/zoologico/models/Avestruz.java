package semana4.aula3.zoologico.models;

public class Avestruz extends Aves{

    public Avestruz(String nome, String cor, double tamanho, double peso, boolean temAsas) {
        super(nome, cor, tamanho, peso, temAsas);
    }

    @Override
    public void comer() {
        super.peso += 3;
    }

    @Override
    public void locomover(double distancia) {
        System.out.println("O Avestruz correu " + distancia + " metros.");
    }

    @Override
    public void dormir() {
        System.out.println("O Avestruz dorme 6 horas por dia.");
    }
}
