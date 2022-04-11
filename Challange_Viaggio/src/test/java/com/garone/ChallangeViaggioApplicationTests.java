package com.garone;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Set;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.garone.entities.Documento;
import com.garone.entities.Viaggio;
import com.garone.service.ViaggioService;

@SpringBootTest
class ChallangeViaggioApplicationTests {
	
	@Autowired
	private ViaggioService service;
	
	
	@Test
	void contextLoads() {
		Viaggio viaggioById = service.getViaggioById(1);
		assertTrue(viaggioById.getId() == 1); 
		
		Set<Documento> documentiByViaggioId = service.getDocumentiById(1);
		System.out.println(documentiByViaggioId);
		
		
	}
	
	

}
