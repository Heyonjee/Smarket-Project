package com.multi.orderdetail;


import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.CartDTO;
import com.multi.dto.OrderdetailDTO;
import com.multi.dto.OrderlistDTO;
import com.multi.service.OrderdetailService;
import com.multi.service.OrderlistService;

@SpringBootTest
class GetAllOrderdetail {
	
	@Autowired
	OrderdetailService service;

	@Test
	void contextLoads() {
		List<OrderdetailDTO> list = null;
		try {
			list = service.get();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(OrderdetailDTO od:list) {
			System.out.println(od);
		}
	
	}

}
