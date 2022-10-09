package semana3.exercicios3.m2s03ex5;

public class Vendedor {

    private String nome;
    private String sobrenome;
    protected double valorVendidoMes;
    protected double salarioBase;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public double getValorVendidoMes() {
        return valorVendidoMes;
    }

    public void setValorVendidoMes(double valorVendidoMes) {
        this.valorVendidoMes = valorVendidoMes;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
}