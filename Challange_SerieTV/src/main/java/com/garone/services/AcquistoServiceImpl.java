package com.garone.services;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.garone.dal.AcquistoDAO;
import com.garone.dal.SerieTVDAO;
import com.garone.dal.UserDAO;
import com.garone.entities.Acquisto;
import com.garone.entities.SerieTV;
import com.garone.entities.User;

@Service
public class AcquistoServiceImpl implements AcquistoService {

	@Autowired
	private AcquistoDAO repoAcquisto;
	@Autowired
	private SerieTVDAO repoSerie;
	@Autowired
	private UserDAO repoUser;
	
	@Override
	public void addAcquisto(Acquisto a) {
		repoAcquisto.save(a);
	}

	@Override
	public List<Acquisto> getAcquisti() {
		return repoAcquisto.findAll();
	}

}
