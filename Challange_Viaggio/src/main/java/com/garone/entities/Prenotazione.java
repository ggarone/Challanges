package com.garone.entities;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.stereotype.Component;

@XmlRootElement
public class Prenotazione implements Serializable {
	private Viaggio viaggio;
	private Cliente cliente;
	
	public Viaggio getViaggio() {
		return viaggio;
	}
	public void setViaggio(Viaggio viaggio) {
		this.viaggio = viaggio;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	@Override
	public String toString() {
		return "Prenotazione [viaggio=" + viaggio + ", cliente=" + cliente + "]";
	}
	
	

}
