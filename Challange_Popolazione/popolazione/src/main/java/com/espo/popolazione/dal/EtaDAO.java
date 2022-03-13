package com.espo.popolazione.dal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.espo.popolazione.entities.Eta;

@Repository
public interface EtaDAO extends JpaRepository<Eta, Integer> {

}
