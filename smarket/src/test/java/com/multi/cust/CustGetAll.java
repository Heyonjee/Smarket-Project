package com.multi.cust;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.CustDTO;
import com.multi.service.CustService;

@SpringBootTest
public class CustGetAll {
	
	@Autowired
	CustService service;
	@Test
	void contextLoads() {
		try {
			List<CustDTO> list = service.get();
			
			for(CustDTO c : list) {
				System.out.println(c);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
