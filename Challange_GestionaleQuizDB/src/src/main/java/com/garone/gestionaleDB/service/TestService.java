package com.garone.gestionaleDB.service;

import java.util.List;
import java.util.Map;

import com.garone.gestionaleDB.entities.Test;

public interface TestService {
	void addTest(Test p);
	void updateTest(Test p);
	void deleteTest(int id);
	
	Test getTestById(int id);
	List<Test> getTests();
	Map<Integer, Test> getTestsMap();
}
