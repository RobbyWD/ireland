package com.ireland.travel.management;

import javax.servlet.http.HttpServletRequest;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
@RequestMapping("/")
public class IndexController {
	@Autowired
	JobLauncher jobLauncher;
	
	@Autowired
	Job job;
	
	@RequestMapping(method = RequestMethod.GET)
	public String hello(HttpServletRequest request) {
	    System.out.println(request.getServletPath());
	    return "manage";
	}
	
	@RequestMapping("csv")
	public String csv(HttpServletRequest request) {
	    System.out.println(request.getServletPath());
	    try {
	    	
	    			JobExecution execution = jobLauncher.run(job, new JobParameters());
	    			System.out.println("Exit Status : " + execution.getStatus());
	    	
	    		} catch (Exception e) {
	    			e.printStackTrace();
	    		}
	    	
	    		System.out.println("Done");
	    
	    
	    return "csv";
	}
	
			
}
