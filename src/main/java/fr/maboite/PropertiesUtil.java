package fr.maboite;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

/**
 * Lit et écrit via Properties.
 */
public class PropertiesUtil{
	
	
	public static void main(String[] args) {
		displayProperties();
		storeProperties();
	}


	/**
	 * Affiche les properties d'un fichier dans la console. Utilise 
	 * les streams pour ce faire.
	 */
	private static void displayProperties() {
		try(FileReader reader = new FileReader("src/conf/config.properties")){
			Properties prop = new Properties();
			prop.load(reader);
			prop.forEach((a,b) -> {System.out.println(a + "-" + b);});
		}catch (IOException io) {
            io.printStackTrace();
        }
	}
	

	/**
	 * Stocke dans un fichier les properties codées
	 */
	private static void storeProperties() {
		try (OutputStream output = new FileOutputStream("src/conf/config-2.properties")) {

            Properties prop = new Properties();

            prop.setProperty("prop.1", "propriete1");
            prop.setProperty("prop.2", "propriete2");
            
            prop.store(output, null);

            System.out.println(prop);

        } catch (IOException io) {
            io.printStackTrace();
        }
	}
	
}