package br.com.fev02.service;

import java.util.List;

import br.com.fev02.dto.ClienteDTO;
import br.com.fev02.model.Cliente;

public interface ClienteService {

	Cliente salvar(Cliente usuario);

	List<Cliente> buscarListaDeClientes();
	
	List<ClienteDTO> buscarListaDeClientesDTO();
	
	

}
