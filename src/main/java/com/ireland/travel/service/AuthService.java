package com.ireland.travel.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.google.common.collect.Lists;
import com.ireland.travel.domain.Authority;
import com.ireland.travel.repository.AuthorityRepository;


@Service
public class AuthService {
	
	@Autowired
	private AuthorityRepository authRepository;
	
	public long countAllUsers() {
        return authRepository.count();
    }

	public void deleteUser(Authority user) {
		authRepository.delete(user);
    }

	public Authority findUser(Long id) {
        return authRepository.findOne(id);
    }
	
	public Authority findUser(String name) {
        return authRepository.findByUsernameEquals(name);
    }

	public List<Authority> findAllUsers() {
        return Lists.newArrayList(authRepository.findAll());
    }

	public List<Authority> findUserEntries(int firstResult, int maxResults) {
        final PageRequest pageRequest = new PageRequest(firstResult, maxResults);
        return Lists.newArrayList(authRepository.findAll(pageRequest));
    }

	public void saveUser(Authority user) {
		authRepository.save(user);
    }

	public Authority updateUser(Authority user) {
        return authRepository.save(user);
    }

	public void delete(Long id) {
		authRepository.delete(id);	
	}
	
}
