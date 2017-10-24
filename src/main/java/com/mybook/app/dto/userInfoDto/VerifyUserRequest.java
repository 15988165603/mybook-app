package com.mybook.app.dto.userInfoDto;

import com.mybook.app.core.BaseRequest;

import javax.validation.constraints.NotNull;

/**
 * 类注释
 *
 * @author hufangting
 * @version 1.0.0 createTime: 2017/6/28 16:15
 * @see
 * @since 1.0
 */
public class VerifyUserRequest extends BaseRequest {
    @NotNull
    private String userNo;
    @NotNull
    private String mobileNo;
    @NotNull
    private String userMail;

    public String getUserNo() {
        return userNo;
    }

    public void setUserNo(String userNo) {
        this.userNo = userNo;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getUserMail() {
        return userMail;
    }

    public void setUserMail(String userMail) {
        this.userMail = userMail;
    }
}
