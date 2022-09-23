package com.multi.orderdetail;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.OrderdetailDTO;
import com.multi.service.OrderdetailService;

@SpringBootTest
class GetOrderdetail {
	
	@Autowired
	OrderdetailService service;
	
	@Test
	void contextLoads() {
		OrderdetailDTO orderdetail = null;
		try {
			orderdetail=service.get(1);
			System.out.println(orderdetail);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
