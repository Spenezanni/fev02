package br.com.fev02.model;

import java.time.LocalDateTime;

import javax.persistence.ManyToOne;

public class Resposta {
	
	private Long id;
	private String mensagem;
	@ManyToOne
	private Topico topico;
	private LocalDateTime dataCriacao =  LocalDateTime.now();
	@ManyToOne
	private Cliente autor;
	private Boolean solucao = false;
	
	

}
