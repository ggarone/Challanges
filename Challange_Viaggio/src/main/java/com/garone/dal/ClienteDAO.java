package com.garone.dal;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.garone.entities.Cliente;
import com.garone.entities.Documento;
import com.garone.entities.Viaggio;

@Repository
public interface ClienteDAO extends JpaRepository<Cliente, Integer> {
}
