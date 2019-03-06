package org.mines.douai.j2ee.webservices;

import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public interface HelloWorld {
    String sayHi(@WebParam(name="text") String text);
}

