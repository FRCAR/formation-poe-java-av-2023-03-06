package fr.maboite.correction.tp.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "Articles", displayName = "La servlet des articles", urlPatterns = "/articles", loadOnStartup = 1)
public class ListeArticlesServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	/** Création d'un nouvel attribut statique qui nous sert à logger */
	private static final Logger LOGGER = LoggerFactory.getLogger(ListeArticlesServlet.class);
	
	private ArticleDao articleDao = new ArticleDao();

	@Override
	public void doGet(HttpServletRequest request,
			HttpServletResponse response)
			throws ServletException, IOException {
		LOGGER.info("Appel de la méthode doGet.");

		// initialisation de la réponse
		response.setContentType("text/html");
		response.setBufferSize(4096);

		//Récupération des articles avec le DAO (Data Access Object)
		List<Article> articles = this.articleDao.getAllArticles();

		//Récupération de out : il nous permettra d'écrire dans la réponse
		try (PrintWriter out = response.getWriter()) {
			out.println("<html>"
					+ "<head><title>Page des articles</title></head>");
			out.println("<body  bgcolor=\"#ffffff\">");

			// SI articles n'est pas vide, on crée un tableau HTML 
			if (!articles.isEmpty()) {
				LOGGER.debug("Des articles ont été trouvés, un tableau doit être construit en HTML.");

				out.println("<p>Voici les articles trouvés : </p>");
				out.println("<table>");
				out.println("<tr><th>Id</th><th>Nom</th><th>Prix</th></tr>");
				//Pour chaque article, on crée une ligne dans le tableau HTML
				for (Article article : articles) {
					out.println("<tr><td>" + article.getId() + "</td><td>" 
							+ article.getNom() 
							+ "</td><td>" + article.getCategorie() 
							+ "</td></tr>");
				}
				//Fermeture des balises
				out.println("</table>");

			}else {
				out.println("<p>Désolé, aucun article trouvé</p>");
			}

			//Fermeture des balises
			out.println("</body></html>");
		}
		LOGGER.info("Fin de la méthode doGet.");
	}
	

}