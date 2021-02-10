package br.com.fev02.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fev02.dto.ClienteDTO;
import br.com.fev02.model.Cliente;
import br.com.fev02.service.ClienteService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/fev02")
public class ClienteController {

	@Autowired
	private ClienteService clienteService;

	@PostMapping
	// @PreAuthorize("hasRole('ADMIN')")
	public ResponseEntity<?> salvarUsuario(@RequestBody Cliente cliente) {
		return new ResponseEntity<>(clienteService.salvar(cliente), HttpStatus.CREATED);
	}

	@GetMapping("/fev02")
	// @PreAuthorize("hasRole('USER')")
	public List<Cliente> listTodosClientes() {
		return this.clienteService.buscarListaDeClientes();
	}

	@GetMapping(path = "/dto")
	// @PreAuthorize("hasRole('USER')") public
	List<ClienteDTO> listTodosClientesDTO() {
		return this.clienteService.buscarListaDeClientesDTO();
	}

	@GetMapping(path = "/{id}")
	public ClienteDTO buscarClientePorId(@PathVariable Long id) {
		return this.clienteService.buscarClientePorId(id);
	}

}
