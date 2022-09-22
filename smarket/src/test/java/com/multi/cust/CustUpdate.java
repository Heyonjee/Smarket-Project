package com.multi.cust;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.CustDTO;
import com.multi.service.CustService;

@SpringBootTest
public class CustUpdate {
	
	@Autowired
	CustService service;
	@Test
	void contextLoads() {
		try {
			CustDTO cust = new CustDTO("hytest2",3,null,null,null, null,null,17000,null,null,null,null);
			service.modify(cust);			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("객체가 생성되지 않았습니다.");
			e.printStackTrace();
		}
	}
}

