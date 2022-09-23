package com.multi.product;

import java.util.List;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.ProductDTO;
import com.multi.service.ProductService;

@SpringBootTest
class GetAllProduct {
	
	@Autowired
	ProductService service;

	@Test
	void contextLoads() {
		List<ProductDTO> list = null;
		try {
			list=service.get();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		for(ProductDTO c:list) {
			System.out.println(c);
		}
		
		
	}

}
