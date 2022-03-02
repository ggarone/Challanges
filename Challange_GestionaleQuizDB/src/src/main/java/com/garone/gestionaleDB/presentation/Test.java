package com.garone.gestionaleDB.presentation;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.garone.gestionaleDB.entities.Domanda;
import com.garone.gestionaleDB.service.DomandaService;
import com.garone.gestionaleDB.service.PersonaService;
import com.garone.gestionaleDB.service.TestService;

@Controller
@RequestMapping("test")
public class Test {
	@Autowired
	private DomandaService domandaService;
	@Autowired
	private TestService testService;
	@Autowired
	private PersonaService personaService;
	
	
	@GetMapping
	public String generateTest(Model m) {
		System.out.println("I was here");
		List<Domanda> domande =  domandaService.getDomande();
		//put list elements on a random order
		Collections.shuffle(domande);
		//limit list to 5 elements
		List<Domanda> fiveRandomDomande = domande.stream().limit(5).collect(Collectors.toList());
		fiveRandomDomande.forEach(p -> System.out.println(p));
		m.addAttribute("domande",fiveRandomDomande);
//		m.addAttribute("pun")
		return "test";
	}
	
//	@GetMapping("{id}")
//	public ModelAndView getById(@PathVariable int id){
//		ModelAndView mav = new ModelAndView("dettaglio");
//		mav.addObject("titolo","dettaglio");
//		mav.addObject("alimento", this.service.getAlimentoById(id));
//		return mav;
//	}
	
	
	

}
