package com.garone.dal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.garone.entities.Provincia;

@Repository
public interface ProvinciaDAO extends JpaRepository<Provincia, Integer >{

	
	
	
}
