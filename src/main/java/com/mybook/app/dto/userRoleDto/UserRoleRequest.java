package com.mybook.app.dto.userRoleDto;

import com.mybook.app.core.BaseBean;

import javax.validation.constraints.NotNull;

/**
 * 类注释
 *
 * @author hufangting
 * @version 1.0.0 createTime: 2017/6/26 14:54
 * @see
 * @since 1.0
 */
public class UserRoleRequest extends BaseBean {
    @NotNull
    private String roleNo;
    @NotNull
    private String userNo;
    private Integer isDelete;

    public String getRoleNo() {
        return roleNo;
    }

    public void setRoleNo(String roleNo) {
        this.roleNo = roleNo;
    }

    public String getUserNo() {
        return userNo;
    }

    public void setUserNo(String userNo) {
        this.userNo = userNo;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }
}
