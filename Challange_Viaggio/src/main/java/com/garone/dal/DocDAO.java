package com.garone.dal;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.garone.entities.Documento;
import com.garone.entities.Viaggio;

@Repository
public interface DocDAO extends JpaRepository<Documento, Integer> {
	//derived query
	List<Viaggio> findByTipo(String tipo);

}
