package com.garone.gestionaleDB.dal;

import org.springframework.data.jpa.repository.JpaRepository;
import com.garone.gestionaleDB.entities.Test;

public interface TestDAO extends JpaRepository<Test, Integer> {

}
