package com.garone.gestionaleDB.dal;

import org.springframework.data.jpa.repository.JpaRepository;
import com.garone.gestionaleDB.entities.Persona;
import com.garone.gestionaleDB.entities.User;

public interface UserDAO extends JpaRepository<User, Integer> {

}
