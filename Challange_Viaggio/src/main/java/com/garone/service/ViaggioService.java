package com.garone.service;

import java.util.List;
import java.util.Set;

import com.garone.entities.Cliente;
import com.garone.entities.Documento;
import com.garone.entities.Prenotazione;
import com.garone.entities.Viaggio;

public interface ViaggioService {
	
	//	CRUD
	void addViaggio(Viaggio v);
	Viaggio updateViaggio(Viaggio v);
	void deleteViaggio(int id);
	
	//api REST
	List<Viaggio> getViaggi();
	List<Viaggio> getViaggiByDestinazione(String destinazione);
	Viaggio getViaggioById(int id);
	
	void addCliente(Cliente c);
	List<Cliente> getClienti();
	Cliente getClienteById(int id);
	
	Documento getDocumentoById(int id);
//	Set<Documento> getDocumentiByViaggioId(int id);
	Set<Documento> getDocumentiById(int id);
	
	void addPrenotazione(int id_viaggio, int id_cliente);
	List<Prenotazione> getPrenotazioni();
}
