package com.zepto.service;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zepto.entity.CategoryEntity;
import com.zepto.entity.ProductEntity;
import com.zepto.repository.CategoryRepository;
import com.zepto.repository.ProductRepository;
import com.zepto.request.ProductRequest;

@Service
public class ProductService
{
	@Autowired
	CategoryRepository categoryRepository;

	@Autowired
	ProductRepository productRepository;

	public void getCategories()
	{
		List<CategoryEntity> categoryEntities = categoryRepository.findAllCategories(); // One query

		
		for (CategoryEntity categoryEntity : categoryEntities)
		{
			System.out.println(
					" Name " + categoryEntity.getCategory() + ",  category id " + categoryEntity.getCategory_id());

			List<ProductEntity> products = categoryEntity.getProduct(); // fired the query to get product(2)
			for (ProductEntity product : products)
			{
				System.out.println(" productId " + product.getProductId() + " , " + product.getProductName());
			}

		}

	}

	public long createProduct(ProductRequest productRequest)
	{
		String category = productRequest.getCategory();

		CategoryEntity categoryEntity = categoryRepository.findByCategory(category);

		ProductEntity productEntity = new ProductEntity(); // new

		productEntity.setDescription(productRequest.getDescription());
		productEntity.setPrice(productRequest.getPrice());
		productEntity.setProductName(productRequest.getProductName());
		productEntity.setQuantity(productRequest.getQuantity());
		productEntity.setCategory(categoryEntity);

		// this will create a record in table
		ProductEntity responseEntity = productRepository.save(productEntity);

		return responseEntity.getProductId();
	}

}
