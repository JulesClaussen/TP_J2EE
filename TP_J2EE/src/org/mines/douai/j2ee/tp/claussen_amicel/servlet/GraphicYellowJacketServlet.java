package org.mines.douai.j2ee.tp.claussen_amicel.servlet;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.List;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.imageio.stream.ImageOutputStream;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class GraphicYellowJacketServlet
 */
@WebServlet(name = "GraphicYellowJacket", urlPatterns = { "/GraphicYellowJacket" })
public class GraphicYellowJacketServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GraphicYellowJacketServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    protected void drawPoints(Graphics2D g2d) {
    	ArrayList<Integer> amountOfYellowVestList = new ArrayList<Integer>(12);
    	int r;
    	for (int i = 0; i<12; i++) {
    		r = new Random().nextInt(500);
    		amountOfYellowVestList.add(r);
    		g2d.fill(new Ellipse2D.Float(i*40, r, 10, 10));
    	}
    }
    
    protected void displayGraph(OutputStream outputStream, String country) throws IOException {
		String formatName;
		
    	BufferedImage bufferedImage = new BufferedImage(1000, 500, BufferedImage.TYPE_INT_RGB);
    	formatName = "jpeg";
    	
    	if (country == null ) {
    		Graphics2D g2Void = bufferedImage.createGraphics();
    		g2Void.setColor(Color.white);
    		g2Void.fill(new Ellipse2D.Float(0,0,0,0));
			g2Void.dispose();
			ImageIO.write(bufferedImage, formatName, outputStream);
			return;
    		}
    	
    	switch(country) {
    		case "France": 
    	    	Graphics2D g2dFrance = bufferedImage.createGraphics();
    	    	g2dFrance.setColor(Color.blue);
    	    	this.drawPoints(g2dFrance);
    			g2dFrance.dispose();
    			break;
    		case "Allemagne":
    			Graphics2D g2dAllemagne = bufferedImage.createGraphics();
    			g2dAllemagne.setColor(Color.yellow);
    	    	this.drawPoints(g2dAllemagne);
    	    	g2dAllemagne.dispose();
    			break;
    		case "Pologne":
    			Graphics2D g2dPologne = bufferedImage.createGraphics();
    			g2dPologne.setColor(Color.red);
    	    	this.drawPoints(g2dPologne);
    	    	g2dPologne.dispose();
    			break;
    		default:
    			return;
    	}
    	
		ImageIO.write(bufferedImage, formatName, outputStream);
		
		return;
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("image/jpeg"); // Type MIME
		String country = request.getParameter("country");
		OutputStream outputStream = response.getOutputStream();
		this.displayGraph(outputStream, country);
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
