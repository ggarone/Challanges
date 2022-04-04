package com.garone.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
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

@Entity
@Table(name = "viaggi")
public class Viaggio {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nome;
	private String descrizione;
	private String destinazione;
	private int durata;
	private double prezzo;
	
	@Transient
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
	
	@Transient
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(
			name = "prenotazioni", 
			joinColumns = {
					@JoinColumn(name = "viaggi_id", referencedColumnName = "id", nullable = false, updatable = false)
			},
			inverseJoinColumns = {
					@JoinColumn(name = "clienti_id", referencedColumnName = "id", nullable = false, updatable = false)
			}
	)
	private Set<Cliente> clienti = new HashSet<Cliente>();

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

	public int getDurata() {
		return durata;
	}

	public void setDurata(int durata) {
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

	@Override
	public String toString() {
		return "Viaggio [id=" + id + ", nome=" + nome + ", descrizione=" + descrizione + ", destinazione="
				+ destinazione + ", durata=" + durata + ", prezzo=" + prezzo + ", documenti=" + documenti + "]";
	}
}
