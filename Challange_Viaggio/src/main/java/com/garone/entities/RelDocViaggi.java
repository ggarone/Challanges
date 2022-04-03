package com.garone.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "reldocviaggi")
public class RelDocViaggi {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne
	@JoinColumn(name = "viaggi_id")
	private Viaggio viaggi;
	
	@ManyToOne
	@JoinColumn(name = "doc_id")
	private Documento documenti;
	
	private String tipo;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Viaggio getViaggi() {
		return viaggi;
	}

	public void setViaggi(Viaggio viaggi) {
		this.viaggi = viaggi;
	}

	public Documento getDocumenti() {
		return documenti;
	}

	public void setDocumenti(Documento documenti) {
		this.documenti = documenti;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "RelDocViaggi [id=" + id + ", viaggi=" + viaggi + ", documenti=" + documenti + ", tipo=" + tipo + "]";
	}
}
