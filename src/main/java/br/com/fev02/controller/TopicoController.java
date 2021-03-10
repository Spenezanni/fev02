package br.com.fev02.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fev02.dto.DetalhesDoTopicoDTO;
import br.com.fev02.dto.TopicoDTO;
import br.com.fev02.model.Topico;
import br.com.fev02.service.TopicoService;

@RestController
@RequestMapping("fev02/topico")
public class TopicoController {
	
	@Autowired
	private TopicoService topicoService;
	
	@PostMapping
	public ResponseEntity<?> salvarTopico(@RequestBody Topico topico){
		return new ResponseEntity<>(topicoService.salvarTopico(topico), HttpStatus.CREATED);
	}
	
	@GetMapping(path = "/descricao/{id}")
	public TopicoDTO descricaoTopico(@PathVariable Long id) {
		return this.topicoService.buscarDescricaoDoTopico(id);
	}
	
	/*
	 * @GetMapping(path = "/descricao/{id}") public ResponseEntity<TopicoDTO>
	 * descricaoTopico(@PathVariable Long id) { return new
	 * ResponseEntity<>(topicoService.buscarDescricaoDoTopico(id),
	 * HttpStatus.CREATED); }
	 */
	
	@GetMapping(path = "/detalhes/{id}")
	public DetalhesDoTopicoDTO detalharTopico(@PathVariable Long id) {
		return this.topicoService.buscarDetalhesDoTopico(id);
	}
	
}
