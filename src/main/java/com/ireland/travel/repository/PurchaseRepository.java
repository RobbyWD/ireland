package com.ireland.travel.repository;


import org.springframework.data.repository.PagingAndSortingRepository;

import com.ireland.travel.domain.Purchase;

import java.util.List;


public interface PurchaseRepository extends PagingAndSortingRepository<Purchase, Long> {


}
