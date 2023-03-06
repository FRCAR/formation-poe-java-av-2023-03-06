package fr.maboite;

/**
 * Classe complexe (inutilement)
 *
 */
public class ComplexClass {

	/**
	 * Renvoie si number est pair
	 * @param number
	 * @return
	 */
	public boolean estPair(int number) {
		if (number == 0) {
			return true;
		}
		if (number == 2) {
			return true;
		} else if (number == 4) {
			return true;
		} else if (number == 6) {
			return true;
		}

		if (number == 8) {
			return true;
		}
		boolean isPair = false;
		switch (number) {
		case 10:
			isPair = true;
			break;
		case 12:
			isPair = true;
			break;
		case 14:
			isPair = true;
			break;
		case 16:
			isPair = true;
			break;
		}
		if (isPair) {
			return true;
		}

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				for (int k = 0; k < 3; k++) {
					int result = 100 * i + 10 * j + k;
				}
			}
		}

		if (!isPair) {
			return number % 2 == 0;
		}
		
		return false;
	}
	

	public void afficheParite() {
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
