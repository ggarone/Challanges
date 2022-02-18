package dal;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.Spettacolo;
import model.Utente;

public class UtenteDAO implements IUtenteDAO {
	
	Map<Integer,Utente> utenti;
	private List<String> commenti;
	private List<Integer> valutazioni;
	
	public UtenteDAO() {
		super();
		this.utenti = new HashMap<>();
		riempiMappa();
	}
	
	public void riempiMappa(){
		for (Utente utente : DB.getUtenti()) {
			this.utenti.put(utente.getId(), utente);
		}
	}
	
	public Map<Integer,Utente> getUtenti(){
		return this.utenti;
	}

	@Override
	public void addUtente(String nome, String cognome, String password) {
		Utente u = new Utente(nome, cognome, password);
		this.utenti.put(u.getId(), u);

	}

	@Override
	public Utente getUtenteById(int id) {
		return this.utenti.get(id);
	}

	@Override
	public void updateUtente(Utente utente) {
		Utente s = this.utenti.get(utente.getId());
		this.utenti.put(utente.getId(), s);

	}

	@Override
	public void deleteUtente(int id) {
		this.utenti.remove(id);

	}

	@Override
	public Utente getUtenteByNome(String nome) {
		for (Utente utente : utenti.values()) {
			if(utente.getNome().equals(nome)) {
				return utente;
			}
		}
		return null;
	}
	
	public void updateBiglietto(LocalDate nuovaData,int posizionePosto, Spettacolo sPrecente, Spettacolo sNuovo) {
		for (Spettacolo spettacolo : DB.getSpettacoli()) {
			if(spettacolo.getId() == sPrecente.getId()) {
				spettacolo.getSala().getPosti()[posizionePosto] = false;
			}
		}
		
		sNuovo.prenotaBigliettiAssegnati(1, posizionePosto);
	}

	@Override
	public void addCommento(Spettacolo s, Utente u,String commento) {
		

	}

	@Override
	public void addValutazione(Spettacolo s, Utente u,int valutazione) {
		// TODO Auto-generated method stub

	}

}
