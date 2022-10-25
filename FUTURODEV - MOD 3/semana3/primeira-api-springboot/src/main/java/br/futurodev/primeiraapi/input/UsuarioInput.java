package br.futurodev.primeiraapi.input;

import br.futurodev.primeiraapi.dto.TelefoneRM;

import java.util.ArrayList;
import java.util.List;

public class UsuarioInput {

    private Long id;
    private String nome;
    private String login;
    private String senha;

    private List<TelefoneRM> telefones = new ArrayList<TelefoneRM>();

    public List<TelefoneRM> getTelefones() {
        return telefones;
    }

    public void setTelefones(List<TelefoneRM> telefones) {
        this.telefones = telefones;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
