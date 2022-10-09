package br.futurodev.primeiraapi.repositories;

import br.futurodev.primeiraapi.models.ProdutoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface produtoRepository extends JpaRepository<ProdutoModel, Long> {



}
