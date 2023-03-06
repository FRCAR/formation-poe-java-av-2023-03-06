package fr.maboite;

import org.locationtech.jts.geom.Coordinate;
import org.locationtech.jts.geom.Triangle;

/**
 * Calcule des trucs ...
 *
 */
public class Calculator {
	public double calculePlusGrandeLongueur(int x1, int y1, int x2, int y2, int x3, int y3) {
		int i = 3;
		Triangle t = new Triangle(new Coordinate(x1, y1), new Coordinate(x2, y2), new Coordinate(x3, y3));
		return t.longestSideLength();
	}

	/**
	 * Affiche la parité des couples (i,j), pour i et j variant de 0 à 9.
	 */
	public void affichePairsEtImpairs() {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (i % 2 == 0) {
					if (j % 2 == 0) {
						System.out.println("i et j sont pairs");
					} else {
						System.out.println("i est pair et j est impair");
					}
				} else {
					if (j % 2 == 0) {
						System.out.println("i est impair et j est pair");
					} else {
						System.out.println("i et j sont impairs");
					}
				}

			}
		}
	}
}
