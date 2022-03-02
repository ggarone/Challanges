package com.garone.gestionaleDB.presentation;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.garone.gestionaleDB.entities.Domanda;
import com.garone.gestionaleDB.service.DomandaService;
import com.garone.gestionaleDB.service.PersonaService;
import com.garone.gestionaleDB.service.TestService;

@Controller
@RequestMapping("areaRiservata")
public class areaRiservata {
	@Autowired
	private DomandaService domandaService;
	@Autowired
	private TestService testService;
	@Autowired
	private PersonaService personaService;
	
	@GetMapping
	public String classifica(Model m) {
		//da implementare
//		com.garone.gestionaleDB.entities.Test dailyTest = testService.getDailyTest();
		com.garone.gestionaleDB.entities.Test dailyTest = testService.getTestById(1);
		System.out.println(dailyTest);
		m.addAttribute("test",dailyTest);
		return "areaRiservata";
	}
}
