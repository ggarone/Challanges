package com.garone.dal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.garone.entities.Eta;

@Repository
public interface EtaDAO extends JpaRepository<Eta, Integer> {

}
