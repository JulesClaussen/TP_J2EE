package mines.douai.j2ee.claussen_amicel.spring;

import javax.inject.Inject;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class YellowJacketServiceBeanInjection {
	
	private YellowJacketServiceBeanImpl yellowJacketServiceBean;

	public YellowJacketServiceBeanImpl getYellowJacketServiceBean() {
		return yellowJacketServiceBean;
	}

	@Inject
	public void setYellowJacketServiceBean(YellowJacketServiceBeanImpl yellowJacketServiceBean) {
		this.yellowJacketServiceBean = yellowJacketServiceBean;
	}

}
