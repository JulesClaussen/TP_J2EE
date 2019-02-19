package org.mines.douai.j2ee.tp.claussen_amicel.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class YellowJacketServlet
 */
@WebServlet(name = "YellowJacket", urlPatterns = { "/YellowJacket" })
public class YellowJacketServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public YellowJacketServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    protected int amountOfYellowVest(String country) {
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
    
    protected void displayList(HttpServletResponse response, String country) throws IOException {
    	
    	response.setContentType("text/html"); // Type MIME
		java.io.PrintWriter out = response.getWriter();
		
		if (country == null) {
			out.println("<SELECT name=\"country\" size=\"1\">");
			out.println("<OPTION selected>France");
			out.println("<OPTION>Allemagne");
			out.println("<OPTION>Pologne");
			out.println("</SELECT>");
			return;
		}
		
		out.println("<SELECT name=\"country\" size=\"1\">");
		switch (country) {
		case "France":
			out.println("<OPTION selected>France");
			out.println("<OPTION>Allemagne");
			out.println("<OPTION>Pologne");
			
			break;
		case "Allemagne":
			out.println("<OPTION>France");
			out.println("<OPTION selected>Allemagne");
			out.println("<OPTION>Pologne");
			break;
		case "Pologne":
			out.println("<OPTION>France");
			out.println("<OPTION>Allemagne");
			out.println("<OPTION selected>Pologne");
			break;
		default:
			out.println("<OPTION selected>France");
			out.println("<OPTION>Allemagne");
			out.println("<OPTION>Pologne");
			break;
		}
		out.println("</SELECT>");

    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html"); // Type MIME
		java.io.PrintWriter out = response.getWriter();	
		
		String nameCountry = request.getParameter("country");
		int numberOfYellowJacket;
		
		out.println("<html><body>");
		out.println("Select your yellow jacket country");
		out.println("<form action=\"http://localhost:8080/TP_YELLOWJACKET/YellowJacket\" method=Post>");
		
		this.displayList(response, nameCountry);
		
		out.println("<input type=submit name=buttonDisplay value=\"Submit\">");
		
		out.println("</form>");
		
		if(nameCountry != null) {
			numberOfYellowJacket = this.amountOfYellowVest(nameCountry);
			out.println("There are " + numberOfYellowJacket + " yellow jackets in " + nameCountry);
		}
		
		out.println("<img src=/TP_YELLOWJACKET/GraphicYellowJacket" + "?country=" + nameCountry + ">");
		
		out.println("</body></html>");
				
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
		
		
	}

}
