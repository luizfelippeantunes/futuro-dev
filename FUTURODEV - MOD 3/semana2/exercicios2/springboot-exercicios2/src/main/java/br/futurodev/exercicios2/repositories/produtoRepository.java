package br.futurodev.exercicios2.repositories;

import br.futurodev.exercicios2.models.ProdutoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface produtoRepository extends JpaRepository<ProdutoModel, Long> {



}
