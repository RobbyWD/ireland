package com.ireland.travel.repository;


import org.springframework.data.repository.PagingAndSortingRepository;

import com.ireland.travel.domain.Purchase;


public interface PurchaseRepository extends PagingAndSortingRepository<Purchase, Long> {


}
