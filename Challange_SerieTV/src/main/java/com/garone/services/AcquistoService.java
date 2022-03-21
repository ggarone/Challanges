package com.garone.services;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.garone.entities.Acquisto;
import com.garone.entities.SerieTV;
import com.garone.entities.User;


public interface AcquistoService {
	void addAcquisto(Acquisto a);
	List<Acquisto> getAcquisti();
}
