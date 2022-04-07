package com.garone.presentation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.garone.service.ViaggioService;

@Controller
public class ClienteMVC {
	@Autowired
	private ViaggioService service;

	
	@GetMapping("")
	public String getElencoViaggi() {
		return "cliente.html";
	}
	
	@GetMapping("pagamento")
	public String getPagamento() {
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
	
}