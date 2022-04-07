package com.garone.service;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.garone.dal.DocDAO;
import com.garone.dal.ViaggioDAO;
import com.garone.entities.Documento;
import com.garone.entities.Viaggio;

@Service
public class ViaggioServiceImpl implements ViaggioService{
	
	@Autowired
	private ViaggioDAO repo;
	
	@Autowired
	private DocDAO repoDoc;

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
//		return repo.getById(id);
		return repo.findById(id).get();
	}

	@Override
	public Documento getDocumentoById(int id) {
		return repoDoc.findById(id).get();
	}

	@Override
	public Set<Documento> getDocumentiById(int id) {
		Set<Documento> documentiSet = new HashSet<Documento>();
		
		repo.getDocumentiId(id).forEach(System.out::println);
		
		
		for (Integer id_ : repo.getDocumentiId(id)) {
			System.out.println("for -> " + id_);
			documentiSet.add(repoDoc.findById(id_).get());
		}
		
		System.out.println(documentiSet.size());
		
		return documentiSet;
	}
	
	
	
	

}
