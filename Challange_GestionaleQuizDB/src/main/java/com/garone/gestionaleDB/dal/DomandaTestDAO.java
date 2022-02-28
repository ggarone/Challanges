package com.garone.gestionaleDB.dal;

import org.springframework.data.jpa.repository.JpaRepository;

import com.garone.gestionaleDB.entities.DomandaTest;
import com.garone.gestionaleDB.entities.DomandaTestId;

public interface DomandaTestDAO extends JpaRepository<DomandaTest, DomandaTestId> {

}
