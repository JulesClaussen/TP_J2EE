package mines.douai.j2ee.claussen_amicel.spring;

import javax.inject.Inject;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class YellowJacketBeanInjection {

	private YellowJacketBeanImpl yellowJacketBean;

	public YellowJacketBeanImpl getYellowJacketBean() {
		return yellowJacketBean;
	}

	@Inject
	public void setYellowJacketBean(YellowJacketBeanImpl yellowJacketBean) {
		this.yellowJacketBean = yellowJacketBean;
	}
}
