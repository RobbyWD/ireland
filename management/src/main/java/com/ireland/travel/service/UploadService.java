package com.ireland.travel.service;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UploadService {
	
	@Autowired
	JobLauncher jobLauncher;
	
	@Autowired
	Job job;
	
	 public void upload() {
		 try {
		    	
 		JobExecution execution = jobLauncher.run(job, new JobParameters());
 		System.out.println("Exit Status : " + execution.getStatus());
 	
 		} catch (Exception e) {
 			e.printStackTrace();
 		}
 	
			
	 }

}
