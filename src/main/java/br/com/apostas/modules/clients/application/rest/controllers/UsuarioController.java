package br.com.apostas.modules.clients.application.rest.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import br.com.apostas.modules.datasources.models.UsuarioModel;
import br.com.apostas.modules.domain.dto.Response;
import br.com.apostas.modules.domain.repositories.UsuarioRepositories;
import br.com.apostas.modules.domain.services.JpaImplementacao;







@RestController
@RequestMapping("/dss")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class UsuarioController {
	
	private JpaImplementacao implementacao;
	private UsuarioRepositories repositories;
	
	

	
	public UsuarioController(JpaImplementacao implementacao, UsuarioRepositories repositories) {
		super();
		this.implementacao = implementacao;
		this.repositories = repositories;
	}


	public UsuarioController() {
		super();
	}

/*
	@GetMapping
	public ResponseEntity<List<UsuarioModel>> getall(){
		return ResponseEntity.ok(implementacao.buscaPorTodos())	;
	}*/
	 @GetMapping
	    public ResponseEntity<List<UsuarioModel>> findAll() {
	        List<UsuarioModel> items = repositories.findAll();
	        return ResponseEntity.ok().body(items);
	    }
	/*
	@GetMapping
	public ResponseEntity<List<Data>> getAll() {
		
		return ResponseEntity.ok(dataRepository.getDatas());			
	}*/
			
	/*@GetMapping
	public ResponseEntity<List<Data>> getAll() {
		
		return ResponseEntity.ok(dataRepository.getDatas());			
	}*/
}
