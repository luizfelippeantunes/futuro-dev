package semana3.aula2.faculdade.models;

public class Funcionario {
    private String nome;
    private double salario;

    private String cpf;

    public double getGastos() {
        return this.salario;
    }

    public String getInfo() {
        return "Nome: " + this.nome + ". Com sal�rio: R$" + this.salario + ".";
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
        // ent�o precisamos conferir se a classe � igual a do objeto que estamos comparando.
        if (obj == null || this.getClass() != obj.getClass())
            return false;

        // se for exatamente o mesmo objeto, ou seja,
        // ambas vari�veis apontam pro mesmo endere�o de mem�ria,
        // nem precisa testar o conte�do, pq j� � igual.
        if (this == obj) return true;

        // typecast, ou seja, convers�o de Object para Funcionario,
        // para que seja poss�vel utilizar os atributos de Funcionario.
        semana4.aula1.faculdade.models.Funcionario outro = (semana4.aula1.faculdade.models.Funcionario) obj;
        return this.nome.equals(outro.nome) &&
                this.salario == outro.salario &&
                this.cpf.equals(outro.cpf);
    }

    public boolean equalsTipoFuncionario(Object obj) {
        // obj pode ser qualquer tipo de objeto,
        // ent�o precisamos conferir se a classe de obj � um tipo de Funcionario (Reitor, Professor).
        // instanceof retorna true se o objeto for da classe em quest�o (ou alguma subclase).
        if (obj == null || !(obj instanceof semana4.aula1.faculdade.models.Funcionario))
            return false;

        // se for exatamente o mesmo objeto, ou seja,
        // ambas vari�veis apontam pro mesmo endere�o de mem�ria,
        // nem precisa testar o conte�do, pq j� � igual.
        if (this == obj) return true;

        // typecast, ou seja, convers�o de Object para Funcionario,
        // para que seja poss�vel utilizar os atributos de Funcionario.
        semana4.aula1.faculdade.models.Funcionario outro = (semana4.aula1.faculdade.models.Funcionario) obj;
        return this.cpf.equals(outro.cpf);
    }*/
}
