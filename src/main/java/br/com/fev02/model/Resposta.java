package br.com.fev02.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "RESPOSTA")
public class Resposta {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String mensagem;
	
	@ManyToOne
	private Topico topico;
	
	private LocalDateTime dataCriacao = LocalDateTime.now();
	
	@ManyToOne
	private Cliente cliente;
	
	private Boolean solucao = false;

	public Resposta() {

	}

	public Resposta(Long id, String mensagem, Topico topico, LocalDateTime dataCriacao, Cliente cliente,
			Boolean solucao) {
		super();
		this.id = id;
		this.mensagem = mensagem;
		this.topico = topico;
		this.dataCriacao = dataCriacao;
		this.cliente = cliente;
		this.solucao = solucao;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public Topico getTopico() {
		return topico;
	}

	public void setTopico(Topico topico) {
		this.topico = topico;
	}

	public LocalDateTime getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(LocalDateTime dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Boolean getSolucao() {
		return solucao;
	}

	public void setSolucao(Boolean solucao) {
		this.solucao = solucao;
	}

}
