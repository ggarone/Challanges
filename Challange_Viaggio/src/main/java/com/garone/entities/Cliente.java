package com.garone.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "clienti")
public class Cliente implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nome;
	private String cognome;
	private String email;
	private String cardType;
	private String cardNumber;
	
	@JsonIgnore
	@ManyToMany(fetch = FetchType.LAZY,mappedBy = "clienti")
	private Set<Viaggio> viaggi = new HashSet<Viaggio>();
	
	public Set<Viaggio> getViaggi() {
		return viaggi;
	}
	public void setViaggi(Set<Viaggio> viaggi) {
		this.viaggi = viaggi;
	}
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
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCardType() {
		return cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	@Override
	public String toString() {
		return "Clienti [id=" + id + ", nome=" + nome + ", cognome=" + cognome + ", email=" + email + ", cardType="
				+ cardType + ", cardNumber=" + cardNumber + "]";
	}
}
