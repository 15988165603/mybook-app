package com.mybook.app.dto.userInfoDto;


import com.mybook.app.core.BasePageBean;

/**
 * 类注释
 *
 * @author hufangting
 * @version 1.0.0 createTime: 2017/6/23 15:47
 * @see
 * @since 1.0
 */
public class QueryuserRequest extends BasePageBean {
    private String mobileNo;
    private String roleName;
    private String userName;
    private String userNo;
    private Integer userStatus;

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserNo() {
        return userNo;
    }

    public void setUserNo(String userNo) {
        this.userNo = userNo;
    }

    public Integer getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(Integer userStatus) {
        this.userStatus = userStatus;
    }
}
