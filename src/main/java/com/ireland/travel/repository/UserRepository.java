package com.ireland.travel.repository;


import org.springframework.data.repository.PagingAndSortingRepository;
import com.ireland.travel.domain.User;


public interface UserRepository extends PagingAndSortingRepository<User, Long> {
    User findByUsernameEquals(String name);
}
