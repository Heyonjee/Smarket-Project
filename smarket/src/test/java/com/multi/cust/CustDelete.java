package com.multi.cust;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.service.CustService;

@SpringBootTest
public class CustDelete {
	
	@Autowired
	CustService service;
	@Test
	void contextLoads() {
		try {
			service.remove("hytest");
			System.out.println("test");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("객체가 생성되지 않았습니다.");
			e.printStackTrace();
		}
	}
}

