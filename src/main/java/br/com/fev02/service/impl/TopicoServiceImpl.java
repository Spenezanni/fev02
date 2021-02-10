package br.com.fev02.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fev02.dto.DetalhesDoTopicoDTO;
import br.com.fev02.dto.TopicoDTO;
import br.com.fev02.model.Topico;
import br.com.fev02.repository.TopicoRepository;
import br.com.fev02.service.TopicoService;

@Service
public class TopicoServiceImpl implements TopicoService {

	@Autowired
	private TopicoRepository topicoRepository;

	@Override
	public TopicoDTO buscarDescricaoDoTopico(Long id) {
		Optional<Topico> topico = this.topicoRepository.findById(id);
		return new TopicoDTO(topico.get());
	}

	@Override
	public DetalhesDoTopicoDTO buscarDetalhesDoTopico(Long id) {
		Optional<Topico>  topico = this.topicoRepository.findById(id);
		return new DetalhesDoTopicoDTO(topico.get());
	}

	@Override
	public Topico salvarTopico(Topico topico) {
		return topicoRepository.save(topico) ;
	}
	
	

	
}
