/*
Volte ao exercício da classe fatura da semana anterior para relembrar. A classe Fatura tinha os seguintes atributos:
    - codigo do tipo string
    - descricao do tipo string
    - quantidade do tipo int
    - precoUnitario do tipo double
Coloque estes atributos como privados e crie getters e setters para eles.
Crie também um construtor que receba os dados da fatura como parâmetros.
Crie a classe TestaFatura com o método main e crie uma fatura.
Chame o método getValor, como no exercício anterior e verifique o resultado.
 */

package semana2.exercicios2.m2s02ex2;

public class Fatura {

    private String codigo;
    private String descricao;
    private int quantidade;
    private double precoUnitario;

    public Fatura(String codigo, String descricao, int quantidade, double precoUnitario) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public double getValor() {
        return precoUnitario * quantidade;
    }
}
