package fr.maboite.correction.tp.servlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mysql.cj.jdbc.Driver;

public class ArticleDao {

	/** Création d'un nouvel attribut statique qui nous sert à logger */
	private static final Logger LOGGER = LoggerFactory.getLogger(ArticleDao.class);

	public List<Article> getAllArticles() {
		LOGGER.info("Appel de getAllArticles.");

		List<Article> articles = new ArrayList<>();
		Properties connectionProps = new Properties();
		connectionProps.put("user", "admin");
		connectionProps.put("password", "admin");

		try {
			DriverManager.registerDriver(new Driver());
		} catch (SQLException e) {
			LOGGER.error("Erreur lors de l'enregistrement du driver.", e);
			// Ici, il faudrait lancer une nouvelle Exception avec
			//throw new RuntimeException(e);
		}

		try (Connection connection = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/formation",
				connectionProps); Statement stmt = connection.createStatement()) {

			LOGGER.info("Exécution de la requête select");
			ResultSet rs = stmt.executeQuery("SELECT * FROM ARTICLE");
			while (rs.next()) {
				LOGGER.debug("Un article a été trouvé en base");
				Article article = new Article();
				article.setId(rs.getInt("ID"));
				article.setNom(rs.getString("NOM"));
				article.setCategorie(rs.getString("CATEGORIE"));
				articles.add(article);
			}
		} catch (Exception e) {
			LOGGER.error("Erreur lors de l'enregistrement du driver.", e);
		}
		return articles;
	}

	public List<Article> getArticlesBouchon() {
		List<Article> articles = new ArrayList<>();
		Article article1 = new Article();
		article1.setId(1);
		article1.setNom("Bague");
		article1.setCategorie("Objet de luxe");
		Article article2 = new Article();
		article2.setId(2);
		article2.setNom("Bouteille");
		article2.setCategorie("Boisson");
		Article article3 = new Article();
		article3.setId(3);
		article3.setNom("Motoculteur");
		article3.setCategorie("Objet de luxe");

		articles.add(article1);
		articles.add(article2);
		articles.add(article3);

		return articles;
	}

}
