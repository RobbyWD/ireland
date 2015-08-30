package com.ireland.travel.web.repository;


import java.util.List;

import com.ireland.travel.entity.domain.Product;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.ireland.travel.entity.domain.Category;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends PagingAndSortingRepository<Product, Long> {

    List<Product> findByFeatured(Boolean featured);

//    List<Product> findProductEntries(Product product);
    List<Product> findByNameAndCategory(String productName, Category category);

    List<Product> findByName(String productName);
}
