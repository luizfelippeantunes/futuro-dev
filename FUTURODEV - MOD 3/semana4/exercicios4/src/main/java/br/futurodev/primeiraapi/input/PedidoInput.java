package br.futurodev.primeiraapi.input;

import br.futurodev.primeiraapi.models.Cliente;
import br.futurodev.primeiraapi.models.FormaPagamento;
import br.futurodev.primeiraapi.models.ItemPedido;

import java.util.ArrayList;
import java.util.List;

public class PedidoInput {

    private Long id;
    private Cliente cliente;
    private List<FormaPagamento> formasPagamento = new ArrayList<>();
    private List<ItemPedido> itensPedido = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<FormaPagamento> getFormasPagamento() {
        return formasPagamento;
    }

    public void setFormasPagamento(List<FormaPagamento> formasPagamento) {
        this.formasPagamento = formasPagamento;
    }

    public List<ItemPedido> getItensPedido() {
        return itensPedido;
    }

    public void setItensPedido(List<ItemPedido> itensPedido) {
        this.itensPedido = itensPedido;
    }
}
