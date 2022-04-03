package com.garone.integration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.garone.entities.Viaggio;
import com.garone.service.ViaggioService;

@RestController
@RequestMapping("api/viaggi")
public class ViaggioREST {
	
	@Autowired
	private ViaggioService service;
	
	@GetMapping("")
	public List<Viaggio> getViaggi() {
		return service.getViaggi();
	}
	
	@GetMapping("d/{destinazione}")
	public List<Viaggio> getViaggiByDestinazione(@PathVariable String destinazione) {
		return service.getViaggiByDestinazione(destinazione.toLowerCase());
	}
	
	@GetMapping("i/{id}")
	public Viaggio getViaggioById(@PathVariable int id) {
		return service.getViaggioById(id);
	}

}
