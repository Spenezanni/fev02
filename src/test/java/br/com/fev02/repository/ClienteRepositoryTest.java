package br.com.fev02.repository;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.fev02.model.Cliente;


@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace= AutoConfigureTestDatabase.Replace.NONE)
public class ClienteRepositoryTest {
	
	@Autowired
	private ClienteRepository clienteRepository;

	@Test
	public void buscarUmCLienteNoBancoDeDados() {
		
		String cliente = "Luiz";
		Cliente cli = clienteRepository.findByNome(cliente);
		assertNotNull(cli);
		assertEquals(cliente, cli.getNome());
		
	}

}
