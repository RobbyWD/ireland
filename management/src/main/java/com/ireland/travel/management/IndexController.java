package com.ireland.travel.management;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.ireland.travel.service.UploadService;



@Controller
@RequestMapping("/")
public class IndexController {
	
	@Autowired
	UploadService upService;
	
	
	@RequestMapping(method = RequestMethod.GET)
	public String hello(HttpServletRequest request) {
	    System.out.println(request.getServletPath());
	    return "manage";
	}
	
	@RequestMapping("upload")
	public String csv(HttpServletRequest request) {
	    System.out.println(request.getServletPath());
	    upService.upload();
	    return "upload";
	}
	
			
}
