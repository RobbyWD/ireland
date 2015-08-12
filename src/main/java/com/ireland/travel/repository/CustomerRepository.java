package com.ireland.travel.repository;


import org.springframework.data.repository.PagingAndSortingRepository;

import com.ireland.travel.domain.Customer;


public interface CustomerRepository extends PagingAndSortingRepository<Customer, Long> {
    Customer findByNameEquals(String name);
}
