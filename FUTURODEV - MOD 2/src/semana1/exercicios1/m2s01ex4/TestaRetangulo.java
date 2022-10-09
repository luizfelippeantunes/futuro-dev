package semana1.exercicios1.m2s01ex4;

public class TestaRetangulo {
    public static void main(String[] args) {
        Retangulo r1 = new Retangulo();

        System.out.printf("%nO retangulo (%.2fcm x %.2fcm) possui uma área de %.2fcm, e um perímetro de %.2fcm.%n",
                r1.getComprimento(), r1.getLargura(), r1.area(), r1.perimetro());

        r1.setComprimento(4.5);
        r1.setLargura(6.41);

        System.out.printf("%nO retangulo (%.2fcm x %.2fcm) possui uma área de %.2fcm, e um perímetro de %.2fcm.%n",
                r1.getComprimento(), r1.getLargura(), r1.area(), r1.perimetro());
    }
}