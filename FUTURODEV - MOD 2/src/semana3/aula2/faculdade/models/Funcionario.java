package semana3.aula2.faculdade.models;

public class Funcionario {
    private String nome;
    private double salario;

    private String cpf;

    public double getGastos() {
        return this.salario;
    }

    public String getInfo() {
        return "Nome: " + this.nome + ". Com salário: R$" + this.salario + ".";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "{nome: " + this.nome + ", " +
                "salario: " + this.salario + ", " +
                "cpf:" + this.cpf +
                "}";
    }
/*
    @Override
    public boolean equals(Object obj) {
        // obj pode ser qualquer tipo de objeto,
        // então precisamos conferir se a classe é igual a do objeto que estamos comparando.
        if (obj == null || this.getClass() != obj.getClass())
            return false;

        // se for exatamente o mesmo objeto, ou seja,
        // ambas variáveis apontam pro mesmo endereço de memória,
        // nem precisa testar o conteúdo, pq já é igual.
        if (this == obj) return true;

        // typecast, ou seja, conversão de Object para Funcionario,
        // para que seja possível utilizar os atributos de Funcionario.
        semana4.aula1.faculdade.models.Funcionario outro = (semana4.aula1.faculdade.models.Funcionario) obj;
        return this.nome.equals(outro.nome) &&
                this.salario == outro.salario &&
                this.cpf.equals(outro.cpf);
    }

    public boolean equalsTipoFuncionario(Object obj) {
        // obj pode ser qualquer tipo de objeto,
        // então precisamos conferir se a classe de obj é um tipo de Funcionario (Reitor, Professor).
        // instanceof retorna true se o objeto for da classe em questão (ou alguma subclase).
        if (obj == null || !(obj instanceof semana4.aula1.faculdade.models.Funcionario))
            return false;

        // se for exatamente o mesmo objeto, ou seja,
        // ambas variáveis apontam pro mesmo endereço de memória,
        // nem precisa testar o conteúdo, pq já é igual.
        if (this == obj) return true;

        // typecast, ou seja, conversão de Object para Funcionario,
        // para que seja possível utilizar os atributos de Funcionario.
        semana4.aula1.faculdade.models.Funcionario outro = (semana4.aula1.faculdade.models.Funcionario) obj;
        return this.cpf.equals(outro.cpf);
    }*/
}
