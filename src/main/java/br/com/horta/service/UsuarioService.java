package br.com.horta.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.horta.dto.UsuarioDTO;
import br.com.horta.mapper.UsuarioMapper;
import br.com.horta.model.Usuario;
import br.com.horta.repository.UsuarioRepository;
import br.com.horta.request.UsuarioRequest;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository repository;
	@Autowired
	private UsuarioMapper mapper;

	@Transactional
	public UsuarioDTO salvar(UsuarioRequest request) {
	
		Usuario usuario = mapper.dtoRequestModel(request) ;
		
		return mapper.modelToDTO(repository.save(usuario));
	}

}
