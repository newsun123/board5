package com.example.board5.dao;

import com.example.board5.vo.memberVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface memberDao {
    int chkId(@Param("userId")String userId);
    int chkNm(@Param("userNm")String userNm);
    void regiOk(memberVo memberVo);
}
