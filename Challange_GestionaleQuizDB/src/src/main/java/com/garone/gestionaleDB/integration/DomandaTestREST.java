package com.garone.gestionaleDB.integration;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.garone.gestionaleDB.entities.Domanda;
import com.garone.gestionaleDB.entities.DomandaTest;
import com.garone.gestionaleDB.entities.Test;
import com.garone.gestionaleDB.service.DomandaTestService;

@RestController
@RequestMapping("api/domandatest")
public class DomandaTestREST {
	@Autowired
	private DomandaTestService service;

	@GetMapping
	public Map<Integer, Domanda> getDomandeTest() {
		return service.getDomandeTestMap();
	}

}