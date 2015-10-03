package com.ireland.travel.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import com.google.common.collect.Lists;
import com.ireland.travel.entity.domain.Report;
import com.ireland.travel.repository.ReportRepository;


@Service
public class ReportService {
	
	@Autowired
	private ReportRepository reportRepository;
	

	
	public long countAllReports() {
        return reportRepository.count();
    }

	public void deleteReport(Report report) {
		reportRepository.delete(report);
    }

	public Report findReport(Long id) {
        return reportRepository.findOne(id);
    }
	
	public Report findReport(String name) {
        return reportRepository.findByNameEquals(name);
    }

	public List<Report> findAllReports() {
        return Lists.newArrayList(reportRepository.findAll());
    }

	public List<Report> findReportEntries(int firstResult, int maxResults) {
        final PageRequest pageRequest = new PageRequest(firstResult, maxResults);
        return Lists.newArrayList(reportRepository.findAll(pageRequest));
    }

	public void saveReport(Report report) {
		reportRepository.save(report);
    }

	public Report updateReport(Report report) {
        return reportRepository.save(report);
    }

}
