package br.com.futurodev.labShoppingList.repository;

import br.com.futurodev.labShoppingList.model.ItemPedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemPedidoRepository extends JpaRepository<ItemPedido, Long> { //JpaRepository


    /*@Query("select p from Pedido p where p.cliente.id = ?1")
    List<Pedido> getPedidosByIdCliente(Long idCliente);*/

    @Query("select i from ItemPedido i where i.pedido.id = ?1 and i.id = ?2")
    ItemPedido getItemPedido(Long idPedido, Long idItemPedido);

    /*
    * @Modifying
      @Query("delete from Book b where b.title=:title")
      void deleteBooks(@Param("title") String title);
      * */

    /*
    @Query("delete from ItemPedido i where i.id = ?1 ")
    void deleteItemPedidoById(Long idItemPedido);
     */

}
