package model;

public class Utente {
	private static int counter = 0;
	
	private String nome;
	private String cognome;
	private String password;
	int id;
	
	public Utente(String nome, String cognome, String password) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.password = password;
		this.id = counter++;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Utente [nome=" + nome + ", cognome=" + cognome + ", password=" + password + ", id=" + id + "]";
	}
}
