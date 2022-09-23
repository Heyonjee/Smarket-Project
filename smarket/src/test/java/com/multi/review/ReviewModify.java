package com.multi.review;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.ReviewDTO;
import com.multi.service.ReviewService;

@SpringBootTest
public class ReviewModify {
	
	@Autowired
	ReviewService service;
	
	@Test
	void contextLoads() {
		ReviewDTO review = new ReviewDTO(7,null,7,"업데이트 테스트",10,null,null,null,null);
		try {
			service.modify(review);
			System.out.println(review);			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
