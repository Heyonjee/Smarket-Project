package com.multi.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.multi.dto.OrderdetailDTO;
import com.multi.frame.MyMapper;

@Repository
@Mapper
public interface OrderdetailMapper extends MyMapper<Integer, OrderdetailDTO>{

	
}
