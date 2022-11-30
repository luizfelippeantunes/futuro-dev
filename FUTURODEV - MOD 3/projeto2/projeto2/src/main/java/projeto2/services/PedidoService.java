package projeto2.services;

import projeto2.models.Pedido;
import projeto2.repositories.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.List;

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
    @Query()
    public List<Pedido> buscarPorCliente(String cliente) {
        return pedidoRepository.buscarPorCliente(cliente);
    }
}
