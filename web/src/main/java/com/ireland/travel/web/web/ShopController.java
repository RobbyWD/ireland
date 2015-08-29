package com.ireland.travel.web.web;

import java.util.List;

import com.ireland.travel.web.service.CategoryService;
import com.ireland.travel.web.service.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ireland.travel.entity.domain.Category;


/**
 * Handles requests for the application home page.
 */
@Controller
public class ShopController {
	
	private static final Logger logger = LoggerFactory.getLogger(ShopController.class);
	@Autowired
	ProductService productService;
	@Autowired
	CategoryService categoryService;
	
    
	@RequestMapping(value = "tour", method = RequestMethod.GET)
	public ModelAndView tour() {
		return new ModelAndView("tour", "featuredProducts", productService.getFeaturedProducts());
	}
	
	
	@ModelAttribute("allCategories")
	public List<Category> fetchAllCategories() {
		return categoryService.getAllCategories();
	}
	
}
