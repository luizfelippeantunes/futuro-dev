package projeto2.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import projeto2.models.Categoria;
import projeto2.repositories.CategoriaRepository;

import java.util.List;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public List<Categoria> ListarCategorias() {
        return categoriaRepository.findAll();
    }

    public Categoria salvar(Categoria categoria) {
        return categoriaRepository.save(categoria);
    }

    public void deletar(Long idCategoria) {
        categoriaRepository.deleteById(idCategoria);
    }

    public Categoria buscar(Long idCategoria) {
        return categoriaRepository.findById(idCategoria).get();
    }

    public List<Categoria> buscarPorDescricao(String descricao) {
        return categoriaRepository.buscarPorDescricao(descricao);
    }

}
