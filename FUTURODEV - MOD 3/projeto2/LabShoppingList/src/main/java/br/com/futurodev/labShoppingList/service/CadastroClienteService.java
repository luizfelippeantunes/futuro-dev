package br.com.futurodev.labShoppingList.service;

import br.com.futurodev.labShoppingList.model.Cliente;
import br.com.futurodev.labShoppingList.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CadastroClienteService {

    @Autowired
    private ClienteRepository clienteRepository;


    public Cliente getClienteById(Long idCliente){
        return clienteRepository.findById(idCliente).get();
    }
}
