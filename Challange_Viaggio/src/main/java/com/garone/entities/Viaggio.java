package com.garone.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "viaggi")
public class Viaggio implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nome;
	@Column(length = 8000)
	private String descrizione;
	private String destinazione;
	private String durata;
	private double prezzo;
	
//	@Transient
	@JsonIgnore
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(
			name = "rel_viaggi_documenti", 
			joinColumns = {
					@JoinColumn(name = "viaggi_id", referencedColumnName = "id", nullable = false, updatable = false)
			},
			inverseJoinColumns = {
					@JoinColumn(name = "doc_id", referencedColumnName = "id", nullable = false, updatable = false)
			}
	)
	private Set<Documento> documenti = new HashSet<>();
	
//	@Transient
	@JsonIgnore
	@ManyToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JoinTable(
			name = "prenotazioni", 
			joinColumns = {
					@JoinColumn(name = "viaggi_id", referencedColumnName = "id", nullable = false, updatable = false)
			},
			inverseJoinColumns = {
					@JoinColumn(name = "clienti_id", referencedColumnName = "id", nullable = false, updatable = false)
			}
	)
	private Set<Cliente> clienti = new HashSet<>();
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public String getDestinazione() {
		return destinazione;
	}

	public void setDestinazione(String destinazione) {
		this.destinazione = destinazione;
	}

	public String getDurata() {
		return durata;
	}

	public void setDurata(String durata) {
		this.durata = durata;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	public Set<Documento> getDocumenti() {
		return documenti;
	}

	
	public void setDocumenti(Set<Documento> documenti) {
		this.documenti = documenti;
	}
	
	
	public Set<Cliente> getClienti() {
		return clienti;
	}

	public void setClienti(Set<Cliente> clienti) {
		this.clienti = clienti;
	}

	@Override
	public String toString() {
		return "Viaggio [id=" + id + ", nome=" + nome + ", descrizione=" + descrizione + ", destinazione="
				+ destinazione + ", durata=" + durata + ", prezzo=" + prezzo + ", documenti=" + documenti + "]";
	}
}
