package com.app.sacbin.subasta.model.service;

import java.util.List;
import com.app.sacbin.subasta.model.entity.Subasta;

public interface ISubastaService {

	public Subasta store(Subasta subasta);
	public List<Subasta> findAll();
}
