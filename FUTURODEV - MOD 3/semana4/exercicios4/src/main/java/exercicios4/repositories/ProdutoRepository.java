package exercicios4.repositories;

import exercicios4.models.Produto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface ProdutoRepository extends CrudRepository<Produto, Long> {
    @Query(value = "select p from Produto p where p.descricao like %?1%")
    ArrayList<Produto> buscarPorDescricao(String descricao);
}