package view;

import java.util.Scanner;

import controller.ZainoCtrl;

public class ZainoDemo {

	public static void main(String[] args) {
		int key = -1;
		
		String itemName;
		double weight;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("[+]Creating new Bag...");
		ZainoCtrl zaino = new ZainoCtrl();
				
		while(key != 0) {
			printUserInputMenu();
			key = sc.nextInt();
			
			switch (key) {
			case 0: 
				System.out.println("Bye");
				break;
			
			case 1: 
				System.out.print("Input item name: \n>>");
				itemName = sc.next();
				System.out.print("Input item weight: \n>>");
				weight = sc.nextDouble();
				System.out.print("Input item position: \n>>");
				int position = sc.nextInt();
				zaino.addObject(itemName, weight, position);
				break;
			case 2:
				System.out.println("Current total weight is: " + zaino.getZaino().getTotalWeight());
				break;
			
			case 3:
				System.out.print("Input item name: \n>>");
				itemName = sc.next();
				weight = zaino.getWeightFromObjectName(itemName);
				if(weight != 0)
					System.out.println("Weight of " + itemName + "=" + weight);
				else
					System.out.println("Item not found in the bag");
				break;
			
			case 4:
				System.out.println(zaino.toString());
				break;
			
			
			default:
				System.out.println("Not valid input");
				break;
			}
			
		}
		sc.close();
	}

	private static void printUserInputMenu() {
		System.out.print("1)Add new item\n2)Check bag weight\n3)Get Weight from item name\n4)Print all item in the bag\n0)Exit\n>>");
		
	}

}
