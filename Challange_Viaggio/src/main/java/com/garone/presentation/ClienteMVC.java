package com.garone.presentation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.garone.service.ViaggioService;

@Controller
@RequestMapping("")
public class ClienteMVC {
	@Autowired
	private ViaggioService service;

	
	@GetMapping("")
	public String getElencoViaggi() {
		return "cliente.html";
	}
	
	@GetMapping("pagamento")
//	@RequestMapping(value = "pagamento/{id}", method = RequestMethod.GET)
	public String getPagamento() {
		System.out.println("qqqqq");
		return "acquista.html";
	}
	
	@GetMapping("conferma")
	public String getConfirmationPage() {
		return "conferma.html";
	}
	
	@GetMapping("uscita")
	public String getExitPage() {
		return "uscita.html";
	}
	
	@GetMapping("login")
	public String getLoginPage() {
		System.out.println("got here");
		return "login.html";
	}
	
	@PostMapping("login")
	public String postLoginPage() {
		// if utente loggato
		return "redirect:/viaggi";
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
		return "prenotazione.html";
	}
}