package exercicios4.repositories;

import exercicios4.models.FormaPagamento;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface FormaPagamentoRepository extends CrudRepository<FormaPagamento, Long> {

    @Query(value = "select f from FormaPagamento f where f.descricao like %?1%")
    ArrayList<FormaPagamento> buscarPorDescricao(String descricao);
}
