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
@RequestMapping("login")
public class Login {
	@Autowired
	private UserService service;
	
	@GetMapping
	public String loginPage (Model m,HttpSession session) {
		if(session.getAttribute("loggato") != null) {
			System.out.println("siamo gia' loggati");
			return "areaRiservata";
					
		} else {
			return "login";
		}
	}
	
	@PostMapping
	public String controlloLogin(@RequestParam String username, @RequestParam String password, Model m,HttpSession session) {
		if(this.service.isAuthTrue(username,password)) {
			System.out.println("login successo " + username + " " + password);
			return "areaRiservata";
		} else {
			System.out.println("login fallito " + username + " " + password);
			return "login";
		}	
	}
	
//	//GET call to /alimenti/api/ (alimenti root folder setted in application.properties)
//	@GetMapping
//	public String getAlimenti(Model m, HttpSession session){
//		session.setAttribute("ruolo", "admin");
//		m.addAttribute("lista",this.service.getAlimenti());
//		m.addAttribute("titolo","elenco alimenti");
//		
//		return "login";
//	}
//	
//	@GetMapping("{id}")
//	public ModelAndView getById(@PathVariable int id){
//		ModelAndView mav = new ModelAndView("dettaglio");
//		mav.addObject("titolo","dettaglio");
//		mav.addObject("alimento", this.service.getAlimentoById(id));
//		return mav;
//	}
}
