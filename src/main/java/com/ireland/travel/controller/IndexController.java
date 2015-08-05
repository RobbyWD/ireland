package com.ireland.travel.controller;

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
	    return "home";
	}
	
	@RequestMapping("info")
	public String info(HttpServletRequest request) {
	    System.out.println(request.getServletPath());
	    return "info";
	}
	
	@RequestMapping("rent")
	public String rent(HttpServletRequest request) {
	    System.out.println(request.getServletPath());
	    return "rent";
	}
	
	@RequestMapping("trust")
	public String trust(HttpServletRequest request) {
	    System.out.println(request.getServletPath());
	    return "trust";
	}
	
	@RequestMapping("cam")
	public String cam(HttpServletRequest request) {
	    System.out.println(request.getServletPath());
	    return "cam";
	}
	
	@RequestMapping("tour")
	public String tour(HttpServletRequest request) {
	    System.out.println(request.getServletPath());
	    return "tour";
	}
}
