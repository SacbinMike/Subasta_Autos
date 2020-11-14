package com.app.sacbin.subasta.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.sacbin.subasta.model.entity.FechaSubasta;
import com.app.sacbin.subasta.model.entity.Subasta;
import com.app.sacbin.subasta.model.service.IFechaSubasta;
import com.app.sacbin.subasta.model.service.ISubastaService;


@RestController
@RequestMapping("/api-subasta")
public class SubastaController {
	
	@Autowired
	private ISubastaService subastaService;
	@Autowired
	private IFechaSubasta fechaSubastaService;
	
	@PostMapping("/subasta")
	public ResponseEntity<?> store(@RequestBody Subasta subasta) {
		
		Subasta subastaNew = new Subasta();
		Map<String, Object> response= new HashMap<>();
		FechaSubasta fechaSubasta=fechaSubastaService.findById(subasta.getFechaSubasta().getId());
		fechaSubasta.setStatus("I");
		
		
		try {
		   
			fechaSubastaService.store(fechaSubasta);
			subastaNew =subastaService.store(subasta);			
		}
		catch(DataAccessException e) {
			
			response.put("mensaje","Error al realizar el isert en la BBDD");
			response.put("errors",e.getMessage().concat(": ").concat(e.getMostSpecificCause().getMessage()));
			
			return new ResponseEntity<Map<String,Object>>(response,HttpStatus.INTERNAL_SERVER_ERROR);		
		}
		
		response.put("mensaje","Subasta registrado con exito");
		response.put("cliente", subastaNew);
		return  new ResponseEntity<Map<String,Object>>(response,HttpStatus.CREATED);

	}
	
	
	@GetMapping("/subasta")
	public List<Subasta> findAll(){
		return subastaService.findAll();
	}

}
