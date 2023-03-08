package fr.maboite.parallel;

public class MonPremierThread extends Thread {
	
	public void run() {
		int i = 0;
		while(true) {
			System.out.println("Dans mon autremon i vaut : " + i);
		}
	}

}
