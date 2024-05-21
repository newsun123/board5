package com.example.board5.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface memberDao {
    int chkId(@Param("userId")String userId);
}
