package com.multi.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class ProductDTO {
	private Integer productno;
	private Integer cateid;
	private String name;
	private String productname;
	private Integer size;
	private Integer productprice;
	private Integer productquantity;
	private String reviewcontent;

}
