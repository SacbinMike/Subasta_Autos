package com.app.sacbin.subasta.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.app.sacbin.subasta.model.dao.ITiempoSubasta;
import com.app.sacbin.subasta.model.entity.TiempoSubasta;

@RestController
@RequestMapping("/api-subasta")
public class TiempoSubastaController {
	
	@Autowired
	private ITiempoSubasta tiempoSubasta;
	
	@GetMapping("/tiempo-subasta")
	public List<TiempoSubasta> getAll(){
		return tiempoSubasta.findAll();
	}

}
