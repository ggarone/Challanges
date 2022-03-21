package com.garone.presentation;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.garone.entities.Acquisto;
import com.garone.entities.SerieTV;
import com.garone.entities.User;
import com.garone.services.AcquistoService;

@Controller
public class AcquistoMVC {
	
	@Autowired
	private AcquistoService service;
	
//	@PostMapping(value = "acquisto",consumes = {"multipart/form-data"})
////	public String generateAcquisto(@RequestParam int userId, @RequestParam String nome) {
//	public String generateAcquisto(@RequestParam("idSerie") int idSerie,@RequestParam("nome") String nome,
//			@RequestParam("idUser") int idUser, @RequestParam("titolo") String titolo, @RequestParam("genere") String genere,
//			@RequestParam("rating") double rating, @RequestParam("summary") String summary, @RequestParam("img") String img) {
//		
//		LocalDate date = LocalDate.now();
//		User u = new User(idUser, nome);
//		SerieTV s = new SerieTV(idSerie, titolo, genere, rating, summary, img);
//		System.out.println(s);
//		Acquisto a = new Acquisto(u, s, date);
//		service.addAcquisto(a);
//		System.out.println(a.toString());
//		System.out.println("-------------------------\n" + nome);
//		return "redirect:details";
//	
//	}
}
