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
public class CustDTO {
	private String custid;
	private Integer shipid;
	private String pwd;
	private String custname;
	private String email;
	private Integer birth;
	private String tel;
	private Integer point;
	private Date rdate;
	private String withdrawal;
	
	private String addr;
	private String addrdetail;
}

