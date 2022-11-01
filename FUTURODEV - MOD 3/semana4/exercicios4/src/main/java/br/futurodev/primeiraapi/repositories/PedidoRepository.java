package br.futurodev.primeiraapi.repositories;

import br.futurodev.primeiraapi.models.Pedido;
import org.springframework.data.repository.CrudRepository;

public interface PedidoRepository extends CrudRepository<Pedido, Long> {
}
