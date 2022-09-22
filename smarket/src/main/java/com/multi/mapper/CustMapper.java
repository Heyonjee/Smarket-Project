package com.multi.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.multi.dto.CustDTO;
import com.multi.frame.MyMapper;

@Mapper
public interface CustMapper extends MyMapper<String, CustDTO>{
}
