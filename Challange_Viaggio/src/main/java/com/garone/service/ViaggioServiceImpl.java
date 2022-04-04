package com.garone.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.garone.dal.ViaggioDAO;
import com.garone.entities.Viaggio;

@Service
public class ViaggioServiceImpl implements ViaggioService{
	
	@Autowired
	private ViaggioDAO repo;

	@Override
	public void addViaggio(Viaggio v) {
		repo.save(v);
		
	}

	@Override
	public void updateViaggio(Viaggio v) {
		repo.save(v);
		
	}

	@Override
	public void deleteViaggio(int id) {
		repo.deleteById(id);
		
	}

	@Override
	public List<Viaggio> getViaggi() {
		return repo.findAll();
	}

	@Override
	public List<Viaggio> getViaggiByDestinazione(String destinazione) {
		return repo.findByDestinazione(destinazione);
	}

	@Override
	public Viaggio getViaggioById(int id) {
		return repo.findById(id).get();
	}
	
	

}
