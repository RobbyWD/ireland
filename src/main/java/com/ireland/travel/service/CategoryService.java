package com.ireland.travel.service;

import com.google.common.collect.Lists;
import com.ireland.travel.domain.Category;
import com.ireland.travel.repository.CategoryRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

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
