package projeto2.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import projeto2.models.Categoria;
import projeto2.repositories.CategoriaRepository;

import java.util.List;

public class CategoriaService {

    @Autowired
    private CategoriaRepository produtoRepository;

    public Categoria salvar(Categoria categoria) {
        return produtoRepository.save(categoria);
    }

    public void deletar(Long idCategoria) {
        produtoRepository.deleteById(idCategoria);
    }

    public Categoria buscar(Long idCategoria) {
        return produtoRepository.findById(idCategoria).get();
    }

    @Query()
    public List<Categoria> buscarPorDescricao(String descricao) {
        return produtoRepository.buscarPorDescricao(descricao);
    }

}
