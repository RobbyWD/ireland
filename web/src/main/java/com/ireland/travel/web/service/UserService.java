package com.ireland.travel.web.service;

import java.util.List;

import com.ireland.travel.entity.domain.Authority;
import com.ireland.travel.entity.domain.User;
import com.ireland.travel.web.repository.AuthorityRepository;
import com.ireland.travel.web.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.google.common.collect.Lists;



@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private AuthorityRepository authRepository;
	
	public long countAllUsers() {
        return userRepository.count();
    }

	public void deleteUser(User user) {
		userRepository.delete(user);
    }

	public User findUser(Long id) {
        return userRepository.findOne(id);
    }
	
	public User findUser(String name) {
        return userRepository.findByUsernameEquals(name);
    }

	public List<User> findAllUsers() {
        return Lists.newArrayList(userRepository.findAll());
    }

	public List<User> findUserEntries(int firstResult, int maxResults) {
        final PageRequest pageRequest = new PageRequest(firstResult, maxResults);
        return Lists.newArrayList(userRepository.findAll(pageRequest));
    }

	public void saveUser(User user) {
		userRepository.save(user);
		authRepository.save(new Authority(user));
    }

	public User updateUser(User user) {
        return userRepository.save(user);
    }

	public User loginUser(String userId, String password) {
		User user = this.findUser(userId);
		if (user != null && user.getPassword().equals(password)) {
			return user;
		}
		return null;
	}
}
