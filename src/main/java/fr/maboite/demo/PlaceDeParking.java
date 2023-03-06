package fr.maboite.demo;

public class PlaceDeParking {

	private Voiture voitureSurLaPlace;
	
	public void jarrive(Voiture voiture) {
		voitureSurLaPlace = voiture;
	}
	
	public void jepars() {
		voitureSurLaPlace = null;
	}
	
}
