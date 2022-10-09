package semana3.exercicios3.m2s03ex4;

public class GerenteRegional extends Gerente{

    private String regiao;

    public GerenteRegional(String nome, String sobrenome, String cpf, double salario, String senha, int qtdFuncionarios, String regiao) {
        super(nome, sobrenome, cpf, salario, senha, qtdFuncionarios);
        this.regiao = regiao;
    }

    @Override
    public double calculaBonificacao() {
        return super.calculaBonificacao() + 1000;
    }
}