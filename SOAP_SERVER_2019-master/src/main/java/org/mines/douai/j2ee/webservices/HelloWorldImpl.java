package org.mines.douai.j2ee.webservices;

import javax.jws.WebService;

@WebService(endpointInterface = "org.mines.douai.j2ee.webservices.HelloWorld", serviceName = "HelloWorld")
public class HelloWorldImpl implements HelloWorld {

	public String sayHi(String text) {
		System.out.println("sayHi called");
		return "Hello " + text;
	}
}
