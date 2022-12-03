package projeto2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import projeto2.models.Produto;

import java.util.ArrayList;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

    @Query(value = "select p from Produto p where p.nome like %?1%")
    ArrayList<Produto> buscarPorNome(String nome);

    @Query(value = "select SUM(valor) from Produto p where p.status = true")
    Double totalCompras();

}