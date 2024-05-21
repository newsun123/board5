package com.example.board5.service.member;

import com.example.board5.vo.memberVo;

public interface memberService {
    int chkId(String userId);
    int chkNm(String userNm);
    void regiOk(memberVo memberVo);
}
