package com.garone.gestionaleDB.service;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.garone.gestionaleDB.dal.DomandaDAO;
import com.garone.gestionaleDB.entities.Domanda;

@Service
public class DomandaServiceImpl implements DomandaService {
	
	@Autowired
	private DomandaDAO repo;
	
	private Map<Integer, Domanda> domandeMap;

	@Override
	public void addDomanda(Domanda d) {
		repo.save(d);

	}

	@Override
	public void updateDomanda(Domanda d) {
		repo.save(d);

	}

	@Override
	public void deleteDomanda(int id) {
		repo.deleteById(id);

	}

	@Override
	public Domanda getDomandaById(int id) {
		if(repo.findById(id).isPresent())
			return repo.findById(id).get();
		else
			return new Domanda();
	}

	@Override
	public List<Domanda> getDomande() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Map<Integer, Domanda> getDomandeMap() {
		if(domandeMap == null) {
			this.domandeMap = new TreeMap<Integer, Domanda>();
			this.domandeMap = repo.findAll().stream()
					.collect(Collectors.toMap(
							Domanda::getIdDomanda,
							Function.identity()));
			return domandeMap; 				
			
		}
		
		return this.domandeMap;
		
	}

}
