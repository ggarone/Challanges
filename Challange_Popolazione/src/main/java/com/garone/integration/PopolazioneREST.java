package com.garone.integration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.garone.entities.Eta;
import com.garone.entities.Provincia;
import com.garone.service.PopolazioneService;

@RestController
@RequestMapping("api")
public class PopolazioneREST {

	@Autowired
	private PopolazioneService service;
	
	@GetMapping("eta")
	public List<Eta> getEta(){
		
		return service.getAllEta();
	}
	
	@GetMapping("eta/{id}")
	public Eta getEta(@PathVariable int id){
		return service.getDatiByEta(id);
	}
	
	@GetMapping("province")
	public List<Provincia> getProvince(){
		return service.getProvince();
	}	
	
	@GetMapping("province/{regione}")
	public List<Provincia> getProvinceByRegione(@PathVariable String regione){
		return service.getProvinceByRegione(regione);
	}
	
	@GetMapping("provincia/{id}")
	public Provincia getProvById(@PathVariable int id){
		return service.getProvinciaById(id);
	}
}
