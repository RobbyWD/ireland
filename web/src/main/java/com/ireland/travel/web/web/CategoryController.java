package com.ireland.travel.web.web;

import com.ireland.travel.web.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ireland.travel.entity.domain.Category;

@Controller
@RequestMapping("/categories")
public class CategoryController {

	@Autowired
	CategoryService categoryService;

	public CategoryService getCategoryService() {
		return categoryService;
	}

	public void setCategoryService(CategoryService categoryService) {
		this.categoryService = categoryService;
	}

	
	@RequestMapping(value = "/{id}")
	public ModelAndView getCategory(@PathVariable("id") Long categoryId) {
		Category category = categoryService.findCategory(categoryId);
		return new ModelAndView("category/view", "category", category);
		
	}
}
