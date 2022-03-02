package com.garone.gestionaleDB.service;

import java.util.List;
import java.util.Map;
import com.garone.gestionaleDB.entities.DomandaTest;
import com.garone.gestionaleDB.entities.Domanda;
import com.garone.gestionaleDB.entities.Test;

public interface DomandaTestService {
	List<Domanda> getDomandeFromTests(int idTest);
	Test getTestFromDomanda(int idDomanda);
	List<Domanda> getDomande();
	List<Test> getTests();
	Map<Integer, Domanda> getDomandeTestMap();
}
