package com.multi.product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.ProductDTO;
import com.multi.service.ProductService;

@SpringBootTest
class InsertProduct {
	
	@Autowired
	ProductService service;

	@Test
	void contextLoads() {
		ProductDTO product =new ProductDTO(null, 101, null,"아디다스 아디매틱 그린", 260, 336000, 100,null);
		try {
			System.out.println(product);
			service.register(product);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
