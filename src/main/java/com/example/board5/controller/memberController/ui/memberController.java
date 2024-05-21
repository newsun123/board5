package com.example.board5.controller.memberController.ui;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class memberController {

    @GetMapping("/member/regi")
    public String regi(){
        return "/member/regi";
    }

}
