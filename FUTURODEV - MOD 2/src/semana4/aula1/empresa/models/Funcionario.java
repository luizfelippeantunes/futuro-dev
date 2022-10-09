package semana4.aula1.empresa.models;

public abstract class Funcionario {
    private String nome;
    private String cpf;

    public String getInfo() {
        return "Nome: " + this.nome + ", de CPF: " + this.cpf + ".";
    }

    public abstract double calculaSalario();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
