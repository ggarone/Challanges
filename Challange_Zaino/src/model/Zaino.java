package model;

import java.util.Arrays;

public class Zaino {
	final int DIM = 100;
	
	Oggetto[] objects = new Oggetto[DIM];
	double totalWeight = 0;
	
	public Oggetto[] getObjects() {
		return objects;
	}

	public double getTotalWeight() {
		return totalWeight;
	}

	public void setTotalWeight(double totalWeight) {
		this.totalWeight = totalWeight;
		System.out.println("peso modificato " + totalWeight);
	}
	
	public void addObject(Oggetto object, int position) {
		this.objects[position] = object;
		this.totalWeight += object.getWeight();
	}

	@Override
	public String toString() {
		return "Zaino [objects=" + Arrays.toString(objects) + ", totalWeight=" + totalWeight + "]";
	}

	
	
}
