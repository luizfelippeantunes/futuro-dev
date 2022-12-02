package projeto2.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import projeto2.models.Produto;
import projeto2.repositories.ProdutoRepository;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public List<Produto> ListarProdutos() {
        return produtoRepository.findAll();
    }

    public Produto salvar(Produto produto) {
        return produtoRepository.save(produto);
    }

    public void deletar(Long idProduto) {
        produtoRepository.deleteById(idProduto);
    }

    public Produto buscar(Long idProduto) {
        return produtoRepository.findById(idProduto).get();
    }

    public List<Produto> buscarPorNome(String nome) {
        return produtoRepository.buscarPorNome(nome);
    }

    public Double totalCompras() {
        return produtoRepository.totalCompras();
    }

}
