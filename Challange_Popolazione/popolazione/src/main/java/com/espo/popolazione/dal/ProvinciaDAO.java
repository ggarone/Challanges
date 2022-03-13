package com.espo.popolazione.dal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.espo.popolazione.entities.Provincia;

@Repository
public interface ProvinciaDAO extends JpaRepository<Provincia, Integer >{

	
	
	
}
