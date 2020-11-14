package com.app.sacbin.subasta.model.service;

import com.app.sacbin.subasta.model.entity.Usuario;

public interface IUsuarioService {
	public Usuario findByUsername(String username);
}
