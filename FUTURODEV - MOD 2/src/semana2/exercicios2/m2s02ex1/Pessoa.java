/*
? Crie uma classe Pessoa que representa uma pessoa do mundo real. Ela deve conter os seguintes atributos:
    - nome do tipo string
    - idade do tipo int
    - sexo do tipo string
    - dataNascimento do tipo string
? Crie um construtor que receba o nome, a idade, o sexo e a data de nascimento como parâmetros e preencha
os atributos durante a criação de um objeto Pessoa.
? Crie os seguintes métodos:
    - getAnoNascimento, que deve ser um método sem parâmetros e retorna o ano de nascimento da pessoa.
    - getIdade, que não recebe nenhum parâmetro e calcula a idade da pessoa.
    ? Crie uma classe chamada TestaPessoa com o método main para testar as capacidades da classe Pessoa.
     */

package semana2.exercicios2.m2s02ex1;

import java.util.Calendar;

public class Pessoa {

    private String nome;
    private int idade;
    private String sexo;
    private String dataNascimento;

    public Pessoa(String nome, int idade, String sexo, String dataNascimento) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
    }

    public int getAnoNascimento() {
        return Integer.parseInt(this.dataNascimento.substring(this.dataNascimento.length() - 4));
    }

    public int getIdade() {
        return Calendar.getInstance().get(Calendar.YEAR) - getAnoNascimento();
    }
}
