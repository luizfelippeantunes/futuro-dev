package projeto2.services;

import projeto2.models.ItemPedido;
import projeto2.repositories.ItemPedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class ItemPedidoService {

    @Autowired
    private ItemPedidoRepository itemPedidoRepository;

    public ItemPedido salvar(ItemPedido itemPedido) {
        return itemPedidoRepository.save(itemPedido);
    }

    public void deletar(Long idItemPedido) {
        itemPedidoRepository.deleteById(idItemPedido);
    }

    public ItemPedido buscar(Long idItemPedido) {
        return itemPedidoRepository.findById(idItemPedido).get();
    }
}