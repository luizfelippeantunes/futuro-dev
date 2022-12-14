package exercicios5.repositories;

import exercicios5.models.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    /*@Query(value = "select p from ProdutoModel p where u.descricao like %?1%")
    ArrayList<UsuarioModel> buscarPorDescricao(String descricao);*/
}
