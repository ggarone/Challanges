package com.garone.integration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.garone.entities.Cliente;
import com.garone.service.ViaggioService;

@CrossOrigin
@RestController
@RequestMapping("api/clienti")
public class ClienteREST {
	
	@Autowired
	private ViaggioService service;

	
	@GetMapping("")
	public List<Cliente> getClienti() {
		return service.getClienti();
	}
	
	@PostMapping(name = "",consumes = MediaType.APPLICATION_JSON_VALUE)
	public Cliente addCliente(@RequestBody Cliente c) {
		System.out.println(c);
		service.addCliente(c);
		return c;
	}
	
	@GetMapping("id/{id}")
	public Cliente getClientiById(@PathVariable int id) {
		return service.getClienteById(id);
	}
}
