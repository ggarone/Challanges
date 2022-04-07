package com.garone.integration;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.garone.entities.Documento;
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
	
	@PostMapping("")
	public Viaggio addViaggio(@RequestBody Viaggio v) {
		service.addViaggio(v);
		return v;
	}
	
	@GetMapping("location/{destinazione}")
	public List<Viaggio> getViaggiByDestinazione(@PathVariable String destinazione) {
		return service.getViaggiByDestinazione(destinazione.toLowerCase());
	}
	
	@GetMapping("id/{id}")
	public Viaggio getViaggioById(@PathVariable int id) {
		return service.getViaggioById(id);
	}
	
	@DeleteMapping("id/{id}")
	public void deleteViaggioById(@PathVariable int id) {
		service.deleteViaggio(id);
	}
	
	@PutMapping("id/{id}")
	public void updateViaggioById(@RequestBody Viaggio v) {
		service.updateViaggio(v);
	}
	
	@GetMapping("documenti/{id}")
	public List<Documento> getDocumentiByViaggioId(@PathVariable int id){
		Set<Documento> documentiByViaggioId = service.getDocumentiById(id);
		documentiByViaggioId.forEach(System.out::println);
		return documentiByViaggioId.stream().toList();
	}
	


}
