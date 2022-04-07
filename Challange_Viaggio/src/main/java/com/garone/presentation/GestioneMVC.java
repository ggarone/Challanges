package com.garone.presentation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.garone.service.ViaggioService;

@Controller
@RequestMapping("gestione")
public class GestioneMVC {
	@Autowired
	private ViaggioService service;
	
	@GetMapping("login")
	@ModelAttribute("login")
	public String getLoginPage() {
		return "login.html";
	}
	
	@PostMapping("login")
	public String postLoginPage() {
		// if utente loggato
		return "redirect:/viaggi.html";
		// else
//		return "index.html";
	}
	
	@GetMapping("list")
	public String getViaggiList() {
		return "viaggi.html";
	}
	
	@GetMapping("add")
	public String getViaggiForm() {
		return "operatore.html";
	}
	
	@GetMapping("prenotazioni")
	public String getPrenotazioniPage() {
		return "prenotazioni.html";
	}
}
