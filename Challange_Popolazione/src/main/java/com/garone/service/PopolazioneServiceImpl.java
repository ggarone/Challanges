package com.garone.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.garone.dal.EtaDAO;
import com.garone.dal.ProvinciaDAO;
import com.garone.entities.Eta;
import com.garone.entities.Provincia;

@Service
public class PopolazioneServiceImpl implements PopolazioneService {
	
	@Autowired
	private ProvinciaDAO repoPro;
	
	@Autowired
	private EtaDAO repoEta;

	@Override
	public List<Provincia> getProvince() {
		// TODO Auto-generated method stub
		return repoPro.findAll();
	}

	@Override
	public List<Provincia> getProvinceByRegione(String regione) {

		List<Provincia> lista = getProvince().stream()
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
	
	public List<Eta> getEtaByRange(int min, int max){
		return getAllEta().stream()
				.filter(e -> e.getEta() <= min && e.getEta() >= max)
				.toList();
	}
}
