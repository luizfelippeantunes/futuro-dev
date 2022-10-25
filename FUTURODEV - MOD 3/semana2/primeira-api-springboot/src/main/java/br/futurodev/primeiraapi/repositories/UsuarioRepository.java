package br.futurodev.primeiraapi.repositories;

import br.futurodev.primeiraapi.models.Usuario;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface UsuarioRepository extends CrudRepository<Usuario, Long> {

    @Query(value = "select u from UsuarioModel u where u.nome like %?1%")
    ArrayList<Usuario> buscarPorNome(String nome);

}
