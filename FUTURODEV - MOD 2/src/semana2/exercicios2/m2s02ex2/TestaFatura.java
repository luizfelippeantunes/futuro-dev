package semana2.exercicios2.m2s02ex2;

public class TestaFatura {
    public static void main(String[] args) {

        Fatura f = new Fatura("Fatura 001", "Fatura Setembro", 2, 10);

        System.out.println(f.getValor());
    }
}
