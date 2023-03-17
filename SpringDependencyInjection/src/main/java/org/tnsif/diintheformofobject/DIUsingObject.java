package org.tnsif.diintheformofobject;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DIUsingObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BeanFactory f=new ClassPathXmlApplicationContext("bean.xml");
		Cellphone e1=f.getBean("c2",Cellphone.class);
		e1.accept();
	}

}