package com.espo.popolazione.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "popolazione_italiana_eta")
public class Eta {

	@Id
	private int eta;
	
	private int maschi;
	private int femmine;
	private int totale;
	public int getEta() {
		return eta;
	}
	public void setEta(int eta) {
		this.eta = eta;
	}
	public int getMaschi() {
		return maschi;
	}
	public void setMaschi(int maschi) {
		this.maschi = maschi;
	}
	public int getFemmine() {
		return femmine;
	}
	public void setFemmine(int femmine) {
		this.femmine = femmine;
	}
	public int getTotale() {
		return totale;
	}
	public void setTotale(int totale) {
		this.totale = totale;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Eta [eta=");
		builder.append(eta);
		builder.append(", maschi=");
		builder.append(maschi);
		builder.append(", femmine=");
		builder.append(femmine);
		builder.append(", totale=");
		builder.append(totale);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
}
