package com.garone.integration;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.garone.entities.Acquisto;
import com.garone.entities.SerieTV;
import com.garone.entities.User;
import com.garone.entities.UserSerie;
import com.garone.services.AcquistoService;

@RestController
@RequestMapping("api")
public class AcquistoREST {
	@Autowired
	private AcquistoService service;
	
	@GetMapping("acquisti")
	public List<Acquisto> getAcquisti() {
		return service.getAcquisti();
	}
	
	@PostMapping("acquisto")
//	public String generateAcquisto(@RequestParam int userId, @RequestParam String nome) {
	public Acquisto generateAcquisto(@RequestBody Acquisto a) {
		LocalDate date = LocalDate.now();
		a.setData(date);
		UserSerie us = new UserSerie(a.getUser().getId(), a.getSerieTV().getId());
		a.setId(us);
		System.out.println(a);
		service.addAcquisto(a);
		return a;
	}
}
