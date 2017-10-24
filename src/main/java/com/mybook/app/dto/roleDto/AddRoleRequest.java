package com.mybook.app.dto.roleDto;

import com.mybook.app.core.BaseRequest;

import java.util.Set;

/**
 * 角色添加请求参数
 *
 * @author yangzhengrong
 * @version 1.0.0 createTime: 2017/6/23 16:56
 */
public class AddRoleRequest extends BaseRequest{
    private String remarks;	//备注
    private String roleDesc	;//角色描述
    private Set<String> roleMenu	;//权限菜单
    private String roleName	;//角色名称
    private String roleNo	;//角色编号
    private Boolean roleStatus	;//角色状态（0启用，1停用)

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getRoleDesc() {
        return roleDesc;
    }

    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc;
    }

    public Set<String> getRoleMenu() {
        return roleMenu;
    }

    public void setRoleMenu(Set<String> roleMenu) {
        this.roleMenu = roleMenu;
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

    public Boolean getRoleStatus() {
        return roleStatus;
    }

    public void setRoleStatus(Boolean roleStatus) {
        this.roleStatus = roleStatus;
    }
}
