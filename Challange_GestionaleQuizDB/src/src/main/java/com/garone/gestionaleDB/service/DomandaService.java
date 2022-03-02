package com.garone.gestionaleDB.service;

import java.util.List;
import java.util.Map;

import com.garone.gestionaleDB.entities.Domanda;

public interface DomandaService {
	void addDomanda(Domanda p);
	void updateDomanda(Domanda p);
	void deleteDomanda(int id);
	
	Domanda getDomandaById(int id);
	List<Domanda> getDomande();
	Map<Integer, Domanda> getDomandeMap();
}
