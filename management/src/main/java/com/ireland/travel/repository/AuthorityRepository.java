package com.ireland.travel.repository;


import org.springframework.data.repository.PagingAndSortingRepository;

import com.ireland.travel.entity.domain.Authority;


public interface AuthorityRepository extends PagingAndSortingRepository<Authority, Long> {
	Authority findByUsernameEquals(String username);
}
