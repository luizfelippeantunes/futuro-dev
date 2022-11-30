package br.com.futurodev.labShoppingList.service;

import br.com.futurodev.labShoppingList.model.FormaPagamento;
import br.com.futurodev.labShoppingList.repository.FormaPagamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CadastroFormaPagamentoService {

    @Autowired
    private FormaPagamentoRepository formaPagamentoRepository;


    public FormaPagamento getFormaPagamentoById(Long idFormaPagamento){
        return formaPagamentoRepository.findById(idFormaPagamento).get();
    }
}
