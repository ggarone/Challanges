package com.garone.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "documenti")
public class Documento {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@ManyToOne
	@JoinColumn(name = "viaggi_id")
	private Viaggio viaggi;
	
	private String path;
	private String descrizione;
	
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
	
	public String getPath() {
		return path;
	}
	
	public void setPath(String path) {
		this.path = path;
	}
	
	public String getDescrizione() {
		return descrizione;
	}
	
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	
	@Override
	public String toString() {
		return "Documenti [id=" + id + ", viaggi=" + viaggi + ", path=" + path + ", descrizione=" + descrizione + "]";
	}
}
