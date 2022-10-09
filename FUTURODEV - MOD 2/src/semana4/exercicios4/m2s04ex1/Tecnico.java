package semana4.exercicios4.m2s04ex1;

import semana4.exercicios4.m2s04ex2.Time;

import java.util.ArrayList;
import java.util.List;

public class Tecnico extends Usuario {

    private String dataInicio;

    List<Jogador> escalacao = new ArrayList<>();

    public Tecnico(String nome, int matricula, String cpf, String dataInicio) {
        super(nome, matricula, cpf);
        this.dataInicio = dataInicio;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public List<Jogador> escalarJogador(Jogador jogador) {
        if (escalacao.size() < 11) {
            escalacao.add(jogador);
        } else {
            System.out.println("Já tem 11 jogadores na escalação!");
        }
        return escalacao;
    }
}
