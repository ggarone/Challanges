package com.garone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.garone.dal.DocDAO;
import com.garone.dal.ViaggioDAO;
import com.garone.entities.Documento;
import com.garone.entities.Viaggio;

@SpringBootApplication
public class ChallangeViaggioApplication {
	@Autowired
	private ViaggioDAO repoV;
	@Autowired
	private DocDAO repoD;

	public static void main(String[] args) {
		SpringApplication.run(ChallangeViaggioApplication.class, args);
	}
	
//	@Bean
//	public CommandLineRunner esempio1() {
//		return a -> {
//			Viaggio v = new Viaggio();
//			v.setDestinazione("Roma");
//			v.setDescrizione("Roma, capitale d'Italia, è considerata una delle più belle città del mondo. Il suo centro storico, insieme alle proprietà extraterritoriali della Santa Sede dentro la città e alla Basilica di San Paolo Fuori le Mura, è tra i 58 siti italiani inseriti dall'Unesco nella World Heritage List.");
//			v.setDurata(7);
//			v.setNome("Settimana Romana");
//			v.setPrezzo(700);
//			
//			Documento d = new Documento();
//			d.setNome("Locandina Roma");
//			d.setTipo("pdf");
//			d.setPath("/docs/locandina.pdf");
//			
//			Documento img = new Documento();
//			img.setNome("image Roma");
//			img.setTipo("jpg");
//			img.setPath("/img/roma.jpg");
//			
//			repoV.save(v);
//			repoD.save(d);
//			repoD.save(img);
//			
//			v.getDocumenti().add(d);
//			v.getDocumenti().add(img);
//			repoV.save(v);
//		};
//	}

}
