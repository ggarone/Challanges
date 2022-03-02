package com.garone.gestionaleDB.presentation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.garone.gestionaleDB.service.DomandaService;
import com.garone.gestionaleDB.service.PersonaService;
import com.garone.gestionaleDB.service.TestService;

@Controller
@RequestMapping("classifica")
public class Classifica {
	@Autowired
	private DomandaService domandaService;
	@Autowired
	private TestService testService;
	@Autowired
	private PersonaService personaService;
	
	@GetMapping
	public String classifica() {
		return "classifica";
	}

}
