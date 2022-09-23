package com.multi.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.multi.dto.WishDTO;
import com.multi.frame.MyMapper;

@Repository
@Mapper
public interface WishMapper extends MyMapper<Integer, WishDTO>{

}
