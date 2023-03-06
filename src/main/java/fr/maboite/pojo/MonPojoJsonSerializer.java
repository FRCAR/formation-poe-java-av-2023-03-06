package fr.maboite.pojo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Serialise (transforme en chaîne de caractères) une
 * instance de MonPojo, grâce à JSON
 */
public class MonPojoJsonSerializer {

	public static void main(String[] args) throws JsonProcessingException {
		
		MonPojo myPojo = new MonPojo();
		myPojo.setId(4);
		myPojo.setNom("Jean");
		myPojo.setPrenom("Durand");
		
		//Initialisation de Jackson
		ObjectMapper mapper = new ObjectMapper();
		//Utilisation de Jackson pour sérialiser l'objet
		String jsonString = mapper.writeValueAsString(myPojo);
		System.out.println(jsonString);
	}

}