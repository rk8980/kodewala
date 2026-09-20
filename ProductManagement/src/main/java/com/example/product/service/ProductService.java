package com.example.product.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.product.entity.Product;
import com.example.product.repository.ProductRepository;

@Service
public class ProductService {
	
	private ProductRepository productRepository;
	
	public ProductService(ProductRepository productRepository)
	{
		this.productRepository = productRepository;
	}
	
	
	public Product addProduct(Product product)
	{
		return productRepository.save(product);
	}
	
	public List<Product> getAllProducts()
	{
		return productRepository.findAll();
		
	}
	
	public Product getProductById(Long id)
	{
		return productRepository.findById(id).orElse(null);
		
	}
}
