package com.example.board5.controller.memberController.api;

import com.example.board5.service.member.memberService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class memberRestController {

    @Autowired
    private memberService service;

    private final Logger log = LoggerFactory.getLogger(getClass());

    @RequestMapping(value="/member/chkId", method = RequestMethod.GET)
    public @ResponseBody int chkId(String userId){
        int result;
        result = service.chkId(userId);
        return result;
    }

    @RequestMapping(value="/member/chkNm", method = RequestMethod.GET)
    public @ResponseBody int chkNm(String userNm){
        int result;
        result = service.chkNm(userNm);
        return result;
    }
}
