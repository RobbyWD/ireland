package com.ireland.travel.repository;


import org.springframework.data.repository.PagingAndSortingRepository;

import com.ireland.travel.domain.Category;
import com.ireland.travel.domain.Product;

import java.util.List;


public interface ProductRepository extends PagingAndSortingRepository<Product, Long> {

    List<Product> findByFeatured(Boolean featured);

//    List<Product> findProductEntries(Product product);
    List<Product> findByNameAndCategory(String productName, Category category);

    List<Product> findByName(String productName);
}
