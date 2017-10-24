package com.mybook.app.dto.roleDto;


import com.mybook.app.core.SLPageInfo;

import java.util.List;

/**
 * 分页查询角色
 *
 * @author yangzhengrong
 * @version 1.0.0 createTime: 2017/7/4 15:28
 */
public class QueryRoleByPageResponse {
    private List<QueryRoleResponse> queryRoleResponses;
    private SLPageInfo slPageInfo;

    public List<QueryRoleResponse> getQueryRoleResponses() {
        return queryRoleResponses;
    }

    public void setQueryRoleResponses(List<QueryRoleResponse> queryRoleResponses) {
        this.queryRoleResponses = queryRoleResponses;
    }

    public SLPageInfo getSlPageInfo() {
        return slPageInfo;
    }

    public void setSlPageInfo(SLPageInfo slPageInfo) {
        this.slPageInfo = slPageInfo;
    }
}
