package semana1.exercicios1.m2s01ex4;

public class Retangulo {
    private double comprimento = 1;
    private double largura = 1;

    //perimetro = 2x (comprimento + altura)
    public double perimetro(){
        return (2 * (this.comprimento + this.largura));
    }
    //area = comprimento x altura
    public double area(){
        return (this.comprimento * this.largura);
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }
}
