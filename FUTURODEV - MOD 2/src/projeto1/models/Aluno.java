package projeto1.models;

public class Aluno extends Pessoa {

    private String statusMatricula;
    private double notaProcessoSeletivo;
    private int qtdAtendimentosPedagogicos;

    public Aluno(String nome, String telefone, String dataNascimento, String cpf, double notaProcessoSeletivo) {
        super(nome, telefone, dataNascimento, cpf);
        this.notaProcessoSeletivo = notaProcessoSeletivo;
        this.statusMatricula = "Ativo";
        this.qtdAtendimentosPedagogicos = 0;
    }

    public String getStatusMatricula() {
        return statusMatricula;
    }

    public double getNotaProcessoSeletivo() {
        return notaProcessoSeletivo;
    }

    public int getQtdAtendimentosPedagogicos() {
        return qtdAtendimentosPedagogicos;
    }

    public void setStatusMatricula(String statusMatricula) {
        this.statusMatricula = statusMatricula;
    }

    public void setQtdAtendimentosPedagogicos(int qtdAtendimentosPedagogicos) {
        this.qtdAtendimentosPedagogicos = qtdAtendimentosPedagogicos;
    }

    public void incrementoAtendimentoPedagogico(){
        this.qtdAtendimentosPedagogicos++;
    }
}