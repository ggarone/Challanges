package com.espo.popolazione.integration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.espo.popolazione.entities.Eta;
import com.espo.popolazione.entities.Provincia;
import com.espo.popolazione.service.PopolazioneService;

@RestController
@RequestMapping("api")
public class PopolazioneREST {

	@Autowired
	private PopolazioneService service;
	
	@GetMapping("eta")
	public List<Eta> getEta(){
		
		return service.getAllEta();
	}
	
	@GetMapping("province")
	public List<Provincia> getProvince(){
		
		return service.getProvincia();
	}
	
	@GetMapping("province")
	public List<Provincia> getProvince(){
		
		return service.getProvincia();
	}
	
	
}
