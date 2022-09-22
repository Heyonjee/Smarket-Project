package com.multi.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.multi.dto.ProductDTO;
import com.multi.frame.MyMapper;

@Repository
@Mapper
public interface ProductMapper extends MyMapper<Integer, ProductDTO> {

	
}
