package semana3.exercicios3.m2s03ex6;

public class Vendedor {

    protected String nome;
    protected String sobrenome;
    protected double valorVendidoMes;
    protected double salarioBase;

    public Vendedor(String nome, String sobrenome, double salarioBase) {
        if (nome == null) {
        } else if (nome.length() <= 0) {
        } else if (sobrenome == null) {
        } else if (sobrenome.length() <= 0) {
        } else if (salarioBase < 0) {
        } else {
            this.nome = nome;
            this.sobrenome = sobrenome;
            this.salarioBase = salarioBase;
        }
    }

    @Override
    public String toString() {
        return String.format("Nome e sobrenome do vendedor: %s %s. Salário base: RS %.2f.",
                this.getNome(), this.getSobrenome(), this.getSalario());
    }

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

    public double getSalario() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
}