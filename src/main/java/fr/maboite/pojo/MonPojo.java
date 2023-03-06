package fr.maboite.pojo;

/**
 * Plain Old Java Object : 
 * objet qui contient des attributs
 * et les getters et setters associés.
 */
public class MonPojo {
	
	private Integer id;
	private String nom;
	private String prenom;
	
	public Integer getId() {
		return id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public void setId(Integer id) {
		this.id = id;
	}

}