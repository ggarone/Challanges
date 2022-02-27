package dal;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

import model.Acquisto;
import model.Cliente;
import model.Prodotto;

public interface NegozioDAO {
	String TAB_CLIENTE = "cliente";
	String TAB_ACQUISTO = "acquisto";
	String TAB_PRODOTTO = "prodotto";
	String ALL_CLIENTE = "select * from " + TAB_CLIENTE + " ";
	String ALL_ACQUISTO = "select * from " + TAB_ACQUISTO + " ";
	String ALL_PRODOTTO = "select * from " + TAB_PRODOTTO + " ";
	String ONE_CLIENTE =  "select * from " + TAB_CLIENTE  + " WHERE id= ";
	String ONE_ACQUISTO = "select * from " + TAB_ACQUISTO + " WHERE id= ";
	String ONE_PRODOTTO = "select * from " + TAB_PRODOTTO + " WHERE id= ";
	String INSERT_CLIENTE = "insert into " + TAB_CLIENTE + " (nome,indirizzo) values(?,?)";
	String INSERT_ACQUISTO = "insert into " + TAB_ACQUISTO + " (clienteID,prodottoID,data) values(?,?,?)";
	String INSERT_PRODOTTO = "insert into " + TAB_PRODOTTO + " (nome,prezzo) values(?,?)";
	
	void addCliente(Cliente c) throws SQLException;
	void addAcquisto(Acquisto a) throws SQLException;
	void addProdotto(Prodotto p) throws SQLException;
	
	List<Cliente> getClienti() throws SQLException;
	List<Acquisto> getAcquisti() throws SQLException;
	List<Prodotto> getProdotti() throws SQLException;
}
