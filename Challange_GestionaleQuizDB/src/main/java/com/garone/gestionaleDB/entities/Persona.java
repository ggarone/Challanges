package com.garone.gestionaleDB.entities;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "persona")
public class Persona {
	@OneToOne
	@JoinColumn(name="idTest")
	Test test;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idPersona;
	private int PunteggioTotale;
	
	public Persona() {
		// TODO Auto-generated constructor stub
	}

	public Persona(Test test, int idPersona, int punteggioTotale) {
		super();
		this.test = test;
		this.idPersona = idPersona;
		PunteggioTotale = punteggioTotale;
	}

	public Test getTest() {
		return test;
	}

	public void setTest(Test test) {
		this.test = test;
	}

	public int getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}

	public int getPunteggioTotale() {
		return PunteggioTotale;
	}

	public void setPunteggioTotale(int punteggioTotale) {
		PunteggioTotale = punteggioTotale;
	}

	@Override
	public String toString() {
		return "Persona [test=" + test + ", idPersona=" + idPersona + ", PunteggioTotale=" + PunteggioTotale + "]";
	}
}
