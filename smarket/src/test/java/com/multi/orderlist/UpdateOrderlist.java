package com.multi.orderlist;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.OrderlistDTO;
import com.multi.service.OrderlistService;

@SpringBootTest
class UpdateOrderlist {
	
	@Autowired
	OrderlistService service;

	@Test
	void contextLoads() {
		OrderlistDTO orderlist = new OrderlistDTO(11, 4, null, "배송완료",null,240000,null);
		try {
			service.modify(orderlist);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
