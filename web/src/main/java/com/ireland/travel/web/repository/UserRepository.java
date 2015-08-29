package com.ireland.travel.web.repository;


import com.ireland.travel.entity.domain.User;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends PagingAndSortingRepository<User, Long> {
    User findByUsernameEquals(String name);
}
