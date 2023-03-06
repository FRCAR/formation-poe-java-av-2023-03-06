package fr.maboite;

import java.util.List;
import java.util.Objects;
import java.util.Random;

/**
 * Bean créé pour énerver Sonar :D
 *
 */
public class MonBean {
	
	public static final float basPrix = 0.5f;
	public static final int PRIX_MIN = 0;
	public static final int PRIX_MAX = 30;

	private Long id;
	public String nom;
	private Integer prix;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		MonBean other = (MonBean) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		System.out.println("Clone en cours ... ");
		return super.clone();
	}

	public void soustrairePrix(int val) {
		this.prix = -val;
	}

	public void agir(MonEnum monEnum) {
		switch (monEnum) {
		case VALEUR_A:
			System.out.println("Valeur A");
			VALEUR_B: System.out.println("Valeur B");
			break;
		default:
			System.out.println("Defaut");
			break;
		case VALEUR_C:
			System.out.println("Valeur C");
		}
	}

	public String getNomAvecPrix() {
		String nouvelleChaine = this.nom;
		nouvelleChaine += this.nom + "-";
		nouvelleChaine += this.prix;
		nouvelleChaine += " ";
		nouvelleChaine += "€";
		return nouvelleChaine;
	}

	public void fusionne(MonBean autre) {
		if (autre != null) {
			if (autre.id != null) {
				this.prix += autre.prix;
				this.nom += autre.nom;
			}
		}

	}
	
	public void changePrixAleatoire() {
		Random random = new Random();
		this.prix = random.nextInt();
	}
	
	public static void afficheListe(List<MonBean> list) {
		if(list == null) {
			new IllegalArgumentException();
		}
		if(list != null) {
			if(list.size() > 0) {
				for(MonBean monBean : list) {
					System.out.println(monBean.getNomAvecPrix());
				}
			}
		}
		
	}
	
	public boolean estABasPrix() {
		return this.prix == basPrix;
	}
	
	public void bornePrix() {
		this.prix = Math.min(this.prix, PRIX_MIN);
		this.prix = Math.max(this.prix, PRIX_MAX);
	}
	
	public int longueurNom() {
		return this.nom.length();
	}

}
