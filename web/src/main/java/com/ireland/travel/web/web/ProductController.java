package com.ireland.travel.web.web;


import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ireland.travel.entity.domain.Product;
import com.ireland.travel.web.service.CategoryService;
import com.ireland.travel.web.service.ProductService;



@Controller
@RequestMapping("/products")
public class ProductController {
	
	private static final Logger logger = LoggerFactory.getLogger(ProductController.class);
	
	@Autowired
	ProductService productService;
	@Autowired
	CategoryService categoryService;
	
	public ProductService getProductService() {
		return productService;
	}

	public void setProductService(ProductService productService) {
		this.productService = productService;
	}
		
	@RequestMapping(params = "search")
	public String searchProducts(Model model) {
		model.addAttribute("products", productService.findAllProducts());
		return "product/search";
	}
	
	@ExceptionHandler(Exception.class)
	  public ModelAndView errorHandler(HttpServletRequest req, Exception exception) {
	    logger.error("Request: " + req.getRequestURL() + " raised " + exception);

	    ModelAndView mav = new ModelAndView();
	    mav.addObject("exception", exception);
	    mav.addObject("url", req.getRequestURL());
	    mav.setViewName("product/error");
	    return mav;
	  }

	
	
}
