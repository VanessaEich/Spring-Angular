package io.github.vanessaeich.clientes.model.repository;

import io.github.vanessaeich.clientes.model.entity.ServicoPrestado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * @author Vanessa Eich
 * @created 29/04/2022
 */
public interface ServicoPrestadoRepository extends JpaRepository<ServicoPrestado, Integer> {

    @Query(" select s from ServicoPrestado s join s.cliente c where upper( c.nome ) like upper( :nome ) and function('MONTH',s.data )=:mes ")
    List<ServicoPrestado> findByNomeClienteAndMes(
            @Param("nome") String nome, @Param("mes") Integer mes);
}
