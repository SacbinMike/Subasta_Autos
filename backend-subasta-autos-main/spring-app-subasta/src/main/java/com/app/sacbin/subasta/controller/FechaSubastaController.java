package com.app.sacbin.subasta.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.app.sacbin.subasta.model.entity.FechaSubasta;
import com.app.sacbin.subasta.model.service.IFechaSubasta;

@RestController
@RequestMapping("/api-subasta")
public class FechaSubastaController {
	
	@Autowired
	private IFechaSubasta fechaSubasta;
	
	@GetMapping("/fecha-subasta")
	public List<FechaSubasta> findAll(){
		
		return fechaSubasta.findAll();
	}

}
