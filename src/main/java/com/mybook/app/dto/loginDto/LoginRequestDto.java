package com.mybook.app.dto.loginDto;

import com.mybook.app.core.BaseRequest;

import javax.validation.constraints.NotNull;

public class LoginRequestDto extends BaseRequest {

    @NotNull
    private String userNo;

    @NotNull
    private String passWord;

    private String verifCode; //验证码

    private Long id;    //验证码ID


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getVerifCode() {
        return verifCode;
    }

    public void setVerifCode(String verifCode) {
        this.verifCode = verifCode;
    }

    public String getUserNo() {
        return userNo;
    }

    public void setUserNo(String userNo) {
        this.userNo = userNo;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

}
