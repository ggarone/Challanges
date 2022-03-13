package com.garone.presentation;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.garone.entities.Eta;
import com.garone.entities.Provincia;
import com.garone.service.PopolazioneService;

@Controller
public class PopolazioneMVC {
	@Autowired
	private PopolazioneService service;
	
	@GetMapping
	public String getHomePage() {
		return "home";
	}
	
	@GetMapping("regioni")
	public String getRegioniPage(Model m) {
		Set<String> regioni = service.getProvince().stream()
				.map(p -> p.getRegione())
				.collect(Collectors.toSet());
		m.addAttribute("regioni", regioni);
		return "regioni";
	}
	
	@PostMapping("regioni")
	public String getSelectedRegione(Model m, @RequestParam String regione) {
		return "redirect:/province/" + regione; 
	}
	
	@GetMapping("province/{regione}")
	public String getProvince(Model m,@PathVariable String regione) {
		List<Provincia> provinciaByRegione = service.getProvinceByRegione(regione);
		
		List<String> list = service.getProvinceByRegione(regione).stream()
			.map(p -> p.getProvincia())
			.toList();
		
		list.forEach(s -> System.out.println(s));
		
		m.addAttribute("province", list);
		return "province";
	}
	
	@PostMapping("province/{provincia}")
	public String postProvince(Model m, @RequestParam String provincia) {
		return "redirect:/details/" + provincia;
	}
	
	@GetMapping("details/{provincia}")
	public String getDetailsFromProvincia(Model m, @PathVariable String provincia) {
		Provincia prov = service.getProvince().stream()
			.filter(p -> p.getProvincia().equals(provincia))
			.toList().get(0);
		
		m.addAttribute("provincia",prov);
		return "details";
	}
	
	@GetMapping("eta")
	public String getEtaPage(Model m) {
		
		return "eta";
	}
	
	@PostMapping("eta")
	public String getEtaByRange(Model m, @RequestParam int min, @RequestParam int max) {
		List<Eta> etaRange = service.getEtaByRange(min, max);
		return "redirect:/eta/" + min + "/" + max;
	}
	
	@ModelAttribute("etichette")
	public List<String> etichette(){
		return Arrays.asList("regioni","eta","details");
	}
}
