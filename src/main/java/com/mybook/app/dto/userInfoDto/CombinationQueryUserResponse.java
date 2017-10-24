package com.mybook.app.dto.userInfoDto;

/**
 * 类注释
 *
 * @author hufangting
 * @version 1.0.0 createTime: 2017/6/23 16:16
 * @see
 * @since 1.0
 */
public class CombinationQueryUserResponse {
    private String userName;
    private String userNo;
    private String mobileNo;
    private String userMail;
    private Integer userStatus;
    private String roleName;
    private String roleNo;
    private String superOfficer;
    private String suserName;
    private Boolean verifyRole;

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

    public Integer getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(Integer userStatus) {
        this.userStatus = userStatus;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleNo() {
        return roleNo;
    }

    public void setRoleNo(String roleNo) {
        this.roleNo = roleNo;
    }

    public String getSuperOfficer() {
        return superOfficer;
    }

    public void setSuperOfficer(String superOfficer) {
        this.superOfficer = superOfficer;
    }

    public String getSuserName() {
        return suserName;
    }

    public void setSuserName(String suserName) {
        this.suserName = suserName;
    }

    public Boolean getVerifyRole() {
        return verifyRole;
    }

    public void setVerifyRole(Boolean verifyRole) {
        this.verifyRole = verifyRole;
    }
}
