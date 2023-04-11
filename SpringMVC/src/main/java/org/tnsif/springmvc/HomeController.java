package org.tnsif.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/* A contoller contains business logic of Application*/
@Controller

public class HomeController {
	@RequestMapping("/home")
	
	public String home()
	{
		System.out.println("Code to demonstarte on simple web application");
		return "home.jsp";
	}

}
