package com.ireland.travel.web.repository;


import com.ireland.travel.entity.domain.Customer;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends PagingAndSortingRepository<Customer, Long> {
    Customer findByUsernameEquals(String name);
}
