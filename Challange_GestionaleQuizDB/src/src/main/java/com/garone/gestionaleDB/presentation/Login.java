package com.garone.gestionaleDB.presentation;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
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
	
	
	//forward??
//	@PostMapping
//	public ModelAndView controlloLogin(@RequestParam String username, @RequestParam String password, ModelMap  m,HttpSession session) {
//		if(this.service.isAuthTrue(username,password)) {
//			System.out.println("login successo " + username + " " + password);
//			m.addAttribute("attribute", "forwardWithForwardPrefix");
//			return new ModelAndView("forward:/areaRiservata", m);
////			return "areaRiservata";
//		} else {
//			System.out.println("login fallito " + username + " " + password);
//			m.addAttribute("attribute", "forwardWithForwardPrefix");
//			return new ModelAndView("forward:/login", m);
//			// return "login";
//		}	
//	}
	
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
}
