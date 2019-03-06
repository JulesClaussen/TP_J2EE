package mines.douai.j2ee.claussen_amicel.spring;

import java.math.BigDecimal;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class YellowJacketBeanImpl implements YellowJacketBean {

	protected String countryName;
	YellowJacketServiceBean service;

	public YellowJacketBeanImpl(YellowJacketServiceBean service) {
		super();
		this.service = service;
	}

	@Override
	public String getCountryName() {
		return countryName;
	}
	
	@Override
	public void setCountryName(String country) {
		this.countryName = country;
	}

	public void printPIB() {
		BigDecimal amountOfYellowJacket = service.getPeopleCount(this.getCountryName());
		int hashcode = this.hashCode();
		System.out.println("Nombre de gilets jaunes en " + this.getCountryName() + " : " + amountOfYellowJacket + " avec le hashcode : " + hashcode);
	}

}
