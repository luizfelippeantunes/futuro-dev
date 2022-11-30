package projeto2.repositories;

import projeto2.models.Pedido;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface PedidoRepository extends CrudRepository<Pedido, Long> {
    @Query(value = "select p from Pedido p JOIN Cliente c ON p.cliente = c.id where c.nome like %?1%")
    ArrayList<Pedido> buscarPorCliente(String cliente);
}
