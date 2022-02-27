package controller;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import dal.NegozioDAO;
import dal.NegozioDAOImpl;
import model.Acquisto;

import model.Cliente;
import model.Prodotto;

public class Negozio {
	private NegozioDAO repo;

	public Negozio() {
		this.repo = new NegozioDAOImpl();
	}
	
//	Acquisto getAcquistoFromCliente(Cliente c) throws SQLException {
//		for (Acquisto a : repo.getAcquisti()) {
//			for(Acquisto aOfc : c.getAcquisti()) {
//				if(a.equals(c)) {
//					return a;
//				}
//			}
//		}
//		return null;
//	}
	
	List<Acquisto> getAcquistiFromCliente(Cliente c) throws SQLException {
		List<Acquisto> acquisti = repo.getAcquisti().stream()
				.filter(a -> a.getCliente().getId() == c.getId())
				.collect(Collectors.toList());
		
//		for (Acquisto a : repo.getAcquisti()) {
//			for(Acquisto aOfc : c.getAcquisti()) {
//				if(a.equals(c)) {
//					return a;
//				}
//			}
//		}
		return acquisti;
	}
	
	List<Cliente> getClientiFromDate(LocalDate date) throws SQLException{
		List<Cliente> ClientiFromDateList = new ArrayList<>();
		
//		for (Cliente c : repo.getClienti()) {
//			for (Acquisto a : repo.getAcquisti()) {
//				if(a.getData().equals(date) && c.equals(a.getCliente())) {
//					ClientiFromDateList.add(c);
//				}
//			}
//		}
		
		for (Cliente c : repo.getClienti()) {
			for (Acquisto a : repo.getAcquisti()) {
				if(a.getData().getMonth().equals(date.getMonth()) && a.getData().getYear() == date.getYear()) {
					ClientiFromDateList.add(c);
				}
			}
		}
		return ClientiFromDateList;

	}
	List<Prodotto> getProdottiFromDate(LocalDate date) throws SQLException{
		List<Prodotto> ProdottiFromDateList = new ArrayList<>();
		
		
		for (Acquisto a : repo.getAcquisti()) {
			if(a.getData().getMonth().equals(date.getMonth()) && a.getData().getYear() == date.getYear()) {
				ProdottiFromDateList.forEach(p -> ProdottiFromDateList.add(p));
			}
		}
		
		return ProdottiFromDateList;

	}
	int getNumeroVendite(Prodotto p) throws SQLException{
		int counter = 0;
		
		for (Prodotto prod : repo.getProdotti()) {
			if(prod.getNome().equals(p.getNome())) {
				counter++;
			}
		}
		return counter;
	}
	
	List<Cliente> getClienti(){
		try {
			return this.repo.getClienti();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	List<Prodotto> getProdotti(){
		try {
			return this.repo.getProdotti();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	List<Acquisto> getAcquisti(){
		try {
			return this.repo.getAcquisti();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public Cliente getClienteById(int clienteID) {
		List<Cliente> clienti = getClienti();
		return clienti.get(clienteID-1);
	}
}
