package com.example.board5.controller.memberController.ui;

import com.example.board5.service.member.memberService;
import com.example.board5.vo.memberVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class memberController {

    private final Logger log = LoggerFactory.getLogger(getClass());

    @Autowired
    private memberService service;

    @GetMapping("/member/regi")
    public String regi(){
        return "/member/regi";
    }

    @GetMapping("/member/regiOk")
    public String regiOk(memberVo memberVo){
        log.info("memberVo = {}", memberVo);
        service.regiOk(memberVo);
        return "redirect:/main";
    }

}
