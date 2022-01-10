package controller;

import model.Oggetto;
import model.Zaino;

public class ZainoCtrl {
	final int DIM = 10;

	Zaino zaino = new Zaino();
	
	public void addObject(String name, double weight, int position) {
		if(!isWeightHigherThanRestriction(zaino.getTotalWeight()+weight)) {
			Oggetto object = new Oggetto(name, weight);
			zaino.addObject(object, position);
			System.out.println(object);
		}
	}
	
	private boolean isWeightHigherThanRestriction(double totalWeight) {
		if(totalWeight >= 10) {
			System.out.println("Weight is higher than 10kg, can't add this item");
			return true;
		}
		else
			return false;
	}
	
	public double getWeightFromObjectName(String name) {
		double weight = 0;
		for(Oggetto object: zaino.getObjects()) {
			if(object != null) {
				if(object.getName().equals(name)) {
					weight = object.getWeight();
				}
			}
		}
		return weight;
	}
	
	public Zaino getZaino() {
		return zaino;
	}

	@Override
	public String toString() {
		String out="";
		for(Oggetto object: zaino.getObjects()) {
			if(object != null)
				out += object.toString() + "\n";
		}
		out += "\ntotalWeight" + "=" + zaino.getTotalWeight();
		return out;
	}
	
	
}


