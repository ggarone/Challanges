package com.garone.integration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.garone.entities.Viaggio;
import com.garone.service.ViaggioService;

import net.bytebuddy.asm.Advice.OffsetMapping.ForSerializedValue;

@RestController
@RequestMapping("api/viaggi")
public class ViaggioREST {
	
	@Autowired
	private ViaggioService service;
	
	@GetMapping("")
	public List<Viaggio> getViaggi() {
		return service.getViaggi();
	}
	
	@GetMapping("location/{destinazione}")
	public List<Viaggio> getViaggiByDestinazione(@PathVariable String destinazione) {
		return service.getViaggiByDestinazione(destinazione.toLowerCase());
	}
	
	@GetMapping("id/{id}")
	public Viaggio getViaggioById(@PathVariable int id) {
		return service.getViaggioById(id);
	}
	
	@GetMapping("delete/{id}")
	public void deleteViaggioById(@PathVariable int id) {
		service.deleteViaggio(id);
	}
	
	@GetMapping("update/{id}")
	public void updateViaggioById(@PathVariable int id) {
		Viaggio v = service.getViaggioById(id);
		service.updateViaggio(v);
	}
	
	@PostMapping("add")
	public Viaggio addViaggio(@RequestBody Viaggio v) {
		service.addViaggio(v);
		return v;
	}

}
