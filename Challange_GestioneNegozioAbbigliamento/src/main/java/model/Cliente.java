package model;

import java.util.List;

public class Cliente {
	private int id;
	private String nome;
	private String indirizzo;
	private List<Acquisto> acquisti;
	
	public Cliente() {
		// TODO Auto-generated constructor stub
	}

	public Cliente(int id, String nome, String indirizzo) {
		super();
		this.id = id;
		this.nome = nome;
		this.indirizzo = indirizzo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public List<Acquisto> getAcquisti() {
		return acquisti;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nome=" + nome + ", indirizzo=" + indirizzo + "]";
	}
}
