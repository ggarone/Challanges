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
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@OneToOne
	@JoinColumn(name="idTest")
	Test test;
	
	@OneToOne
	@JoinColumn(name="idPersona")
	private Persona persona;
	private int punteggioTotale;
	
	public Persona() {
		// TODO Auto-generated constructor stub
	}
	
	public Persona(int id, Test test, Persona persona, int punteggioTotale) {
		super();
		this.id = id;
		this.test = test;
		this.persona = persona;
		this.punteggioTotale = punteggioTotale;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public Test getTest() {
		return test;
	}
	
	public void setTest(Test test) {
		this.test = test;
	}
	
	public Persona getPersona() {
		return persona;
	}
	
	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	
	public int getPunteggioTotale() {
		return punteggioTotale;
	}
	
	public void setPunteggioTotale(int punteggioTotale) {
		this.punteggioTotale = punteggioTotale;
	}

	@Override
	public String toString() {
		return "Persona [id=" + id + ", test=" + test + ", persona=" + persona + ", punteggioTotale=" + punteggioTotale
				+ "]";
	}
}
