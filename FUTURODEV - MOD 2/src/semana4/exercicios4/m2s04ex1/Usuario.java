/*
Um time de futebol deseja cadastrar seus funcion�rios em um sistema desenvolvido em Java.
Crie um projeto java e escreva as seguintes classes:
- Classe abstrata Usuario com os atributos nome do tipo String, matricula do tipo int, cpf do tipo String.
- Classe Jogador que herda de Usuario, com os seguintes atributos: Posicao do tipo String, quantidade de gols do tipo int,
preco do tipo double. O jogador deve ter o m�todo fazerGol, que incrementa 1 na quantidade de gols.
- Classe T�cnico que herda de Usu�rio com os seguintes atributos: Data de in�cio do tipo String,
que representa a data em que ele foi contratado como t�cnico. O T�cnico deve ter o m�todo escalar Jogador,
que devolve uma lista de jogadores escalados para o jogo.
 */

package semana4.exercicios4.m2s04ex1;

public abstract class Usuario {

    private String nome;
    public int matricula;
    private String cpf;

    public Usuario(String nome, int matricula, String cpf) {
        this.nome = nome;
        this.matricula = matricula;
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return getNome();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}