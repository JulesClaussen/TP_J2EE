package org.mines.douai.j2ee.soap;

import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public interface YellowJacket {
	int getPeopleCount (@WebParam(name = "text") String countryName);
}
