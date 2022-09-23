package com.multi.orderlist;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.OrderlistDTO;
import com.multi.service.OrderlistService;

@SpringBootTest
class InsertOrderlist {
	
	@Autowired
	OrderlistService service;

	@Test
	void contextLoads() {
		OrderlistDTO orderlist = new OrderlistDTO(0, 5, "id02", "배송중", null, 120000, "이자바");
		try {
			service.register(orderlist);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
