package io.github.vanessaeich.clientes.model.repository;

import io.github.vanessaeich.clientes.model.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Vanessa Eich
 * @created 29/04/2022
 */
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
