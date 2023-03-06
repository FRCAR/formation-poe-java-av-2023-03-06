package fr.maboite.demo;

/**
 * Attention, il ne faut instancier qu'une fois cette classe !!!
 */
public class ReparateurOrdiDeDorian {
	
	private static ReparateurOrdiDeDorian monInstance;
	
	private static void initialiseMonInstanceUnique() {
		//....
	}
	
	public static ReparateurOrdiDeDorian getMonInstance() {
		initialiseMonInstanceUnique();
		return monInstance;
	}
	
	public void repareDisqueDur() {
		// ici, on répare...
		//télécharge des pilotes ...
		//défragmente le disque dur SSD ...
		
		
		
	}

}
