package com.garone.gestionaleDB.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class DomandaTestId implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = "id_test")
    private int idTest;

    @Column(name = "id_domanda")
    private int idDomanda;

	public int getIdTest() {
		return idTest;
	}

	public void setIdTest(int idTest) {
		this.idTest = idTest;
	}

	public int getIdDomanda() {
		return idDomanda;
	}

	public void setIdDomanda(int idDomanda) {
		this.idDomanda = idDomanda;
	}

	@Override
	public String toString() {
		return "DomandaTestId [idTest=" + idTest + ", idDomanda=" + idDomanda + "]";
	}
}