package projeto2.controllers;

import projeto2.dto.PedidoRM;
import projeto2.input.PedidoInput;
import projeto2.models.Pedido;
import projeto2.services.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/pedido")
public class PedidoController {

    @Autowired
    private PedidoService pedidoService;

    @PostMapping(value = "/", produces = "application/json")
    public ResponseEntity<PedidoRM> cadastrar(@RequestBody PedidoInput pedidoInput) {
        Pedido pedido = pedidoService.salvar(toDomainObject(pedidoInput));
        return new ResponseEntity<PedidoRM>(toModel(pedido), HttpStatus.CREATED);
    }

    @PutMapping(value = "/", produces = "application/json")
    public ResponseEntity<PedidoRM> atualizar(@RequestBody PedidoInput pedidoInput) {
        Pedido pedido = pedidoService.salvar(toDomainObject(pedidoInput));
        return new ResponseEntity<PedidoRM>(toModel(pedido), HttpStatus.OK);
    }

    @DeleteMapping(value = "/")
    @ResponseBody
    public ResponseEntity<String> deletar(@RequestParam Long idPedido) {
        pedidoService.deletar(idPedido);
        return new ResponseEntity<String>("Pedido deletado com sucesso!", HttpStatus.OK);
    }

    @GetMapping(value = "/", produces = "application/json")
    public ResponseEntity<PedidoRM> buscarPorId(@RequestParam(name = "id") Long idPedido) {
        Pedido pedido = pedidoService.buscar(idPedido);
        PedidoRM pedidoRM = toModel(pedido);
        return new ResponseEntity<PedidoRM>(pedidoRM, HttpStatus.OK);
    }

    @GetMapping(value = "/cliente/", produces = "application/json")
    public ResponseEntity<List<PedidoRM>> buscarPorCliente(@RequestParam(name = "cliente") String cliente) {
        List<Pedido> pedidos = pedidoService.buscarPorCliente(cliente);
        List<PedidoRM> pedidosRM = toCollectionModel(pedidos);
        return new ResponseEntity<List<PedidoRM>>(pedidosRM, HttpStatus.OK);
    }

    @GetMapping(value = "/{idPedido}", produces = "application/json")
    public ResponseEntity<PedidoRM> buscar(@PathVariable(value = "idPedido") Long idPedido) {
        Pedido pedido = pedidoService.buscar(idPedido);
        PedidoRM pedidoRM = toModel(pedido);
        return new ResponseEntity<PedidoRM>(pedidoRM, HttpStatus.OK);
    }

    private PedidoRM toModel(Pedido pedido){
        PedidoRM pedidoRM = new PedidoRM();
        pedidoRM.setId(pedido.getId());
        pedidoRM.setCliente(pedido.getCliente());
        pedidoRM.setFormaPagamento(pedido.getFormaPagamento());
        pedidoRM.setItensPedido(pedido.getItensPedido());
        return pedidoRM;
    }

    private List<PedidoRM> toCollectionModel(List<Pedido> pedidos){
        return pedidos.stream().map(pedido -> toModel(pedido)).collect(Collectors.toList());
    }

    private Pedido toDomainObject(PedidoInput pedidoInput){
        Pedido pedido = new Pedido();
        pedido.setId(pedidoInput.getId());
        pedido.setCliente(pedidoInput.getCliente());
        pedido.setFormaPagamento(pedidoInput.getFormaPagamento());
        pedido.setItensPedido(pedidoInput.getItensPedido());
        return pedido;
    }
}
