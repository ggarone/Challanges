package com.garone.entities;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "user_serie")
public class Acquisto implements Serializable {
	@EmbeddedId
	private UserSerie id;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@MapsId("idUser")
	@JoinColumn(name = "user_id")
	private User user;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@MapsId("idSerie")
	@JoinColumn(name = "serietv_id")
	private SerieTV serieTV;
	
	private LocalDate data;
	
	public Acquisto() {
		// TODO Auto-generated constructor stub
	}
	
	public Acquisto(User user, SerieTV serieTV, LocalDate data) {
		super();
		this.id = id;
		this.user = user;
		this.serieTV = serieTV;
		this.data = data;
	}
	
	public UserSerie getId() {
		return id;
	}

	public void setId(UserSerie id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public SerieTV getSerieTV() {
		return serieTV;
	}
	public void setSerieTV(SerieTV serieTV) {
		this.serieTV = serieTV;
	}
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Acquisto [id=" + id + ", user=" + user + ", serieTV=" + serieTV + ", data=" + data + "]";
	}
}
