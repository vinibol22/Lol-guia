package br.com.apostas.modules.domain.services;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.apostas.modules.datasources.models.UsuarioModel;
import br.com.apostas.modules.domain.repositories.UsuarioRepositories;


public class JpaImplementacao {
	
	private UsuarioRepositories usaRepositories;

	
	
	public JpaImplementacao(UsuarioRepositories usaRepositories) {
		super();
		this.usaRepositories = usaRepositories;
		
	}

	

	public JpaImplementacao() {
		super();
	}


	public List<UsuarioModel> buscaPorTodos() {
		return usaRepositories.findAll();
	}
}
	