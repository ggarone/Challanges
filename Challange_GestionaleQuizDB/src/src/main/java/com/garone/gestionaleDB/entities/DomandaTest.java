package com.garone.gestionaleDB.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "domandatest")
public class DomandaTest implements Serializable {
	@EmbeddedId
	private DomandaTestId id;
	
	@ManyToOne
	@MapsId("idTest")
	@JoinColumn(name = "id_test")
	private Test test;
	
	@ManyToOne
	@MapsId("idDomanda")
	@JoinColumn(name = "id_domanda")
	private Domanda domanda;
	
	public DomandaTestId getId() {
		return id;
	}

	public void setId(DomandaTestId id) {
		this.id = id;
	}

	public Test getTest() {
		return test;
	}

	public void setTest(Test test) {
		this.test = test;
	}

	public Domanda getDomanda() {
		return domanda;
	}

	public void setDomanda(Domanda domanda) {
		this.domanda = domanda;
	}

	@Override
	public String toString() {
		return "DomandaTest [id=" + id + "]";
	}
}
