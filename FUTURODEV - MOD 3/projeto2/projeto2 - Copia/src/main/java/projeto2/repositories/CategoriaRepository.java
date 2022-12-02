package projeto2.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import projeto2.models.Categoria;

import java.util.ArrayList;

@Repository
public interface CategoriaRepository extends CrudRepository<Categoria, Long> {

    @Query(value = "select c from Categoria c where c.descricao like %?1%")
    ArrayList<Categoria> buscarPorDescricao(String descricao);

}
