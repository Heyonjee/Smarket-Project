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
	private String custname;
	private String custid;
	private Date rdate;
	private boolean withdrawal;
	private String email;
	private String addr;
	private String birth;
	private String tel;
	private Integer point;
}
