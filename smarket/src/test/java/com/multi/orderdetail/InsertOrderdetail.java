package com.multi.orderdetail;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.OrderdetailDTO;
import com.multi.service.OrderdetailService;

@SpringBootTest
class InsertOrderdetail {
	
	@Autowired
	OrderdetailService service;
	
	@Test
	void contextLoads() {
		OrderdetailDTO orderdetail = new OrderdetailDTO(0, 7, 10, 240,"에르메스오즈뮬",79000,"결제대기",4 );
		try {
			service.register(orderdetail);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
