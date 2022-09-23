package com.multi.orderlist;


import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.CartDTO;
import com.multi.dto.OrderlistDTO;
import com.multi.service.OrderlistService;

@SpringBootTest
class GetAllOrderlist {
	
	@Autowired
	OrderlistService service;

	@Test
	void contextLoads() {
		List<OrderlistDTO> list = null;
		try {
			list = service.get();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(OrderlistDTO ol:list) {
			System.out.println(ol);
		}
	
	}

}
