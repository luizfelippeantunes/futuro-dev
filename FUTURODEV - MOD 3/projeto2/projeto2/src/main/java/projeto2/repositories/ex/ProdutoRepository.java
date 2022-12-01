package projeto2.repositories.ex;

import projeto2.models.ex.Produto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface ProdutoRepository extends CrudRepository<Produto, Long> {
    @Query(value = "select p from Produto p where p.descricao like %?1%")
    ArrayList<Produto> buscarPorDescricao(String descricao);
}