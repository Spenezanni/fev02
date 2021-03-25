package br.com.fev02.dto;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.data.domain.Page;

import br.com.fev02.model.Cliente;

public class ClienteDTO {
	
	private Long id;
	private String nome;
	private String cpf;
	
	public ClienteDTO() {
		
	}
	
	public ClienteDTO(Cliente cliente) {
		this.id = cliente.getId();
		this.nome = cliente.getNome();
		this.cpf = cliente.getCpf();
	}
	
	public Long getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public String getCpf() {
		return cpf;
	}
	
	public static List<ClienteDTO> converter(List<Cliente> clientes){
		return clientes.stream().map(ClienteDTO::new).collect(Collectors.toList());
	}
	
	public static Page<ClienteDTO> converterPage(Page<Cliente> clientes){
		return clientes.map(ClienteDTO::new);
	}
	
}
