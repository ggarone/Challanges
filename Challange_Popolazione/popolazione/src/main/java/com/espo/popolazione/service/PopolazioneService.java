package com.espo.popolazione.service;

import java.util.List;

import com.espo.popolazione.entities.Eta;
import com.espo.popolazione.entities.Provincia;

public interface PopolazioneService {

	List<Eta> getAllEta();
	Eta getDatiByEta(int id);
	
	List<Provincia> getProvincia();
	List<Provincia> getProvinciaByRegione(String regione);
	
	Provincia getProvinciaById(int id);
	
	
	
	
	
}
