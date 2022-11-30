package br.com.futurodev.labShoppingList.repository;

import br.com.futurodev.labShoppingList.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long> {


    @Query("select p from Pedido p where p.cliente.id = ?1")
    List<Pedido> getPedidosByIdCliente(Long idCliente);
}
