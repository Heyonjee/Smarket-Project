package com.multi.product;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.ProductDTO;
import com.multi.service.ProductService;

@SpringBootTest
class UpdateProduct {
	
	@Autowired
	ProductService service;

	@Test
	void contextLoads() {
		ProductDTO product = new ProductDTO(18,null,null,null,300,340000, null, null);
		try {
			service.modify(product);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
