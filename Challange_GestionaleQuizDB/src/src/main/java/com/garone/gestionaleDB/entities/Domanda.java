package com.garone.gestionaleDB.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "domanda")
public class Domanda {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idDomanda;
	private String testoDomanda;
	private String rispostaEsatta;
	private int punteggioDomanda;
	
	public Domanda() {
		// TODO Auto-generated constructor stub
	}

	public Domanda(int idDomanda, String testoDomanda, String rispostaEsatta, int punteggioDomanda) {
		super();
		this.idDomanda = idDomanda;
		this.testoDomanda = testoDomanda;
		this.rispostaEsatta = rispostaEsatta;
		this.punteggioDomanda = punteggioDomanda;
	}

	public int getIdDomanda() {
		return idDomanda;
	}

	public void setIdDomanda(int idDomanda) {
		this.idDomanda = idDomanda;
	}

	public String getTestoDomanda() {
		return testoDomanda;
	}

	public void setTestoDomanda(String testoDomanda) {
		this.testoDomanda = testoDomanda;
	}

	public String getRispostaEsatta() {
		return rispostaEsatta;
	}

	public void setRispostaEsatta(String rispostaEsatta) {
		this.rispostaEsatta = rispostaEsatta;
	}

	public int getPunteggioDomanda() {
		return punteggioDomanda;
	}

	public void setPunteggioDomanda(int punteggioDomanda) {
		this.punteggioDomanda = punteggioDomanda;
	}

	@Override
	public String toString() {
		return "Domanda [idDomanda=" + idDomanda + ", testoDomanda=" + testoDomanda + ", rispostaEsatta="
				+ rispostaEsatta + ", punteggioDomanda=" + punteggioDomanda + "]";
	}
}
