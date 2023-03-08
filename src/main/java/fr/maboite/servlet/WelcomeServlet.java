package fr.maboite.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "Welcome", displayName = "Welcome Servlet", urlPatterns = "/welcome"  , loadOnStartup = 1)
public class WelcomeServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	/** Création d'un nouvel attribut statique qui nous sert à logger */
	private static final Logger LOGGER = LoggerFactory.getLogger(WelcomeServlet.class);

	@Override
	public void doGet(HttpServletRequest request,
			HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		response.setBufferSize(8);

		//Ici j'affiche un message dans la console
		System.out.println("L'attribut contenuPanier vaut : " 
				+ request.getSession().getAttribute("contenuPanier"));
		
		//Ici je logge un message
		LOGGER.info("Je traite la méthode GET sur l'URL /welcome");
		
		LOGGER.debug("La requete a l'attribut : ");

		request.getSession(true).setAttribute("contenuPanier", 2);
		
		try (PrintWriter out = response.getWriter()) {
			out.println("<html>"
					+ "<head><title>Générée par une servlet</title></head>");
			out.println("<body  bgcolor=\"#ffffff\">"
					+ "<h2>Quelle belle page générée dynamiquement; qsldjklj !!!</h2>");

			String username = request.getParameter("username");
			if (username != null && username.length() > 0) {
				LOGGER.debug("Attention, j'ai un username qui vaut  : " + username);
				out.println("Vous êtes : " + username);
			}
			out.println("</body></html>");
		}
	}
	
	


	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getParameter("firstName");
		
	}




	@Override
	public String getServletInfo() {
		return "La première servlet .";

	}

	@Override
	public void init() throws ServletException {
		super.init();
		System.out.println("Init terminé");
	}
	
	

}