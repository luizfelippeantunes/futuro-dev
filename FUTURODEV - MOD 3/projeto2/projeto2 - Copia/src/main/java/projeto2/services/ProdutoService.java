package projeto2.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import projeto2.models.Produto;
import projeto2.repositories.ProdutoRepository;

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

    public Produto buscar(Long idProduto) {
        return produtoRepository.findById(idProduto).get();
    }

    @Query()
    public List<Produto> buscarPorNome(String nome) {
        return produtoRepository.buscarPorNome(nome);    }

}
