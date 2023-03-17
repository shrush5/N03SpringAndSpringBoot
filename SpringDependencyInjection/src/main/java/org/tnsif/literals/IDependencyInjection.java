package org.tnsif.literals;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IDependencyInjection {

	public static void main(String[] args) {
		BeanFactory f=new ClassPathXmlApplicationContext("beans1.xml");
		BMWEngine e=f.getBean("swift",BMWEngine.class);
		System.out.println(e);
		System.out.println(e.cost());
		System.out.println(e.display());

	}

}