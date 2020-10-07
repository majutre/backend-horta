package br.com.horta.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.horta.dto.UsuarioDTO;
import br.com.horta.model.Usuario;
import br.com.horta.request.UsuarioRequest;

@Component
public class UsuarioMapper {

	@Autowired
	private ModelMapper modelMapper;
	
	public UsuarioDTO modelToDTO(Usuario usuario) {
		return modelMapper.map(usuario, UsuarioDTO.class);
	}
	
	public Usuario dtoRequestModel(UsuarioRequest request) {
		return modelMapper.map(request, Usuario.class);
	}
}
