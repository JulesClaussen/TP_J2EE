package org.mines.douai.tpj2ee.ajax;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class YellowJacketAJAXServlet
 */
@WebServlet(name = "YellowJacketAJAX", urlPatterns = { "/YellowJacketAJAX" })
public class YellowJacketAJAXServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public YellowJacketAJAXServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    public int amountOfYellowVest(String country) {
    	if (country == null ) {return 0;}
    	switch (country) {
    		case "France":
    			return 10485;
    		case "Allemagne":
    			return 6541;
    		case "Pologne":
    			return 42;
    		default:
    			return 0;
    	}
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("application/json");
		PrintWriter writer = response.getWriter();
		String parameter = request.getParameter("country");
		writer.println("{\"content\" : \"country " + this.amountOfYellowVest(parameter) + "\"");
		writer.println("}");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
