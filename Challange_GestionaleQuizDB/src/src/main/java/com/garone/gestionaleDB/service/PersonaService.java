package com.garone.gestionaleDB.service;

import java.util.List;
import java.util.Map;

import com.garone.gestionaleDB.entities.Persona;

public interface PersonaService {
	void addPersona(Persona p);
	void updatePersona(Persona p);
	void deletePersona(int id);
	
	Persona getPersonaById(int id);
	List<Persona> getPersone();
	Map<Integer, Persona> getPersoneMap();
}
