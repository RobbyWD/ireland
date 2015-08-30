package com.ireland.travel.web.repository;


import com.ireland.travel.entity.domain.Authority;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorityRepository extends PagingAndSortingRepository<Authority, Long> {
	Authority findByUsernameEquals(String username);
}
