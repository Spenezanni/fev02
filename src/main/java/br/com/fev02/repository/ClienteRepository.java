package br.com.fev02.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.fev02.model.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

	Cliente save(Cliente cliente);

	List<Cliente> findAll();
	
	Cliente findByNome(String nome);

	/*
	 * @Query("SELECT c FROM Cliente c WHERE c.cliente.nome = :nome") List<Cliente>
	 * carregarPorNomeDoCliente(@Param("nome") String nome);
	 */

	Cliente findById(Long id);

}
