package projeto2.controllers;

import projeto2.dto.ClienteRM;
import projeto2.input.ClienteInput;
import projeto2.models.Cliente;
import projeto2.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/cliente")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @PostMapping(value = "/", produces = "application/json")
    public ResponseEntity<ClienteRM> cadastrar(@RequestBody ClienteInput clienteInput) {
        Cliente cliente = clienteService.salvar(toDomainObject(clienteInput));
        return new ResponseEntity<ClienteRM>(toModel(cliente), HttpStatus.CREATED);
    }

    @PutMapping(value = "/", produces = "application/json")
    public ResponseEntity<ClienteRM> atualizar(@RequestBody ClienteInput clienteInput) {
        Cliente cliente = clienteService.salvar(toDomainObject(clienteInput));
        return new ResponseEntity<ClienteRM>(toModel(cliente), HttpStatus.OK);
    }

    @DeleteMapping(value = "/")
    @ResponseBody
    public ResponseEntity<String> deletar(@RequestParam Long idCliente) {
        clienteService.deletar(idCliente);
        return new ResponseEntity<String>("Usuário deletado com sucesso!", HttpStatus.OK);
    }

    @GetMapping(value = "/", produces = "application/json")
    public ResponseEntity<ClienteRM> buscarPorId(@RequestParam(name = "id") Long idCliente) {
        Cliente cliente = clienteService.buscar(idCliente);
        ClienteRM clienteRM = toModel(cliente);
        return new ResponseEntity<ClienteRM>(clienteRM, HttpStatus.OK);
    }

    @GetMapping(value = "/{idCliente}", produces = "application/json")
    public ResponseEntity<ClienteRM> buscar(@PathVariable(value = "idCliente") Long idCliente) {
        Cliente cliente = clienteService.buscar(idCliente);
        ClienteRM clienteRM = toModel(cliente);
        return new ResponseEntity<ClienteRM>(clienteRM, HttpStatus.OK);
    }

    @GetMapping(value = "/buscarPorNome", produces = "application/json")
    @ResponseBody
    public ResponseEntity<List<ClienteRM>> buscarPorNome(@RequestParam(name = "nome") String nome) {
        List<Cliente> clientes = clienteService.buscarPorNome(nome);
        List<ClienteRM> clientesRM = toCollectionModel(clientes);
        return new ResponseEntity<List<ClienteRM>>(clientesRM, HttpStatus.OK);
    }

    private ClienteRM toModel(Cliente cliente){
        ClienteRM clienteRM = new ClienteRM();
        clienteRM.setId(cliente.getId());
        clienteRM.setNome(cliente.getNome());
        clienteRM.setCpf(cliente.getCpf());
        clienteRM.setRg(cliente.getRg());
        return clienteRM;
    }

    private List<ClienteRM> toCollectionModel(List<Cliente> clientes){
        return clientes.stream().map(cliente -> toModel(cliente)).collect(Collectors.toList());
    }

    private Cliente toDomainObject(ClienteInput clienteInput){
        Cliente cliente = new Cliente();
        cliente.setId(clienteInput.getId());
        cliente.setNome(clienteInput.getNome());
        cliente.setCpf(clienteInput.getCpf());
        cliente.setRg(clienteInput.getRg());
        return cliente;
    }
}
