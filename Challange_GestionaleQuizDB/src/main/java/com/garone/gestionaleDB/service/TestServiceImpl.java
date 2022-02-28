package com.garone.gestionaleDB.service;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.garone.gestionaleDB.dal.TestDAO;
import com.garone.gestionaleDB.entities.Test;

@Service
public class TestServiceImpl implements TestService {
	@Autowired
	private TestDAO repo;	
	private Map<Integer,Test> testsMap;

	@Override
	public void addTest(Test t) {
		repo.save(t);
	}

	@Override
	public void updateTest(Test t) {
		repo.save(t);
	}

	@Override
	public void deleteTest(int id) {
		repo.deleteById(id);
	}

	@Override
	public Test getTestById(int id) {
		if(repo.findById(id).isPresent())
			return repo.findById(id).get();
		else
			return new Test();
	}
	

	@Override
	public List<Test> getTests() {
		return repo.findAll();
	}

	@Override
	public Map<Integer, Test> getTestsMap() {
		if(testsMap == null) {
			this.testsMap = new TreeMap<Integer, Test>();
			this.testsMap = repo.findAll().stream()
					.collect(Collectors.toMap(
							Test::getIdTest,
							Function.identity()));
			return testsMap; 				
			
		}
		
		return this.testsMap;
	}

}
