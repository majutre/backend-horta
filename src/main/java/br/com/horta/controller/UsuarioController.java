package br.com.horta.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.horta.dto.UsuarioDTO;
import br.com.horta.request.UsuarioRequest;
import br.com.horta.service.UsuarioService;

@CrossOrigin
@RestController
@RequestMapping("/usuario")
public class UsuarioController {
	
	@Autowired
	private UsuarioService service;
	
	@PostMapping
	public ResponseEntity<?> salvar(@RequestBody UsuarioRequest request){
		try {
			UsuarioDTO usuario = service.salvar(request);
			return ResponseEntity.status(HttpStatus.CREATED).body(usuario);
			
		}catch(Exception ex) {
			return ResponseEntity.badRequest().body(ex.getMessage());
		}
	}

}
