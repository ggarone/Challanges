package view;

import dal.SpettacoloDAO;
import dal.UtenteDAO;

public class SpettacoloDEMO {

	public static void main(String[] args) {
		SpettacoloDAO ctrl = new SpettacoloDAO();
		UtenteDAO controller = new UtenteDAO();
		
		System.out.println(ctrl.getSpettacoli());
		
		System.out.println(controller.getUtenti());

	}

}
