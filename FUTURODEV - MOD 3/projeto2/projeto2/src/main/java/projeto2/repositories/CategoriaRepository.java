package projeto2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import projeto2.models.Categoria;

import java.util.ArrayList;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

    @Query(value = "from Categoria c where upper(c.descricao) like %?1%")
    ArrayList<Categoria> buscarPorDescricao(String descricao);

}