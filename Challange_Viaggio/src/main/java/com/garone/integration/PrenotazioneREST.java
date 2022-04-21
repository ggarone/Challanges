package com.garone.integration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.garone.entities.Cliente;
import com.garone.entities.Prenotazione;
import com.garone.service.ViaggioService;

@RestController
@RequestMapping("api/prenotazioni")
public class PrenotazioneREST {
	@Autowired
	private ViaggioService service;
	
	@GetMapping(name = "", produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<Prenotazione> getClienti() {
		System.out.println(service.getPrenotazioni());
		return service.getPrenotazioni();
		
//		return "{\"n\":1}";
		
//		return null;
	}
	
	@PostMapping()
	void addPrenotazione(@RequestParam int id_viaggio, @RequestParam int id_cliente) {
		System.out.println("===========>" + id_viaggio + id_cliente);
		service.addPrenotazione(id_viaggio, id_cliente);
	}

}
