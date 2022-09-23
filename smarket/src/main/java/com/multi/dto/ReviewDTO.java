package com.multi.dto;

import java.util.Date;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Service
@ToString
public class ReviewDTO {
	private Integer reviewno;
	private String custid;
	private Integer productno;
	private String reviewcontent;
	private Integer likecount;
	private Date reviewdate;
	
	private String custname;
	private String productname;
	private String catename;
}

