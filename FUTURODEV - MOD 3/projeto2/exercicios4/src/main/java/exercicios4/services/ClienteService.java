package exercicios4.services;

import exercicios4.models.Cliente;
import exercicios4.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public Cliente salvar(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public void deletar(Long idCliente) {
        clienteRepository.deleteById(idCliente);
    }

    public Cliente buscar(Long idCliente) {
        return clienteRepository.findById(idCliente).get();
    }

    @Query()
    public List<Cliente> buscarPorNome(String nome){
        return clienteRepository.buscarPorNome(nome);
    }
}
