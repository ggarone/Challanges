package model;

import java.util.Iterator;

public class Sala extends Multisala{
	private final int CENTO = 100;
	
	Spettacolo spettacolo;
	boolean[] posti;
	
	public Sala() {
		super();
		this.posti = new boolean[CENTO];
	}

	public boolean[] getPosti() {
		return posti;
	}

	public void setPosti(boolean[] posti) {
		this.posti = posti;
	}
	
	public int computePostiLiberi() {
		int postiLiberi = 0;
		for (boolean b : posti) {
			if(b == false)
				postiLiberi++;
		}
		return postiLiberi;
	}
	
	public boolean prenotaBiglietti(int numeroPostiDaOccupare) {
		if(numeroPostiDaOccupare > 5)
			return false;
		
		for (boolean b : posti) {
			if(numeroPostiDaOccupare == 0)
				break;
			if(b == false) {
				numeroPostiDaOccupare--;
				b = true;
			}
		}
		return true;
	}
	
	public boolean prenotaBiglietti(int numeroPostiDaOccupare, int numeroPosto) {
		if(numeroPostiDaOccupare > 5)
			return false;
		
		if(posti[numeroPosto] == false) {
			posti[numeroPosto] = true;
			return true;
		}
		
		return false;
	}


	

	
	
	
}
