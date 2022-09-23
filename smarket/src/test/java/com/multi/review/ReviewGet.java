package com.multi.review;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.ReviewDTO;
import com.multi.service.ReviewService;

@SpringBootTest
public class ReviewGet {
	
	@Autowired
	ReviewService service;
	
	@Test
	void contextLoads() {
		try {
			ReviewDTO review = service.get(7);
			System.out.println(review);			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
