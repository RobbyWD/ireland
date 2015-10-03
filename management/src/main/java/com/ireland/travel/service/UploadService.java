package com.ireland.travel.service;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ireland.travel.entity.domain.Report;
import lombok.Data;

@Data
@Service
public class UploadService {
	
	@Autowired
	JobLauncher jobLauncher;
	
	@Autowired
	Job job;
	
	@Autowired
	ReportService reportService;
	
	private JobExecution execution;
	
	 public void upload() {
		 try {
		    	
 		execution = jobLauncher.run(job, new JobParameters());
// 		Report report = new Report(job.getName(),"Uploading Tours", execution.getStartTime().toString(),execution.getEndTime().toString(),
// 				execution.getStatus().toString(),"Failte Ireland");
// 		reportService.saveReport(report);	
 		} catch (Exception e) {
 			e.printStackTrace();
 		}
			
	 }

}
