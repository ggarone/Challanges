package com.espo.popolazione.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.espo.popolazione.dal.EtaDAO;
import com.espo.popolazione.dal.ProvinciaDAO;
import com.espo.popolazione.entities.Eta;
import com.espo.popolazione.entities.Provincia;

@Service
public class PopolazioneServiceImpl implements PopolazioneService {
	
	@Autowired
	private ProvinciaDAO repoPro;
	
	@Autowired
	private EtaDAO repoEta;

	@Override
	public List<Provincia> getProvincia() {
		// TODO Auto-generated method stub
		return repoPro.findAll();
	}

	@Override
	public List<Provincia> getProvinciaByRegione(String regione) {

		List<Provincia> lista = getProvincia().stream()
											.filter(s-> s.getRegione().equals(regione))
											.collect(Collectors.toList());
		return lista;
	}

	@Override
	public Provincia getProvinciaById(int id) {
		// TODO Auto-generated method stub
		return repoPro.findById(id).get();
	}

	@Override
	public List<Eta> getAllEta() {
		// TODO Auto-generated method stub
		return repoEta.findAll();
	}

	@Override
	public Eta getDatiByEta(int id) {
		// TODO Auto-generated method stub
		return repoEta.findById(id).get();
	}

}
