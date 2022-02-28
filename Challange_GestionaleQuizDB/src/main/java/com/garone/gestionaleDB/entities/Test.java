package com.garone.gestionaleDB.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "test")
public class Test {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idTest;
	private String titoloTest;
	private LocalDate dataTest;
	
	public Test() {
		// TODO Auto-generated constructor stub
	}
	
	public Test(int idTest, String titoloTest, LocalDate dataTest) {
		super();
		this.idTest = idTest;
		this.titoloTest = titoloTest;
		this.dataTest = dataTest;
	}

	public int getIdTest() {
		return idTest;
	}

	public void setIdTest(int idTest) {
		this.idTest = idTest;
	}

	public String getTitoloTest() {
		return titoloTest;
	}

	public void setTitoloTest(String titoloTest) {
		this.titoloTest = titoloTest;
	}

	public LocalDate getDataTest() {
		return dataTest;
	}

	public void setDataTest(LocalDate dataTest) {
		this.dataTest = dataTest;
	}

	@Override
	public String toString() {
		return "Test [idTest=" + idTest + ", titoloTest=" + titoloTest + ", dataTest=" + dataTest + "]";
	}
}
