package br.com.apostas.modules.domain.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.apostas.modules.datasources.models.UsuarioModel;


@Repository
public interface UsuarioRepositories extends JpaRepository<UsuarioModel,String>{
	//public List<UsuarioModel>buscaPorTodos();
}
