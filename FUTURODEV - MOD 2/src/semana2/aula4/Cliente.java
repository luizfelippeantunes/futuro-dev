package semana2.aula4;

public class Cliente {
    //Criando os atributos do cliente de acordo com os requisitos do sistema
    //atributo nome do tipo String
    private String nome;
    //Atributo cpf do tipo Syring
    private String cpf;
    //Atributo profissao do tipo String
    private String profissao;

    //Criando um construtor para o cliente
    //O novo construtor vai aceitar o nome, o cpf e a profissao
    //Quando criarmos o novo construtor, o construtor fornecido pelo java vai deixar de existir
    //criando agora o construtor do cliente
    //O construtor é um método especial que tem o mesmo nome da classe
    public Cliente(String nome, String cpf, String profissao) {
        this.nome = nome;
        this.cpf = cpf;
        this.profissao = profissao;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }
}
