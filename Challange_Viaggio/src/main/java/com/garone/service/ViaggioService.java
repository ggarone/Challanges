package com.garone.service;

import java.util.List;

import com.garone.entities.Viaggio;

public interface ViaggioService {
	
	//	CRUD
	void addViaggio(Viaggio v);
	void updateViaggio(Viaggio v);
	void deleteViaggio(int id);
	
	//api REST
	List<Viaggio> getViaggi();
	List<Viaggio> getViaggiByDestinazione(String destinazione);
	Viaggio getViaggioById(int id);
}
