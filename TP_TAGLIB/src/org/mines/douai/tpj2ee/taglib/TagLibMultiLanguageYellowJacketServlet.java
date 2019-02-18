package org.mines.douai.tpj2ee.taglib;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class JSPMultiLanguageYellowJacketServlet
 */
@WebServlet(name = "TagLibMultiLanguageYellowJacketServlet", urlPatterns = { "/TagLibMultiLanguageYellowJacket" })
public class TagLibMultiLanguageYellowJacketServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TagLibMultiLanguageYellowJacketServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String language = request.getParameter("language");
		String countryName = request.getParameter("country");
		
		if(language == null) {
			language = "Francais";
		}
		
		if(countryName == null) {
			countryName = "France";
		}
		RequestDispatcher requestDispatcherLang;
		requestDispatcherLang = request.getRequestDispatcher("YellowJacketTag.jsp?language=" + language + "&country=" + countryName);

		requestDispatcherLang.include(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
