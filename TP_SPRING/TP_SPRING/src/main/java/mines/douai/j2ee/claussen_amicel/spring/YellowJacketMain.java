package mines.douai.j2ee.claussen_amicel.spring;

import javax.annotation.PostConstruct;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class YellowJacketMain {

	static YellowJacketBean frBean;
	static YellowJacketBean enBean;
	static YellowJacketBean deBean;

	@PostConstruct
	public void initName() throws Exception {
		frBean.setCountryName("France");
		enBean.setCountryName("Angleterre");
		deBean.setCountryName("Allemagne");
	}

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("simple-context.xml");

		YellowJacketBeanInjection frBeanInjection = applicationContext.getBean(YellowJacketBeanInjection.class);
		YellowJacketBeanInjection enBeanInjection = applicationContext.getBean(YellowJacketBeanInjection.class);
		YellowJacketBeanInjection deBeanInjection = applicationContext.getBean(YellowJacketBeanInjection.class);
		YellowJacketServiceBeanInjection serviceBean = applicationContext
				.getBean(YellowJacketServiceBeanInjection.class);

		// Vérifie que le bean a bien été injecté, sinon arrête avec erreur le programme
		assert frBeanInjection.getYellowJacketBean() != null;
		assert enBeanInjection.getYellowJacketBean() != null;
		assert deBeanInjection.getYellowJacketBean() != null;
		assert serviceBean.getYellowJacketServiceBean() != null;

		frBean = frBeanInjection.getYellowJacketBean();
		enBean = enBeanInjection.getYellowJacketBean();
		deBean = deBeanInjection.getYellowJacketBean();
		
		frBean.setCountryName("France");
		enBean.setCountryName("Angleterre");
		deBean.setCountryName("Allemagne");

		printYellowJacketAndPopulation(frBean, enBean, deBean);

	}

	public static void printYellowJacketAndPopulation(YellowJacketBean frBean, YellowJacketBean enBean,
			YellowJacketBean deBean) {
		frBean.printPIB();
		frBean.printPIB();
		frBean.printPIB();
		frBean.printPIB();
		enBean.printPIB();
		deBean.printPIB();
	}
}
