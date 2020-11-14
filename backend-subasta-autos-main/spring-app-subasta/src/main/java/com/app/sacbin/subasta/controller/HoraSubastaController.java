package com.app.sacbin.subasta.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.app.sacbin.subasta.model.entity.HoraSubasta;
import com.app.sacbin.subasta.model.service.IHoraSubasta;

@RestController
@RequestMapping("/api-subasta")
public class HoraSubastaController {
	
	@Autowired
	private IHoraSubasta horaSubastaService;
	
	@GetMapping("/hora-subasta")
	public List<HoraSubasta> getAll(){
		return horaSubastaService.findAll();
	}

}
