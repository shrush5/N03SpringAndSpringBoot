package org.tnsif.usingautowirednotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Executor {

	public static void main(String[] args) {
		ApplicationContext c= new ClassPathXmlApplicationContext("web.xml");
		Company k=c.getBean("company",Company.class);
		k.accept();
	}

}
