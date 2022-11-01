package br.futurodev.primeiraapi.repositories;

import br.futurodev.primeiraapi.models.Cliente;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface ClienteRepository extends CrudRepository<Cliente, Long> {

    @Query(value = "select c from Cliente c where c.nome like %?1%")
    ArrayList<Cliente> buscarPorNome(String nome);
}
