package apiCrudPessoa.repositories;

import apiCrudPessoa.models.Pessoa;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface PessoaRepository  extends CrudRepository<Pessoa, Long> {

    @Query(value = "select p from Pessoa p where p.nome like %?1%")
    ArrayList<Pessoa> buscarPorNome(String nome);

}
