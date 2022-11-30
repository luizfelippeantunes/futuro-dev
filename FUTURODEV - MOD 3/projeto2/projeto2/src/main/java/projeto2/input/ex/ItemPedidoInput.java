package projeto2.input.ex;

import projeto2.models.ex.Produto;

public class ItemPedidoInput {

    private Long id;
    private Double quantidade;
    private Double valorItem;
    private Produto item;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Double quantidade) {
        this.quantidade = quantidade;
    }

    public Double getValorItem() {
        return valorItem;
    }

    public void setValorItem(Double valorItem) {
        this.valorItem = valorItem;
    }

    public Produto getItem() {
        return item;
    }

    public void setItem(Produto item) {
        this.item = item;
    }
}
