package fr.maboite;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Horoscope {

	private String[] sentencePart1 = { "Vous allez ", "Il faudra ", "Ne tentez pas de " };
	private String[] sentencePart2 = { " manger ", " réveiller ", " saluer " };
	private String[] sentencePart3 = { " un oeuf au plat.", " un gladiateur.", " une chaise de bureau" };

	private Map<LocalDate, String> horoscopes = new HashMap<>();

	public void generateHoroscope(LocalDate day) {
		cleanHoroscope();
		this.horoscopes.put(day, generateSentence());
	}

	private String generateSentence() {
		String sentence1 = this.sentencePart1[(int) (Math.random() * 3)];
		String sentence2 = this.sentencePart2[(int) (Math.random() * 3)];
		String sentence3 = this.sentencePart3[(int) (Math.random() * 3)];
		return sentence1 + sentence2 + sentence3;
	}

	public void cleanHoroscope() {
		if (this.horoscopes.size() == 7) {
			// this.horoscopes.clear();
			for (String sentenceString : this.horoscopes.values()) {
				sentenceString = null;
			}
		}
	}

	public static void main(String[] args) {
		System.out.println("Appuyer sur une touche pour démarrer la génération");
		try (Scanner scanner = new Scanner(System.in)) {
			scanner.nextLine();
			LocalDate date = LocalDate.now();
			Horoscope horoscope = new Horoscope();
			while (true) {
				horoscope.generateHoroscope(date);
				date = date.plusDays(1);
			}
		}
	}

}
