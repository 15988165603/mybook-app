package com.mybook.app.dto.roleDto;

import com.mybook.app.core.BaseRequest;

import javax.validation.constraints.NotNull;

/**
 * 删除角色
 *
 * @author yangzhengrong
 * @version 1.0.0 createTime: 2017/6/26 20:02
 */
public class DeleteRoleRequest extends BaseRequest {
    @NotNull
    private String roleNo;

    public String getRoleNo() {
        return roleNo;
    }

    public void setRoleNo(String roleNo) {
        this.roleNo = roleNo;
    }
}
