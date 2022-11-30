package br.com.futurodev.labShoppingList.repository;

import br.com.futurodev.labShoppingList.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {


}
