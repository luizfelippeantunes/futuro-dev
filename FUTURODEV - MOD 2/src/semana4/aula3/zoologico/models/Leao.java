package semana4.aula3.zoologico.models;

public class Leao extends Mamiferos {

    private double tamanhoJuba;

    public Leao(String nome, String cor, double tamanho, double peso, boolean mama, double tamanhoJuba) {
        super(nome, cor, tamanho, peso, mama);
        this.tamanhoJuba = tamanhoJuba;
    }

    @Override
    public void comer() {
        super.peso += 10;
    }

    @Override
    public void locomover(double distancia) {
        System.out.println("O Leão andou " + distancia + " metros.");
    }

    @Override
    public void dormir() {
        System.out.println("O Leão dorme 18 horas por dia.");
    }
}