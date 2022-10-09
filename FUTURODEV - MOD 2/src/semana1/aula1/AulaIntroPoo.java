package semana1.aula1;

public class AulaIntroPoo {
    public static void main(String[] args) {

        Carro unoDeFirma = new Carro();
        unoDeFirma.cor = "BRANCO";
        unoDeFirma.fabricante = "FIAT";
        unoDeFirma.modelo = "UNO MILLE";
        unoDeFirma.qtdPortas = 4;
        unoDeFirma.temEscada = true;

        System.out.printf("O meu carro é o %s %s %s de %d portas", unoDeFirma.fabricante, unoDeFirma.modelo, unoDeFirma.cor, unoDeFirma.qtdPortas);

    }
}