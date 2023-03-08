package fr.maboite.parallel;

public class ThreadMain {

	public static void main(String[] args) {
		MonPremierThread monPremierThread = new MonPremierThread();
		monPremierThread.start();
		System.out.println("Coucou !");
		int i = 0;
		while(true) {
			System.out.println("Dans le main : mon i vaut : " + i);
		}
	}

}
