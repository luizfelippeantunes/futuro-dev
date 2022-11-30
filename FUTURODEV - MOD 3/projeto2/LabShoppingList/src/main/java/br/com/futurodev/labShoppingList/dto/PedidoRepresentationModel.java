package br.com.futurodev.labShoppingList.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class PedidoRepresentationModel {

    private Long id;

    private Long idCliente;

    private String nomeCliente;

    private Long idFormaPagamento;

    private String formaPagamentoDescricao;


    private List<ItemPedidoRepresentationModel> itensPedidoRepresentationModel = new ArrayList<ItemPedidoRepresentationModel>();

}
