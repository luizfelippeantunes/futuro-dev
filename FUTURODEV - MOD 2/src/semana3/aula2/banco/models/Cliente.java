package semana3.aula2.banco.models;

public class Cliente {
    private String nome;
    private String sobrenome;
    private String cpf;

    String endereco;

    public Cliente() {
        System.out.println("Novo cliente instanciado");

        // apenas para exemplificar o modificador de acesso protected:
        // Conta conta = new Conta();
        // conta.teste();
    }

    public Cliente(String nome, String sobrenome, String cpf) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return this.sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /*@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass() ||
                this.nome == null || this.sobrenome == null ||
                this.cpf == null) return false;

        semana4.aula1.banco.models.Cliente outro = (semana4.aula1.banco.models.Cliente) o;

        return this.nome.equals(outro.nome)
                && this.sobrenome.equals(outro.sobrenome)
                && this.cpf.equals(outro.cpf);
    }*/
}
