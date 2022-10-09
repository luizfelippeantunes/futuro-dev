package semana3.exercicios3.m2s03ex4;

public class Gerente extends Funcionario {

    private String senha;
    private int qtdFuncionarios;

    public Gerente(String nome, String sobrenome, String cpf, double salario, String senha, int qtdFuncionarios) {
        super(nome, sobrenome, cpf, salario);
        this.senha = senha;
        this.qtdFuncionarios = qtdFuncionarios;
    }

    @Override
    public double calculaBonificacao() {
        return super.salario *= 1.15;
    }
}