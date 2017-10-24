package com.mybook.app.dto.roleDto;

import com.mybook.app.core.BasePageBean;

/**
 * 分页查询角色信息
 *
 * @author yangzhengrong
 * @version 1.0.0 createTime: 2017/6/27 14:34
 */
public class QueryRoleRequest extends BasePageBean {

    private String roleNo;
    private String roleName;

    public String getRoleNo() {
        return roleNo;
    }

    public void setRoleNo(String roleNo) {
        this.roleNo = roleNo;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}
