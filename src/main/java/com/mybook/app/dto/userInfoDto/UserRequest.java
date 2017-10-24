package com.mybook.app.dto.userInfoDto;

import com.mybook.app.core.BaseRequest;

/**
 * 类注释
 *
 * @author hufangting
 * @version 1.0.0 createTime: 2017/6/26 15:11
 * @see
 * @since 1.0
 */
public class UserRequest extends BaseRequest {
	private String mobileNo;
	private String superOfficer;
	private String userMail;
	private String userName;
	private String userNo;
	private String roleNo;
	private Integer userStatus;
	private Boolean verifyRole;
	private String password;
	private Integer passIsUpdate;
	private String roleName;
	private String oldUserNo;

	public String getOldUserNo() {
		return oldUserNo;
	}

	public void setOldUserNo(String oldUserNo) {
		this.oldUserNo = oldUserNo;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getSuperOfficer() {
		return superOfficer;
	}

	public void setSuperOfficer(String superOfficer) {
		this.superOfficer = superOfficer;
	}

	public String getUserMail() {
		return userMail;
	}

	public void setUserMail(String userMail) {
		this.userMail = userMail;
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

	public String getRoleNo() {
		return roleNo;
	}

	public void setRoleNo(String roleNo) {
		this.roleNo = roleNo;
	}

	public Integer getUserStatus() {
		return userStatus;
	}

	public void setUserStatus(Integer userStatus) {
		this.userStatus = userStatus;
	}

	public Boolean getVerifyRole() {
		return verifyRole;
	}

	public void setVerifyRole(Boolean verifyRole) {
		this.verifyRole = verifyRole;
	}

	public Integer getPassIsUpdate() {
		return passIsUpdate;
	}

	public void setPassIsUpdate(Integer passIsUpdate) {
		this.passIsUpdate = passIsUpdate;
	}
}
