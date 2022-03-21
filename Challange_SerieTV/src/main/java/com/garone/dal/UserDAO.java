package com.garone.dal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.garone.entities.Acquisto;
import com.garone.entities.SerieTV;
import com.garone.entities.User;

@Repository
public interface UserDAO extends JpaRepository<User, Integer> {
	
}
