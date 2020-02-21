package com.example.dao;

import com.example.domain.UserVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface MainMapper {

    UserVO getUserVo();

    @Select("SELECT 'id11111111' as id, 'name11111111111111' as name")
    UserVO findAll();
}
