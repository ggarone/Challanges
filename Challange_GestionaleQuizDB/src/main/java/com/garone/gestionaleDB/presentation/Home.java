package com.garone.gestionaleDB.presentation;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.garone.gestionaleDB.entities.Persona;
import com.garone.gestionaleDB.service.PersonaService;
import com.garone.gestionaleDB.service.UserService;

@Controller
@RequestMapping({"","home"})
public class Home {
	@Autowired
	private UserService service;
	
	@GetMapping
	public String loginPage (Model m,HttpSession session) {
		if(session.getAttribute("loggato") != null) {
			System.out.println("siamo gia' loggati");
			return "areaRiservata";
					
		} else {
			return "home";
		}
	}
}
