package semana4.aula3.zoologico.models;

public class Tigre extends Mamiferos{

    public Tigre(String nome, String cor, double tamanho, double peso, boolean mama) {
        super(nome, cor, tamanho, peso, mama);
    }

    @Override
    public void comer() {
        super.peso += 8;
    }

    @Override
    public void locomover(double distancia) {
        System.out.println("O Tigre andou " + distancia + " metros.");
    }

    @Override
    public void dormir() {
        System.out.println("O Tigre dorme 10 horas por dia.");
    }
}
