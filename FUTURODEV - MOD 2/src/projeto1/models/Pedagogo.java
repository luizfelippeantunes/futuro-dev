package projeto1.models;

public class Pedagogo extends Pessoa {

    private int qtdAtendimentosPedagogicos;
    private boolean emAtendimentoPedagogico;

    public Pedagogo(String nome, String telefone, String dataNascimento, String cpf) {
        super(nome, telefone, dataNascimento, cpf);
        this.qtdAtendimentosPedagogicos = 0;
        this.emAtendimentoPedagogico = false;
    }

    public boolean isEmAtendimentoPedagogico() {
        return emAtendimentoPedagogico;
    }

    public void setEmAtendimentoPedagogico(boolean emAtendimentoPedagogico) {
        this.emAtendimentoPedagogico = emAtendimentoPedagogico;
    }

    public int getQtdAtendimentosPedagogicos() {
        return qtdAtendimentosPedagogicos;
    }

    public void setQtdAtendimentosPedagogicos(int qtdAtendimentosPedagogicos) {
        this.qtdAtendimentosPedagogicos = qtdAtendimentosPedagogicos;
    }

    public void incrementoAtendimentoPedagogico() {
        this.qtdAtendimentosPedagogicos++;
    }
}