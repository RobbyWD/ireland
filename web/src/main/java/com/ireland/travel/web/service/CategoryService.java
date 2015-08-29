package com.ireland.travel.web.service;

import java.util.List;

import com.ireland.travel.entity.domain.Category;
import com.ireland.travel.web.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.google.common.collect.Lists;


@Service
@Transactional
public class CategoryService {

	@Autowired
	private CategoryRepository categoryRepository;
	
	public long countAllCategorys() {
        return categoryRepository.count();
    }

	public void deleteCategory(Category category) {
		categoryRepository.delete(category);
    }

	public Category findCategory(Long id) {
        return categoryRepository.findOne(id);
    }
	
	public List<Category> getAllCategories() {
        return Lists.newArrayList(categoryRepository.findAll());
    }

	public List<Category> findCategoryEntries(int firstResult, int maxResults) {
        final Page<Category> allPages = categoryRepository.findAll(new PageRequest(firstResult, maxResults));
        return Lists.newArrayList(allPages);
    }

	public void saveCategory(Category category) {
		categoryRepository.save(category);
    }

}
