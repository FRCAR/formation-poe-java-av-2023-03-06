package fr.maboite.logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Exemple de logger
 */
public class LoggerExample {

    private static final Logger LOGGER = LoggerFactory.getLogger(LoggerExample.class);
	
    public static void main(String[] args) {
    	LOGGER.info("Démarrage du main");
    	Looper looper = new Looper();
    	LOGGER.info("La somme vaut : {}", looper.loop(10));
    	LOGGER.info("Fin du main");
    	System.exit(0);
    }
	
}
