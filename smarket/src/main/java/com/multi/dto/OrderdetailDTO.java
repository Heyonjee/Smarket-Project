package com.multi.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class OrderdetailDTO {
	private int orderdetailno;
	private int orderno;
	private int productno;
	private int ordersize;
	private String orderitem;
	private int price;
	private int productamount;
	

}
