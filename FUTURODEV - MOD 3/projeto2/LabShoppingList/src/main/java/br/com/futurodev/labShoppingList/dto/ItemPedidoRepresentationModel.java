package br.com.futurodev.labShoppingList.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ItemPedidoRepresentationModel {

    private Long id;

    private Long idProduto;

    private String descricaoProduto;

    private double valorItem;

    private double quantidade;

}
