package com.example.board5.service.member.impl;

import com.example.board5.dao.memberDao;
import com.example.board5.service.member.memberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class memberServiceImpl implements memberService {

    @Autowired
    private memberDao memberDao;

    @Override
    public int chkId(String userId) {
        int result = 0;

        result = memberDao.chkId(userId);

        return result;
    }
}
