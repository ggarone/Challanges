package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Acquisto {
	private int id;
	private LocalDate data;
	private Cliente cliente;
	private Prodotto prodotto;
	
	public Acquisto() {
		// TODO Auto-generated constructor stub
	}

	public Acquisto(int id,Cliente cliente,Prodotto prodotto,LocalDate data) {
		super();
		this.id = id;
		this.data = data;
		this.cliente = cliente;
		this.prodotto = prodotto;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public Prodotto getProdotto() {
		return prodotto;
	}

	public void setProdotto(Prodotto prodotto) {
		this.prodotto = prodotto;
	}

	@Override
	public String toString() {
		return "Acquisto [id=" + id + ", data=" + data + ", cliente=" + cliente + ", prodotto=" + prodotto + "]";
	}
}
