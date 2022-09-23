package com.multi.cart;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.multi.dto.CartDTO;
import com.multi.service.CartService;

@SpringBootTest
class InsertCart {
	
	@Autowired
	CartService service;

	@Test
	void contextLoads() {
		CartDTO cart =new CartDTO(null, "id04", 4, 1, null);
		try {
			System.out.println(cart);
			service.register(cart);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
