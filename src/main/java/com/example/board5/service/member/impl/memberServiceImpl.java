package com.example.board5.service.member.impl;

import com.example.board5.dao.memberDao;
import com.example.board5.service.member.memberService;
import com.example.board5.vo.memberVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class memberServiceImpl implements memberService {

    @Autowired
    private memberDao memberDao;

    @Override
    public int chkId(String userId) {
        int result;

        result = memberDao.chkId(userId);

        return result;
    }

    @Override
    public int chkNm(String userNm) {
        int result;
        result = memberDao.chkNm(userNm);
        return result;
    }

    @Override
    public void regiOk(memberVo memberVo) {
        memberDao.regiOk(memberVo);
    }
}
