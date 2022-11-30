package projeto2.services;

import projeto2.models.ex.FormaPagamento;
import projeto2.repositories.FormaPagamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public class FormaPagamentoService {

    @Autowired
    private FormaPagamentoRepository formaPagamentoRepository;

    public FormaPagamento salvar(FormaPagamento formaPagamento) {
        return formaPagamentoRepository.save(formaPagamento);
    }

    public void deletar(Long idCliente) {
        formaPagamentoRepository.deleteById(idCliente);
    }

    public FormaPagamento buscar(Long idForma) {
        return formaPagamentoRepository.findById(idForma).get();
    }

    @Query()
    public List<FormaPagamento> buscarPorDescricao(String descricao){
        return formaPagamentoRepository.buscarPorDescricao(descricao);
    }
}
