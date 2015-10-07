package com.ireland.travel.service;

import org.springframework.batch.item.ItemProcessor;

import com.ireland.travel.entity.domain.Product;

public class ImageItemProcessor implements ItemProcessor<Product, Product> {

	@Override
	public Product process(Product product) throws Exception {
		
		ImageDownloaderAndResizer resizer = new ImageDownloaderAndResizer();
		String thumbnailImagePath = resizer.makeThumbnail(product.getImagePath());
		product.setImagePath(thumbnailImagePath);
		return product;
	}

}
