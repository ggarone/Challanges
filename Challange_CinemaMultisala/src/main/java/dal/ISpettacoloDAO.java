package dal;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

import model.Sala;
import model.Spettacolo;

public interface ISpettacoloDAO {
	Map<Integer,Spettacolo> getSpettacoli();
	void addSpettacolo(LocalDate data, String nome, String trailer, String descrizione, Sala sala);
	Spettacolo getSpettacoloById(int id);
	void updateSpettacolo(Spettacolo spettacolo);
	void deleteSpettacolo(int id);
	Spettacolo getSpettacoloByNome(String nome);
	List<Spettacolo> getSpettacoliByData(LocalDate data);
	void addCommento(String commento);
	void addValutazione(int valutazione);

}
