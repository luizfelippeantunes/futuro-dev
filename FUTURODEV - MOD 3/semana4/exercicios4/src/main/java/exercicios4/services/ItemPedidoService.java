package exercicios4.services;

import exercicios4.models.ItemPedido;
import exercicios4.repositories.ItemPedidoRepository;
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