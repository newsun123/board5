package com.example.board5.vo;

import lombok.Data;

@Data
public class memberVo {
    private String id;
    private String userId;
    private String userPwd;
    private String userNm;
    private String userSex, userEmail, userPwdHint, userHintAnswer;
}
