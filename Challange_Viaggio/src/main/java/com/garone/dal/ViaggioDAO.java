package com.garone.dal;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.garone.entities.Viaggio;

@Repository
public interface ViaggioDAO extends JpaRepository<Viaggio, Integer> {
	//derived query
	List<Viaggio> findByDestinazione(String destinazione);
	
	@Query(value = "select doc_id from viaggi.rel_viaggi_documenti where viaggi_id=:id", nativeQuery = true)
	List<Integer> getDocumentiId(@Param("id") int id); 
	

}
