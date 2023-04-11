package org.tnsif.springmvc;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringMvcApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(SpringMvcApplication.class, args);
		Scanner sc=new Scanner(System.in);
		/*int x=sc.nextInt();
		System.out.println(x);
		Employee e=context.getBean(Employee.class);
		e.setEmpid(10232);
		e.setEmpname("Shrushti Ugale");
		e.print();*/
		
		HomeController h=context.getBean(HomeController.class);
		h.home();
		
	}

}
