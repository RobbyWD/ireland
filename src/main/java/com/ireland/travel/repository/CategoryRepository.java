package com.ireland.travel.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import com.ireland.travel.model.Category;


public interface CategoryRepository extends PagingAndSortingRepository<Category, Long> {

}
