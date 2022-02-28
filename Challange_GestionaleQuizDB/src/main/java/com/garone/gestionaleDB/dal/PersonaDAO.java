package com.garone.gestionaleDB.dal;

import org.springframework.data.jpa.repository.JpaRepository;
import com.garone.gestionaleDB.entities.Persona;

public interface PersonaDAO extends JpaRepository<Persona, Integer> {

}
