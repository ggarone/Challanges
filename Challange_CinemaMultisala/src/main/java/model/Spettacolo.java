package model;

import java.time.LocalDate;
import java.util.List;

public class Spettacolo {
	private static final int CENTO = 100;
	private static int counter = 0;
	private static int posti = CENTO;
	
	private int id;
	private Sala sala;
	private LocalDate data;
	private String nome;
	private String trailer;
	private String descrizione;
//	private List<String> commenti;
//	private List<Integer> valutazione;
	
	public Spettacolo(LocalDate data, String nome, String trailer, String descrizione, Sala sala) {
		super();
		this.data = data;
		this.nome = nome;
		this.trailer = trailer;
		this.descrizione = descrizione;
		this.sala = sala;
		this.id = counter++;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}
	
	public Sala getSala() {
		return sala;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTrailer() {
		return trailer;
	}

	public void setTrailer(String trailer) {
		this.trailer = trailer;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}


	public int getId() {
		return id;
	}
	
	public boolean prenotaBiglietti(int numeroPosti) {
		if(sala.computePostiLiberi() >= numeroPosti && numeroPosti <= 5) {
			boolean prenotaBiglietti = sala.prenotaBiglietti(numeroPosti);
			return prenotaBiglietti;
		}
		return false;
	}
	
	public void prenotaBigliettiAssegnati(int numeroPostiDaOccupare, int ...numeroPosto) {
		for (int i = 0; i < numeroPostiDaOccupare; i++) {
			boolean prenotazione = sala.prenotaBiglietti(numeroPostiDaOccupare, numeroPosto[i]);
		}
	}

	@Override
	public String toString() {
		return "Spettacolo [data=" + data + ", nome=" + nome + ", trailer=" + trailer + ", descrizione=" + descrizione
				+ "]";
	}
}
