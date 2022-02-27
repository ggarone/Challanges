package model;

import java.util.List;

public class Prodotto {
	private int id;
	private String nome;
	private double prezzo;
	private List<Cliente> cliente;
	
	public Prodotto() {
		// TODO Auto-generated constructor stub
	}
	
	public Prodotto(int id,String nome,double prezzo) {
		super();
		this.id = id;
		this.prezzo = prezzo;
		this.nome = nome;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public List<Cliente> getCliente() {
		return cliente;
	}

	@Override
	public String toString() {
		return "Prodotto [prezzo=" + prezzo + ", nome=" + nome + "]";
	}
}
