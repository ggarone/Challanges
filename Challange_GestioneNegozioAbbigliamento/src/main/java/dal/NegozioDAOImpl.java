package dal;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import model.Acquisto;
import model.Cliente;
import model.Prodotto;

public class NegozioDAOImpl implements NegozioDAO {
	private Connessione connessione;
	private Connection conn;
	private Statement stat;
	private PreparedStatement ps;
	private ResultSet rs;
	private ResultSet BackupRs;
	
	public NegozioDAOImpl() {
		this.connessione = new Connessione();
		this.conn = connessione.getConn();
	}

//	@Override
//	public Canzone getCanzoneById(int id) throws SQLException {
//		this.stat = this.conn.createStatement();
//		this.rs = this.stat.executeQuery(ONE+id);
//		this.rs.next();
//		Canzone c = new Canzone();
//		c.setId(rs.getInt("id"));
//		c.setTitolo(rs.getString("titolo"));
//		c.setGenere(rs.getString("genere"));
//		c.setAnno(rs.getInt("anno"));
//		c.setCantante(new Cantante(0,rs.getString("cantante")));
//		return c;
//	}

//	@Override
//	public List<Canzone> getCanzoni() throws SQLException {
//		List<Canzone> canzoniTemp = new ArrayList<>();
//		
//		this.stat = this.conn.createStatement();
//		this.rs = this.stat.executeQuery(ALL);
//		
//		while(this.rs.next()) {
//			Canzone c = new Canzone();
//			c.setId(rs.getInt("id"));
//			c.setTitolo(rs.getString("titolo"));
//			c.setGenere(rs.getString("genere"));
//			c.setAnno(rs.getInt("anno"));
//			c.setCantante(new Cantante(0,rs.getString("cantante")));
//			canzoniTemp.add(c);
//		}
//		return canzoniTemp;
//	}

	@Override
	public void addCliente(Cliente c) throws SQLException {
		this.ps = this.conn.prepareStatement(INSERT_CLIENTE);
		this.ps.setString(1, c.getNome());
		this.ps.setString(2, c.getIndirizzo());
		
		if(this.ps.execute()) {
			System.out.println("cliente inserito: " + c);
		}
		
	}

	@Override
	public void addAcquisto(Acquisto a) throws SQLException {
		
		this.ps = this.conn.prepareStatement(INSERT_ACQUISTO);
		this.ps.setInt(1, a.getCliente().getId());
		this.ps.setInt(2, a.getProdotto().getId());
		this.ps.setDate(3, Date.valueOf(a.getData()));
		if(this.ps.execute()) {
			System.out.println("acquisto inserito: " + a);
		}
	}

	@Override
	public void addProdotto(Prodotto p) throws SQLException {
		this.ps = this.conn.prepareStatement(INSERT_PRODOTTO);
		this.ps.setString(1, p.getNome());
		this.ps.setDouble(2, p.getPrezzo());
		
		if(this.ps.execute()) {
			System.out.println("cliente inserito: " + p);
		}
	}

	@Override
	public List<Cliente> getClienti() throws SQLException {
		List<Cliente> clienti = new ArrayList<>();
		
		this.stat = this.conn.createStatement();
		this.rs = this.stat.executeQuery(ALL_CLIENTE);
		
		while(this.rs.next()) {
			Cliente c = new Cliente();
			c.setId(rs.getInt("id"));
			c.setNome(rs.getString("nome"));
			c.setIndirizzo(rs.getString("indirizzo"));
			clienti.add(c);
		}
		return clienti;
	}

	@Override
	public List<Acquisto> getAcquisti() throws SQLException {
		List<Acquisto> acquisti = new ArrayList<>();
		
		this.stat = this.conn.createStatement();
//		this.rs = this.stat.executeQuery(ALL_ACQUISTO);
//		while(this.rs.next()) {
//			int clienteID = rs.getInt("clienteID");
//			int prodottoID = rs.getInt("prodottoID");
//			LocalDate data = rs.getDate("data").toLocalDate();
//			int id = rs.getInt("id");
//			System.out.println("test" + clienteID + prodottoID + " " + data + " " + id);
////			Prodotto p = getProdottoById(prodottoID);
//			Cliente c = getClienteById(clienteID);
////			Prodotto p = new Prodotto();
////			Cliente c = new Cliente();
//			Acquisto a = new Acquisto(id, c, p, data);
//			acquisti.add(a);
//		}
		this.rs = this.stat.executeQuery(ALL_ACQUISTO);
		
		while(this.rs.next()) {
			
			int clienteID = rs.getInt("clienteID");
			int prodottoID = rs.getInt("prodottoID");
			LocalDate data = rs.getDate("data").toLocalDate();
			Acquisto a = new Acquisto();
			a.setId(rs.getInt("id"));
			//getClienteById
			a.setCliente(getClienteById(clienteID));  
			//getProdottoById
			a.setProdotto(getProdottoById(prodottoID));
			a.setData(data);
			acquisti.add(a);
			//DEBUG
//			System.out.println("added " + a.getId());
		}
		
		//DEBUG
//		acquisti.forEach(a -> System.out.println(a));
		
		
		
		return acquisti;
	}

	private Prodotto getProdottoById(int prodottoID) throws SQLException{
		this.stat = this.conn.createStatement();
//		System.out.println(ONE_PRODOTTO+prodottoID);
		this.BackupRs = this.stat.executeQuery(ONE_PRODOTTO+prodottoID);
		this.BackupRs.next();
		Prodotto p = new Prodotto();
		p.setId(BackupRs.getInt("id"));
		p.setNome(BackupRs.getString("nome"));
		p.setPrezzo(BackupRs.getDouble("prezzo"));
		return p;
	}

	private Cliente getClienteById(int clienteID) throws SQLException{
		this.stat = this.conn.createStatement();
		this.BackupRs = this.stat.executeQuery(ONE_CLIENTE+clienteID);
		this.BackupRs.next();
		Cliente c = new Cliente();
		c.setId(BackupRs.getInt("id"));
		c.setNome(BackupRs.getString("nome"));
		c.setIndirizzo(BackupRs.getString("indirizzo"));
		return c;
	}

	@Override
	public List<Prodotto> getProdotti() throws SQLException {
		List<Prodotto> prodotti = new ArrayList<>();
		
		this.stat = this.conn.createStatement();
		this.rs = this.stat.executeQuery(ALL_PRODOTTO);
		
		while(this.rs.next()) {
			Prodotto p = new Prodotto();
			p.setId(rs.getInt("id"));
			p.setNome(rs.getString("nome"));
			p.setPrezzo(rs.getDouble("prezzo"));
			prodotti.add(p);
		}
		return prodotti;
	}
	
	//is this here???
	//populate list of acquisti inside cliente
//	a.getCliente().getAcquisti().add(a);
	
	//populate list of clienti inside prodotto
//	a.getProdotti().forEach(p -> p.getCliente().add(a.getCliente()));

}
