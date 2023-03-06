package fr.maboite.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class EntreeSortie {

	public static void main(String[] args) {
		Path entree = Paths.get("src/main/resources/entree-sortie/", "entree.txt");
		Path sortie = Paths.get("src/main/resources/entree-sortie/", "sortie.txt");
		try (BufferedReader reader = Files.newBufferedReader(entree, StandardCharsets.UTF_8);
				BufferedWriter writer = Files.newBufferedWriter(sortie, StandardCharsets.UTF_8)) {
			String currentLine = null;
			while ((currentLine = reader.readLine()) != null) {
				// Tant qu’une ligne peut être lue , on l’affiche
				writer.write(currentLine + " et c'est bien vrai !\n");
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		}

	}

}
