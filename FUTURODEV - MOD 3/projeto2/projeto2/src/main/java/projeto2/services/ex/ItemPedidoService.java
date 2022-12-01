package projeto2.services.ex;

import projeto2.models.ex.ItemPedido;
import projeto2.repositories.ex.ItemPedidoRepository;
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