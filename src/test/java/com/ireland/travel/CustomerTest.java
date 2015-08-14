package com.ireland.travel;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ireland.travel.domain.Customer;
import com.ireland.travel.repository.CustomerRepository;
import com.ireland.travel.service.CustomerService;


@ContextConfiguration(locations={"classpath:/jpaContext.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class CustomerTest {
	
	@Autowired
	public CustomerRepository repository;
	
	@Autowired
	public CustomerService service;
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Test
	public void testJpaFind(){
		Customer andy = new Customer();
		andy.setEmail("randy@email.com");
		andy.setUsername("Randy");
		andy.setPassword("password2");
		andy.setPhone("123456");
		
//		repository.save(andy);
		service.saveCustomer(andy);
		
		List<Customer> locations = (List<Customer>) repository.findAll();
		assertNotNull(locations);
		assertEquals(andy.getUsername(), locations.get(locations.size()-1).getUsername()); 
	}

}
