package com.multi.product;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.service.ProductService;

@SpringBootTest
class DeleteProduct {
	
	@Autowired
	ProductService service;

	@Test
	void contextLoads() {
		try {
			service.remove(18);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
