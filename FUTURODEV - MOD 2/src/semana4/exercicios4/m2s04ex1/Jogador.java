package semana4.exercicios4.m2s04ex1;

import semana4.exercicios4.m2s04ex2.Time;

public class Jogador extends Usuario {

    private String posicao;
    private int qtdGols = 0;
    private double preco;

    public Jogador(String nome, int matricula, String cpf, String posicao, double preco) {
        super(nome, matricula, cpf);
        this.posicao = posicao;
        this.preco = preco;
    }

    @Override
    public boolean equals(Object obj) {
        //if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Jogador x = (Jogador) obj;
        return x.getMatricula() == matricula;
    }

    public void fazerGol() {
        this.qtdGols++;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public int getQtdGols() {
        return qtdGols;
    }

    public void setQtdGols(int qtdGols) {
        this.qtdGols = qtdGols;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}