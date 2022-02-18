package dal;

import java.util.Map;

import model.Spettacolo;
import model.Utente;

public interface IUtenteDAO {
//	Map<Integer,Utente> utenti;
	void addUtente(String nome, String cognome, String password);
	Utente getUtenteById(int id);
	void updateUtente(Utente utente);
	void deleteUtente(int id);
	Utente getUtenteByNome(String nome);
	void addCommento(Spettacolo s, Utente u,String commento);
	void addValutazione(Spettacolo s, Utente u,int valutazione);
	
}
