package org.mines.douai.j2ee.soap;

import javax.xml.ws.Endpoint;


public class YellowJacketPublisher {
	public static void main(String[] args) {
		System.out.println("Starting Server");
		YellowJacketImpl implementor = new YellowJacketImpl();
		String address = "http://localhost:9000/YellowJacket";
		Endpoint.publish(address, implementor);
	}
}
