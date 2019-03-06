package org.mines.douai.j2ee.webservices;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import org.junit.Assert;
import org.junit.Test;

public class HelloWorldConsumerTest {
	@Test
	public void sayHelloTest1() throws Exception {
		URL url = new URL("http://localhost:9000/helloWorld?wsdl");
		QName qname = new QName("http://webservices.j2ee.douai.mines.org/", "HelloWorld");
		Service service = Service.create(url, qname);
		HelloWorld hello = service.getPort(HelloWorld.class);
		String sayHiResponse = hello.sayHi("Stephane");
		Assert.assertEquals("Hello Stephane", sayHiResponse);
	}

}
