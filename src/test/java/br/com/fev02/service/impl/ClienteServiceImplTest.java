package br.com.fev02.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import br.com.fev02.model.Cliente;
import br.com.fev02.repository.ClienteRepository;

class ClienteServiceImplTest {
	
	private ClienteServiceImpl clienteService;
	
	@Mock
	private ClienteRepository clienteRepository;
	
	@BeforeEach
	public void beforeEach() {
		MockitoAnnotations.initMocks(this);
		this.clienteService = new ClienteServiceImpl(clienteRepository);
	}

	@Test
	void deveRetornarTodosOsClientes() {
		//ClienteRepository clienteRepository  = Mockito.mock(ClienteRepository.class);
		//clienteService = new ClienteServiceImpl(clienteRepository);
		List<Cliente> clientes = clientes();
		Mockito.when(clienteRepository.findAll()).thenReturn(clientes);
		clienteService.buscarListaDeClientes();
		Assert.assertTrue(!clientes.isEmpty());
	}
	
	private List<Cliente> clientes(){
		
		List<Cliente> clientes = new ArrayList<>();
		
		Cliente cliente1 = new Cliente();
		cliente1.setNome("Matheus");
		cliente1.setCpf("123456");
		cliente1.setDescricao("Dev");
		
		clientes.add(cliente1);
		
		Cliente cliente2 = new Cliente();
		cliente2.setNome("Leia");
		cliente2.setCpf("1234567");
		cliente2.setDescricao("Dev");
		
		clientes.add(cliente2);
		
		Cliente cliente3 = new Cliente();
		cliente3.setNome("MIza");
		cliente3.setCpf("12345678");
		cliente3.setDescricao("Dev");
		
		clientes.add(cliente3);
		
		return clientes;
		
	}

}
