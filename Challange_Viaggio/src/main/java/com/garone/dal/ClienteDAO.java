package com.garone.dal;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.garone.entities.Cliente;
import com.garone.entities.Documento;
import com.garone.entities.Prenotazione;
import com.garone.entities.Viaggio;

@Repository
public interface ClienteDAO extends JpaRepository<Cliente, Integer> {
	@Transactional
	@Modifying
	@Query(value = "insert into prenotazioni (viaggi_id,clienti_id) values(?1,?2)", nativeQuery = true)
	void addPrenotazione(int viaggi_id,int clienti_id); 
	
	@Query(value = "select * from prenotazioni", nativeQuery = true)
	List<List<Integer>> getPrenotazioni(); 
	
	
}
