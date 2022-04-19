package com.garone.presentation;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

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
	
	@PostMapping("id/{id}")
	public String postPagamento(@RequestParam int id) {
		return "redirect:/pagamento/id/"+id;
	}
	
	@PostMapping("pagamento/id/{id}")
//	@ResponseBody
	public String getPagamento(@RequestParam("id") int id) {
		System.out.println(id);
		StringBuilder sb = new StringBuilder("id"+id);
		sb.append("\n");
//		return sb.toString();
		return "redirect:/acquistag?id=" + id;
		
	}
	
	@GetMapping("acquistag")
	public String getAcquista(@RequestParam String id) {
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