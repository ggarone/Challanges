package com.garone.gestionaleDB.integration;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.garone.gestionaleDB.entities.Persona;
import com.garone.gestionaleDB.entities.User;
import com.garone.gestionaleDB.service.PersonaService;
import com.garone.gestionaleDB.service.UserService;

@RestController
@RequestMapping("api/user")
public class UserREST {
	@Autowired
	private UserService service;

	@GetMapping
	public List<User> getPersone() {
		return service.getPersone();
	}
	
	//POST call to /api/auto
	@PostMapping
	public void addAuto(@RequestBody User u) {
		this.service.addUser(u);
	}

}