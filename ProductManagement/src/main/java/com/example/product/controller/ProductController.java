package com.example.product.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.product.entity.Product;
import com.example.product.service.ProductService;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
@RequestMapping("/products")
public class ProductController {
	private ProductService productService;
	
	public ProductController(ProductService productService)
	{
		this.productService = productService;
	}
	
	@PostMapping
	public Product addProduct(@RequestBody Product product) {
		return productService.addProduct(product);
	}
	
	@GetMapping
	public List<Product> getAllProducts()
	{  
		return productService.getAllProducts();
	}
	
	@GetMapping("/{id}")
	public Product addProduct(@PathVariable Long id)
	{
		return productService.getProductById(id);
	}
//	@PutMappingt("path/{id}")
//	public String putMethodName(@PathVariable String id, @RequestBody String entity) {
//		//TODO: process PUT request
//		
//		return entity;
//	}
	@PutMapping("/{id}")
	public Product updateProduct(@PathVariable Long id, @RequestBody Product product)
	{
		return productService.updateProduct(id, product);
	}
}
