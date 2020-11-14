package com.app.sacbin.subasta.model.service;

import java.util.List;
import com.app.sacbin.subasta.model.entity.FechaSubasta;

public interface IFechaSubasta {
	
	public List<FechaSubasta> findAll();
	public FechaSubasta store(FechaSubasta fechaSubasta);
	public FechaSubasta findById(Long id);

}
