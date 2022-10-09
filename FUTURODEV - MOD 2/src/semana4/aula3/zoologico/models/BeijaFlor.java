package semana4.aula3.zoologico.models;

public class BeijaFlor extends Aves implements Voador {

    public BeijaFlor(String nome, String cor, double tamanho, double peso, boolean temAsas) {
        super(nome, cor, tamanho, peso, temAsas);
    }

    @Override
    public void comer() {
        super.peso += 0.05;
    }

    @Override
    public void locomover(double distancia) {
        System.out.println("O Beija-Flor voou " + distancia + " metros.");
    }

    @Override
    public void dormir() {
        System.out.println("O Beija-Flor dorme 3 horas por dia.");
    }

    @Override
    public void voa() {
        System.out.println("O Beija-Flor está voando!");
    }
}
