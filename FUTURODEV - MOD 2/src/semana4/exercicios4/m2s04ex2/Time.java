/*
No mesmo projeto, crie a classe Time. Nesta classe, utilize o polimorfismo para criar um atributo do
tipo List<Usuario> que vai armazenar os usuários do time, incluindo jogadores, e técnico. No time,
crie outro atributo chamado saldo, do tipo double, que vai representar a quantidade de dinheiro em caixa
disponível para comprar jogadores. O time deve ter, por último, o atributo nome do tipo String.
 */

package semana4.exercicios4.m2s04ex2;

import semana4.exercicios4.m2s04ex1.Jogador;
import semana4.exercicios4.m2s04ex1.Usuario;

import java.util.ArrayList;
import java.util.List;

public class Time {

    private String nome;
    private double saldo;
    public List<Usuario> elenco = new ArrayList<>();
    public List<Jogador> jogadores = new ArrayList<>();

    public Time(String nome, double saldo) {
        this.nome = nome;
        this.saldo = saldo;
    }

    public void comprarJogador(Jogador jogador) {
        if (filtraJogadores().size() == 0) {
            elenco.add(jogador);
            filtraJogadores();
            saldo -= jogador.getPreco();
        } else {
            if (filtraJogadores().contains(jogador)) {
                System.out.println("Jogador já faz parte do elenco.");
            } else {
                elenco.add(jogador);
                filtraJogadores();
                saldo -= jogador.getPreco();
            }
        }
    }

    public List<Jogador> filtraJogadores() {
        for (int i = 0; i < elenco.size(); i++) {
            if (elenco.get(i) instanceof Jogador jogador) {
                if (!jogadores.contains(jogador)) {
                    jogadores.add(jogador);
                }
            }
        }
        return jogadores;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}


