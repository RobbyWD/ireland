package com.ireland.travel.web;

import com.ireland.travel.entity.domain.Customer;
import com.ireland.travel.entity.domain.Role;
import com.ireland.travel.web.repository.CustomerRepository;
import com.ireland.travel.web.service.CustomerService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;


@ContextConfiguration(locations={"classpath:/jpaContext.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class CustomerTest {

	@Qualifier("customerRepository")
	@Autowired
	public CustomerRepository repository;
	
	@Autowired
	public CustomerService service;
	
	@PersistenceContext(unitName = "punit")
	private EntityManager entityManager;
	
	@Test
	public void testJpaFind(){
		Customer andy = new Customer();
		andy.setEmail("randy@email.com");
		andy.setUsername("Randy");
		andy.setPassword("password2");
		andy.setPhone("123456");
		andy.setRole(Role.ROLE_USER);
//		repository.save(andy);
		service.saveCustomer(andy);
		
		List<Customer> locations = (List<Customer>) repository.findAll();
		assertNotNull(locations);
		assertEquals(andy.getUsername(), locations.get(locations.size()-1).getUsername()); 
	}

}
