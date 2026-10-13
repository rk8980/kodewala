package com.example.product.service;

import java.util.List;
import com.example.product.kafka.ProductProducer;

import org.springframework.stereotype.Service;

import com.example.product.entity.Product;
import com.example.product.exception.ProductNotFoundException;
import com.example.product.repository.ProductRepository;

@Service
public class ProductService {
	
	private ProductProducer productProducer;
	
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
		return productRepository.findById(id)
				.orElseThrow(() -> new ProductNotFoundException("Product with ID" + id + "not found"));
		
	}
	
	public Product updateProduct(Long id, Product product)
	{
		Product existingProduct = productRepository.findById(id).orElse(null);
				
		
		if (existingProduct != null)
		{
			existingProduct.setName(product.getName());
			existingProduct.setPrice(product.getPrice());
			existingProduct.setCategory(product.getCategory());
			existingProduct.setQuantity(product.getQuantity());
			
			return productRepository.save(existingProduct);
		}
		return null;
	}
}
