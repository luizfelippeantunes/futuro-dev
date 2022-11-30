package br.com.futurodev.labShoppingList.input;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ItemPedidoInput {

    private Long id;

    private Long idPedido;

    private Long idProduto;

    private double quantidade;

    private double precoVenda;


}
