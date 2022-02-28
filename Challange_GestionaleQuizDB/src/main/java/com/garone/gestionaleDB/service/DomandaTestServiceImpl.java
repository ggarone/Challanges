package com.garone.gestionaleDB.service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.garone.gestionaleDB.dal.DomandaTestDAO;
import com.garone.gestionaleDB.entities.Domanda;
import com.garone.gestionaleDB.entities.DomandaTest;
import com.garone.gestionaleDB.entities.Test;

@Service
public class DomandaTestServiceImpl implements DomandaTestService {
	
	@Autowired
	private DomandaTestDAO repo;

	@Override
	public List<Domanda> getDomandeFromTests(int idTest) {
		return null;
	}

	@Override
	public Test getTestFromDomanda(int idDomanda) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Domanda> getDomande() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Test> getTests() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<Integer, Domanda> getDomandeTestMap() {
		 List<DomandaTest> domandatest = repo.findAll();
		 
		 Map<Integer,Test> testMap = domandatest.stream().
				 collect(Collectors.toMap(item -> item.getTest().getIdTest() , item -> item.getTest()));
		 
		 Map<Integer, Domanda> domandeMap = domandatest.stream().
				 collect(Collectors.toMap(item -> item.getDomanda().getIdDomanda() , item -> item.getDomanda()));
		 
		return domandeMap;
	}

}
