package view;

import java.sql.SQLException;
import java.time.LocalDate;

import dal.NegozioDAO;
import dal.NegozioDAOImpl;
import model.Acquisto;
import model.Cliente;
import model.Prodotto;

public class NegozioDemo {
	public static void main(String[] args) throws SQLException {
		NegozioDAO controller = new NegozioDAOImpl();
		
		Cliente c1 = new Cliente(3, "Bart", "via torino,26");
		Cliente c2 = new Cliente(1, "Homer", "via milano,13");
		Cliente c3 = new Cliente(2, "Lisa", "via roma,55");
		
		Prodotto p1 = new Prodotto(3, "aspiravolvere",66.55);
		Prodotto p2 = new Prodotto(1, "lavastoviglie",278.34);
		Prodotto p3 = new Prodotto(2, "forno",135.66);
		
		controller.addCliente(c1);
		controller.addCliente(c2);
		controller.addCliente(c3);
		
		controller.addProdotto(p1);
		controller.addProdotto(p2);
		controller.addProdotto(p3);
		
		controller.addAcquisto(new Acquisto(0,c1,p2,LocalDate.parse("2022-02-14")));
		controller.addAcquisto(new Acquisto(1,c3,p1,LocalDate.parse("2022-02-12")));
		controller.addAcquisto(new Acquisto(2,c2,p2,LocalDate.parse("2022-02-05")));
		
	}
}
