package fr.maboite.demo;

public class Voiture {

	private static int compteurVoitures;
	private float niveauEssence;
	private String nom;
	
	/**
	 * Remplit le réservoir ...
	 * @param montantAjoute
	 */
	public void remplirReservoir(float montantAjoute) {
		
		//Plein de vérifications sur le montantAjoute
		
		//montantAjoute + niveauEssence > capaciteTotale ?
		
		//....
		
		
		niveauEssence = 12;
		
		
	}
	
	public static int getCompteur() {
		return compteurVoitures;
	}
	
	public String getNom() {
		return "je suis une voiture";
	}
	
}
