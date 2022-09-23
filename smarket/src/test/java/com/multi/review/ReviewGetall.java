package com.multi.review;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.ReviewDTO;
import com.multi.service.ReviewService;

@SpringBootTest
public class ReviewGetall {
	
	@Autowired
	ReviewService service;
	
	@Test
	void contextLoads() {
		try {
			List<ReviewDTO> list = service.get();
			for(ReviewDTO review : list) {
				System.out.println(review);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
