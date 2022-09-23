package com.multi.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class WishDTO {
	private Integer wishid;
	private String custid;
	private Integer productno;
	
	private String custname;
	private String productname;
}