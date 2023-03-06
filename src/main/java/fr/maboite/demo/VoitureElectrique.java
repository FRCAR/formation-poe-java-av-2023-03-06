package fr.maboite.demo;

public class VoitureElectrique extends Voiture{
	
	public void rechargeBatterie() {
	}
	
	public String getNom() {
		return "Je suis une voiture électrique";
	}
	
	public int calcule(int i) {
		return i *2;
	}

	public String calcule(String s) {
		return " 2 * " + s;
	}

}
