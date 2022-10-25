package br.futurodev.primeiraapi.dto;

import br.futurodev.primeiraapi.models.TelefoneModel;

import java.util.ArrayList;
import java.util.List;

public class UsuarioRM {

    private Long id;
    private String nome;
    private String login;

    private List<TelefoneModel> telefones = new ArrayList<TelefoneModel>();

    public List<TelefoneModel> getTelefones() {
        return telefones;
    }

    public void setTelefones(List<TelefoneModel> telefones) {
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
}
