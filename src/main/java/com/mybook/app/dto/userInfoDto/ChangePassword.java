package com.mybook.app.dto.userInfoDto;


import com.mybook.app.core.BaseEntity;

/**
 * 类注释
 *
 * @author hufangting
 * @version 1.0.0 createTime: 2017/6/27 10:18
 * @see 链接到其他资源
 * @since 1.0
 */
public class ChangePassword extends BaseEntity {
    private String userNo;
    private String password;

    public String getUserNo() {
        return userNo;
    }

    public void setUserNo(String userNo) {
        this.userNo = userNo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
