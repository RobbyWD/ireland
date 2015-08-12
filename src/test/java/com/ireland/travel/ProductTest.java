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

import com.ireland.travel.domain.Product;
import com.ireland.travel.repository.ProductRepository;
import com.ireland.travel.service.ProductService;


@ContextConfiguration(locations={"classpath:/jpaContext.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class ProductTest {
	
	@Autowired
	public ProductRepository repository;
	
	@Autowired
	public ProductService service;
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Test
	public void testJpaFind(){
		Product tour = new Product();
		tour.setDescription("Tour C - Superior & First Class Hotels - 4 Nts/8 Meals");
		tour.setImagePath("resources/img/cot_00.jpg");
		tour.setName("2015 - 5 Day Taste Of Ireland");
		tour.setPrice(500);
		tour.setDuration(5);
		
//		repository.save(tour);
		service.saveProduct(tour);
		
		List<Product> tours = (List<Product>)repository.findAll();
		assertNotNull(tours);
		assertEquals(tour.getName(), tours.get(tours.size()-1).getName()); 
	}

}
