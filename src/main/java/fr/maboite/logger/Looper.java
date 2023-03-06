package fr.maboite.logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Autre classe d'exemple pour le logger
 */
public class Looper {

    private static final Logger LOGGER = LoggerFactory.getLogger(Looper.class);
	
    public int loop(int loops) {
    	LOGGER.debug("La boucle démarre");
    	int somme = 0;
    	for(int i = 1; i <= loops; i++) {
    		LOGGER.trace("i vaut : {}", i);
    		somme += i;
    	}
    	LOGGER.debug("La somme vaut : {}", somme);
    	return somme;
    }
	
}
