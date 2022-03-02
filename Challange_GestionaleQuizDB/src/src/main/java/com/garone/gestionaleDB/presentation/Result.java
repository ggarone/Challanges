package com.garone.gestionaleDB.presentation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.garone.gestionaleDB.entities.Domanda;
import com.garone.gestionaleDB.service.DomandaService;
import com.garone.gestionaleDB.service.PersonaService;
import com.garone.gestionaleDB.service.TestService;

@Controller
@RequestMapping("result")
public class Result {
	@Autowired
	private DomandaService domandaService;
	@Autowired
	private TestService testService;
	@Autowired
	private PersonaService personaService;
	
	@GetMapping
	public String classifica() {
		return "result";
	}

}
