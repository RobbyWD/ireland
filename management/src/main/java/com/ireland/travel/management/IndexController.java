package com.ireland.travel.management;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;




@Controller
@RequestMapping("/")
public class IndexController {
	
	@RequestMapping(method = RequestMethod.GET)
	public String hello(HttpServletRequest request) {
	    System.out.println(request.getServletPath());
	    return "manage";
	}
				
}
