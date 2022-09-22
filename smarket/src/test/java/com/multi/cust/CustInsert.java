package com.multi.cust;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.CustDTO;
import com.multi.service.CustService;

@SpringBootTest
public class CustInsert {
	
	@Autowired
	CustService service;
	@Test
	void contextLoads() {
		try {
			
//			String dateStr = "2021-09-22";         // 포맷터        
//			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-mm-dd");         
//			// 문자열 -> Date        
//			Date date = formatter.parse(dateStr);
			CustDTO cust = new CustDTO("hytest2",1,"testpwd01","hy","hy@test", 220101,"123456",10000,null,"N",null,null);
			System.out.println(cust);
			service.register(cust);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("객체가 생성되지 않았습니다.");
			e.printStackTrace();
		}
	}
}

