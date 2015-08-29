package com.ireland.travel.web.repository;


import org.springframework.data.repository.PagingAndSortingRepository;

import com.ireland.travel.entity.domain.Purchase;
import org.springframework.stereotype.Repository;

@Repository
public interface PurchaseRepository extends PagingAndSortingRepository<Purchase, Long> {


}
