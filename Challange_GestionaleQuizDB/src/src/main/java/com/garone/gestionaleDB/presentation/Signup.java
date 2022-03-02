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
import com.garone.gestionaleDB.entities.User;
import com.garone.gestionaleDB.service.PersonaService;
import com.garone.gestionaleDB.service.UserService;

@Controller
@RequestMapping("signup")
public class Signup {
	@Autowired
	private UserService service;
	
	@GetMapping
	public String loginPage (Model m,HttpSession session) {
		if(session.getAttribute("loggato") != null) {
			System.out.println("siamo gia' loggati");
			return "areaRiservata";
					
		} else {
			return "signup";
		}
	}
	
	@PostMapping
	public String controlloLogin(@RequestParam String username, @RequestParam String password, Model m,HttpSession session) {
		System.out.println(username + " " + password);
		User u = new User(0,username,password);
		System.out.println(u);
		this.service.addUser(u);
		System.out.println("added " + username + " " + password);
		
		if(this.service.isAuthTrue(username,password)) {
			System.out.println("login successo " + username + " " + password );
			return "areaRiservata";
		} else {
			System.out.println("login fallito " + username + " " + password );
			return "login";
		}	
	}
}
