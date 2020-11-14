package com.app.sacbin.subasta.model.dao;

import org.springframework.data.repository.CrudRepository;
import com.app.sacbin.subasta.model.entity.Usuario;


public interface IUsuarioDao extends CrudRepository<Usuario, Long> {
	
	public Usuario findByUsername(String username);

}
