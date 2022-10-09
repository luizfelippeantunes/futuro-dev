package semana2.exercicios2.m2s02ex3;

public class TestaRetangulo {
    public static void main(String[] args) {
        Retangulo ret = new Retangulo();

        ret.setComprimento(10);
        ret.setLargura(10);

        System.out.println("Área: " + ret.area());
        System.out.println("Perímetro: " + ret.perimetro());
    }
}
