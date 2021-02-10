package br.com.fev02.service;

import br.com.fev02.dto.DetalhesDoTopicoDTO;
import br.com.fev02.dto.TopicoDTO;
import br.com.fev02.model.Topico;

public interface TopicoService {
	
	TopicoDTO buscarDescricaoDoTopico(Long id);
	
	DetalhesDoTopicoDTO buscarDetalhesDoTopico(Long id);

	Topico salvarTopico(Topico topico);

}
