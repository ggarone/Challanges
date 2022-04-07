package com.garone.service;

import java.util.List;
import java.util.Set;

import com.garone.entities.Documento;
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
	
	
	
	
	Documento getDocumentoById(int id);
//	Set<Documento> getDocumentiByViaggioId(int id);
	Set<Documento> getDocumentiById(int id);
}
