package com.multi.orderdetail;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.OrderdetailDTO;
import com.multi.service.OrderdetailService;

@SpringBootTest
class UpdateOrderdetail {
	
	@Autowired
	OrderdetailService service;

	@Test
	void contextLoads() {
		OrderdetailDTO orderdetail = new OrderdetailDTO(26, 0, 0, 0,"나이키 에어포스",240000,"배송중",1);
		try {
			service.modify(orderdetail);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
