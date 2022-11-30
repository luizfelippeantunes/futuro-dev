package exercicios4.services;

import exercicios4.models.Produto;
import exercicios4.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public Produto salvar(Produto produto) {
        return produtoRepository.save(produto);
    }

    public void deletar(Long idProduto) {
        produtoRepository.deleteById(idProduto);
    }

    public Produto buscar(Long idForma) {
        return produtoRepository.findById(idForma).get();
    }

    @Query()
    public List<Produto> buscarPorDescricao(String descricao) {
        return produtoRepository.buscarPorDescricao(descricao);
    }
}
