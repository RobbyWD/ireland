package com.ireland.travel.service;


import org.springframework.batch.core.JobExecution;
import org.springframework.stereotype.Service;
import com.ireland.travel.entity.domain.Report;



@Service
public class ReportBuilderService {
	
		private JobExecution execution;
	
	 public void build(Report report, UploadService upService) {
		 
		 execution=upService.getExecution();
		 report.setStartTime(execution.getStartTime().toString());
		 report.setExitTime(execution.getEndTime().toString());
		 report.setStatus(execution.getStatus().toString());
		   
			
	 }

}
