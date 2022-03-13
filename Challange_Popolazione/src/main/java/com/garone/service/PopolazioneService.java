package com.garone.service;

import java.util.List;

import com.garone.entities.Eta;
import com.garone.entities.Provincia;

public interface PopolazioneService {

	List<Eta> getAllEta();
	Eta getDatiByEta(int id);
	public List<Eta> getEtaByRange(int min, int max);
	
	List<Provincia> getProvince();
	List<Provincia> getProvinceByRegione(String regione);
	
	Provincia getProvinciaById(int id);
	
	
	
	
	
}
