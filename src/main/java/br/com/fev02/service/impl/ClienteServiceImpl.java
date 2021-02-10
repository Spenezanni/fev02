package br.com.fev02.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fev02.dto.ClienteDTO;
import br.com.fev02.model.Cliente;
import br.com.fev02.repository.ClienteRepository;
import br.com.fev02.service.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService {

	
	private ClienteRepository clienteRepository;
	
	@Autowired
	public ClienteServiceImpl(ClienteRepository clienteRepository) {
		this.clienteRepository = clienteRepository;
	}

	@Override
	public Cliente salvar(Cliente cliente) {
		return clienteRepository.save(cliente);
	}

	@Override
	public List<Cliente> buscarListaDeClientes() {
		return clienteRepository.findAll();
	}

	@Override
	public List<ClienteDTO> buscarListaDeClientesDTO() {
		List<Cliente> clientes = clienteRepository.findAll();
		return ClienteDTO.converter(clientes);
	}

	@Override
	public ClienteDTO buscarClientePorId(Long id) {
		Cliente cliente = this.clienteRepository.findById(id);
		return new ClienteDTO(cliente);
	}

}
