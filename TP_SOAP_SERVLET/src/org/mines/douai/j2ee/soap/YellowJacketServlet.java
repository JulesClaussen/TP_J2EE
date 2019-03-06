package org.mines.douai.j2ee.soap;

import java.io.IOException;
import java.net.URL;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

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

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		URL url = new URL("http://localhost:9000/YellowJacket?wsdl");
		QName qname = new QName("http://soap.j2ee.douai.mines.org/", "YellowJacketWebService");
		Service service = Service.create(url, qname);
		YellowJacket aYellowJacket = service.getPort(YellowJacket.class); 
		
		int amountOfYellowJacket = aYellowJacket.getPeopleCount("FR");
		
		response.getWriter().append(
			"<!DOCTYPE html>\r\n" + 
			"<html>\r\n" + 
			"<head>\r\n" + 
				"<meta charset=\"ISO-8859-1\">\r\n" + 
				"<title>TP SOAP</title>\r\n" + 
			"</head>\r\n" + 
			"<body>\r\n" + 
				"<h1>"+amountOfYellowJacket+"</h1>"+
			"</body>"+
			"</html>"
		);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
