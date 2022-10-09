package semana4.aula3.zoologico.models;

public class Onca extends Mamiferos{

    public Onca(String nome, String cor, double tamanho, double peso, boolean mama) {
        super(nome, cor, tamanho, peso, mama);
    }

    @Override
    public void comer() {
        super.peso += 5;
    }

    @Override
    public void locomover(double distancia) {
        System.out.println("A onça andou " + distancia + " metros.");
    }

    @Override
    public void dormir() {
        System.out.println("A onça dorme 8 horas por dia.");
    }
}
