package com.garone.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "serie_tv")
public class SerieTV {
	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String titolo;
	private String genere;
	private double rating;
	private String summary;
	private String img;
	
	public SerieTV() {
		// TODO Auto-generated constructor stub
	}
	
	public SerieTV(int id, String titolo, String genere, double rating, String summary, String img) {
		super();
		this.id = id;
		this.titolo = titolo;
		this.genere = genere;
		this.rating = rating;
		this.summary = summary;
		this.img = img;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public String getGenere() {
		return genere;
	}
	public void setGenere(String genere) {
		this.genere = genere;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	
//	public User getUser() {
//		return user;
//	}
//	public void setUser(User user) {
//		this.user = user;
//	}
	@Override
	public String toString() {
		return "SerieTV [id=" + id + ", titolo=" + titolo + ", genere=" + genere + ", rating=" + rating + ", summary="
				+ summary + ", img=" + img + "]";
	}
}
