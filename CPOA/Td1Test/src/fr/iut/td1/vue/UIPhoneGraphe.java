package fr.iut.td1.vue;

import fr.iut.td1.interfaces.IObserver;
import fr.iut.td1.miscs.Observable;

public class UIPhoneGraphe implements IObserver {

<<<<<<< HEAD

=======
	private int num;
	
>>>>>>> branch 'master' of https://github.com/TheoRousseau25/CPOA_Rousseau_Theo.git

	public int getNum() {
		return num;
	}
	

	public UIPhoneGraphe(int num) {
		System.out.println("Je suis un �cran de type IPhone");
		this.num = num;
	}

	@Override
	public void update(Observable obj) {
		System.out.println("dans methode update de IPhone N� " + num1);
	}
}
