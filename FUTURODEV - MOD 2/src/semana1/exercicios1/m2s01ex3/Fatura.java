package semana1.exercicios1.m2s01ex3;

public class Fatura {
    private String numero;
    private String descricao;
    int quantidadeItem;
    double precoItem;

    public double getValorFatura(int quantidadeItem, double precoItem){
        if(quantidadeItem < 0){
            quantidadeItem = 0;
        }else{
            this.quantidadeItem = quantidadeItem;
        }
        if(precoItem < 0){
            precoItem = 0;
        }else{
            this.precoItem = precoItem;
        }
        return precoItem * quantidadeItem;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidadeItem() {
        return quantidadeItem;
    }

    public double getPrecoItem() {
        return precoItem;
    }
}
