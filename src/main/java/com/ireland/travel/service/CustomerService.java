package com.ireland.travel.service;

import com.google.common.collect.Lists;
import com.ireland.travel.domain.Authority;
import com.ireland.travel.domain.Customer;
import com.ireland.travel.repository.AuthorityRepository;
import com.ireland.travel.repository.CustomerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	private AuthorityRepository authRepository;
	
	public long countAllCustomers() {
        return customerRepository.count();
    }

	public void deleteCustomer(Customer customer) {
		customerRepository.delete(customer);
    }

	public Customer findCustomer(Long id) {
        return customerRepository.findOne(id);
    }
	
	public Customer findCustomer(String name) {
        return customerRepository.findByUsernameEquals(name);
    }

	public List<Customer> findAllCustomers() {
        return Lists.newArrayList(customerRepository.findAll());
    }

	public List<Customer> findCustomerEntries(int firstResult, int maxResults) {
        final PageRequest pageRequest = new PageRequest(firstResult, maxResults);
        return Lists.newArrayList(customerRepository.findAll(pageRequest));
    }

	public void saveCustomer(Customer customer) {
		customerRepository.save(customer);
		authRepository.save(new Authority(customer));
    }

	public Customer updateCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

	public Customer loginCustomer(String userId, String password) {
		Customer customer = this.findCustomer(userId);
		if (customer != null && customer.getPassword().equals(password)) {
			return customer;
		}
		return null;
	}
}
