package mines.douai.j2ee.claussen_amicel.spring;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class YellowJacketServiceBeanImpl implements YellowJacketServiceBean {

	protected Map<String, Integer> yellowJacketMap;
	
	YellowJacketServiceBeanImpl() {
		
		this.yellowJacketMap = new HashMap<String, Integer>();

		this.yellowJacketMap.put("France", 5200);
		this.yellowJacketMap.put("Angleterre", 3421);
		this.yellowJacketMap.put("Allemagne", 27);
	}


	
	@Override
	public BigDecimal getPeopleCount(String country) {

		if (this.getYellowJacketMap().get(country) == null) {
			return null;
		}
		int numberOfYellowJacket = (int) this.getYellowJacketMap().get(country) + 1000;
		BigDecimal bD = new BigDecimal(numberOfYellowJacket);

		this.getYellowJacketMap().put(country, numberOfYellowJacket);

		return bD;
	}
	
	
	
	public Map getYellowJacketMap() {
		return this.yellowJacketMap;
	}

}
