package com.garone.gestionaleDB.service;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.garone.gestionaleDB.dal.PersonaDAO;
import com.garone.gestionaleDB.entities.Domanda;
import com.garone.gestionaleDB.entities.Persona;

@Service
public class PersonaServiceImpl implements PersonaService {
	@Autowired
	private PersonaDAO repo;
	
	private Map<Integer,Persona> personeMap;

	@Override
	public void addPersona(Persona p) {
		repo.save(p);
	}

	@Override
	public void updatePersona(Persona p) {
		repo.save(p);
	}

	@Override
	public void deletePersona(int id) {
		repo.deleteById(id);
	}

	@Override
	public Persona getPersonaById(int id) {
		if(repo.findById(id).isPresent())
			return repo.findById(id).get();
		else
			return new Persona();
	}

	@Override
	public List<Persona> getPersone() {
		return repo.findAll();
	}

	@Override
	public Map<Integer, Persona> getPersoneMap() {
		if(personeMap == null) {
			this.personeMap = new TreeMap<Integer, Persona>();
			this.personeMap = repo.findAll().stream()
					.collect(Collectors.toMap(
							Persona::getId,
							Function.identity()));
			return personeMap; 				
		}
		return this.personeMap;
	}
}
