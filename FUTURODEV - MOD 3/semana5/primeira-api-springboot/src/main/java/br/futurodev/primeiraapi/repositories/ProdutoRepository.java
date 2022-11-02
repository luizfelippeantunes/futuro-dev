package br.futurodev.primeiraapi.repositories;

import br.futurodev.primeiraapi.models.ProdutoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<ProdutoModel, Long> {
    /*@Query(value = "select p from ProdutoModel p where u.descricao like %?1%")
    ArrayList<UsuarioModel> buscarPorDescricao(String descricao);*/
}
