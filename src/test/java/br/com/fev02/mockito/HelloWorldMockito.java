package br.com.fev02.mockito;

import java.util.List;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import br.com.fev02.model.Cliente;
import br.com.fev02.repository.ClienteRepository;

public class HelloWorldMockito {
	
	ClienteRepository mock = Mockito.mock(ClienteRepository.class);
	@Test
	void hello() {
	 List<Cliente> clientes = mock.findAll();
	 Assert.assertTrue(clientes.isEmpty());
	}

}
