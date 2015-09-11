package com.ireland.travel.web.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.ireland.travel.entity.domain.Category;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends PagingAndSortingRepository<Category, Long> {

}
