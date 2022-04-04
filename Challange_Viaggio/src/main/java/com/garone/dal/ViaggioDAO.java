package com.garone.dal;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.garone.entities.Viaggio;

@Repository
public interface ViaggioDAO extends JpaRepository<Viaggio, Integer> {
	//derived query
	List<Viaggio> findByDestinazione(String destinazione);

}
