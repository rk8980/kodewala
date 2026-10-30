package com.zepto.invoice.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.zepto.invoice.request.response.CategoryResponse;

@FeignClient(name = "PRODUCT-CATEGORY")
public interface CategoryClient {
	
	@GetMapping("/category/{id}")
	CategoryResponse getCategoryById(@PathVariable("id") Long id);
}
