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
//			
//			Documento d = new Documento();
//			d.setNome("Locandina Roma");
//			d.setTipo("pdf");
//			d.setPath("/docs/locandina.pdf");
//			
//			repoV.save(v);
//			repoD.save(d);
//			
//			v.getDocumenti().add(d);
//			repoV.save(v);
//			
//			
//		};
//	}

}
