package org.mines.douai.j2ee.soap;

import javax.jws.WebService;

@WebService(endpointInterface = "org.mines.douai.j2ee.soap.YellowJacket", serviceName = "YellowJacketWebService")
public class YellowJacketImpl {

	public int getPeopleCount(String countryName) {
		if (countryName == null) {
			return 0;
		}
		switch (countryName) {
		case "US":
			return 1000;
		case "FR":
			return 500;
		case "DE":
			return 100;
		default:
			return 0;
		}
	}
}
