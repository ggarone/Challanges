package dal;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import model.Sala;
import model.Spettacolo;

public class SpettacoloDAO implements ISpettacoloDAO {
	
	Map<Integer,Spettacolo> spettacoli;
	private List<String> commenti;
	private List<Integer> valutazioni;
	
	public SpettacoloDAO() {
		super();
		this.spettacoli = new HashMap<>();
		riempiMappa();
	}
	
	public void riempiMappa(){
		for (Spettacolo spettacolo : DB.getSpettacoli()) {
			this.spettacoli.put(spettacolo.getId(), spettacolo);
		}
	}
	
	@Override
	public Map<Integer, Spettacolo> getSpettacoli() {
		return this.spettacoli;
	}

	@Override
	public void addSpettacolo(LocalDate data, String nome, String trailer, String descrizione, Sala sala) {
		Spettacolo s = new Spettacolo(data, nome, trailer, descrizione, sala);
		this.spettacoli.put(s.getId(), s);

	}

	@Override
	public Spettacolo getSpettacoloById(int id) {
		return this.spettacoli.get(id);
	}

	@Override
	public void updateSpettacolo(Spettacolo spettacolo) {
		Spettacolo s = this.spettacoli.get(spettacolo.getId());
		this.spettacoli.put(spettacolo.getId(), s);
	}

	@Override
	public void deleteSpettacolo(int id) {
		this.spettacoli.remove(id);

	}

	@Override
	public Spettacolo getSpettacoloByNome(String nome) {
//		return this.spettacoli.values().stream()
//			.filter(s -> s.getNome().equals(nome))
//			.collect(Collectors.toList());
		for (Spettacolo spettacolo : spettacoli.values()) {
			if(spettacolo.getNome().equals(nome)) {
				return spettacolo;
			}
		}
		return null;
	}

	@Override
	public List<Spettacolo> getSpettacoliByData(LocalDate data) {
		return this.spettacoli.values().stream()
		.filter(s -> s.getData().equals(data))
		.collect(Collectors.toList());
	}
	
	public void prenotaBiglietti(int numeroPostiDaOccupare, Spettacolo s) {
		for (Spettacolo spettacolo : spettacoli.values()) {
			if(spettacolo.getId() == s.getId())
				spettacolo.getSala().prenotaBiglietti(numeroPostiDaOccupare);
		}
	}
	
	public void prenotaBiglietti(int numeroPostiDaOccupare, Spettacolo s,int ...numeroPosto) {
		for (Spettacolo spettacolo : spettacoli.values()) {
			if(spettacolo.getId() == s.getId()) {
				for (int i = 0; i < numeroPostiDaOccupare; i++) {
					spettacolo.getSala().prenotaBiglietti(numeroPostiDaOccupare, numeroPosto[i]);
				}
			}
		}
	}
	
	

	@Override
	public void addCommento(String commento) {
		this.commenti.add(commento);

	}

	@Override
	public void addValutazione(int valutazione) {
		if(valutazione <= 5 && valutazione >= 1)
			this.valutazioni.add(valutazione);
	}


}
