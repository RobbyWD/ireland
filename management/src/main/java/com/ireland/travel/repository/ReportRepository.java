package com.ireland.travel.repository;


import org.springframework.data.repository.PagingAndSortingRepository;
import com.ireland.travel.entity.domain.Report;


public interface ReportRepository extends PagingAndSortingRepository<Report, Long> {
	Report findByNameEquals(String name);
}
