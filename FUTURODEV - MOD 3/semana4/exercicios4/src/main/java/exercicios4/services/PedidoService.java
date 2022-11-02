package exercicios4.services;

import exercicios4.models.Pedido;
import exercicios4.repositories.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

    public Pedido salvar(Pedido pedido) {
        return pedidoRepository.save(pedido);
    }

    public void deletar(Long idPedido){
        pedidoRepository.deleteById(idPedido);
    }

    public Pedido buscar(Long idPedido){
        return pedidoRepository.findById(idPedido).get();
    }
}
