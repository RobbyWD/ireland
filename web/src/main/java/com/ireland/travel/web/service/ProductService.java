package com.ireland.travel.web.service;

import java.util.List;

import com.ireland.travel.web.repository.CategoryRepository;
import com.ireland.travel.web.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import com.ireland.travel.entity.domain.Product;

@Service
@Transactional
public class ProductService {

	private ProductRepository productRepository;
	private CategoryRepository categoryRepository;

    @Autowired
    public ProductService(ProductRepository productRepository, CategoryRepository categoryRepository) {
        this.productRepository = productRepository;
        this.categoryRepository = categoryRepository;
    }

    public List<Product> getFeaturedProducts() {
		return productRepository.findByFeatured(true);
	}

	public long countAllProducts() {
        return productRepository.count();
    }

	public void deleteProduct(Product product) {
		productRepository.delete(product);
    }

	public Product findProduct(Long id) {
        return productRepository.findOne(id);
    }

	public List<Product> findAllProducts() {
        return Lists.newArrayList(productRepository.findAll());
    }

	public List<Product> findProductEntries(int firstResult, int maxResults) {
        final PageRequest pageRequest = new PageRequest(firstResult, maxResults);
        return Lists.newArrayList(productRepository.findAll(pageRequest));
    }

	public void saveProduct(Product product) {
		productRepository.save(product);
    }

	public Product updateProduct(Product product) {
        return productRepository.save(product);
    }

	public List<Product> findProducts(Product product) {
        Preconditions.checkNotNull(product);

        if ( product.getCategory() != null && product.getCategory().getId() > 0) {
		    return productRepository.findByNameAndCategory(product.getName(), product.getCategory());
        } else {
            return productRepository.findByName(product.getName());
        }
	}
}
