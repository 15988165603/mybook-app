package com.mybook.app.dto.userInfoDto;

/**
 * 类注释
 *
 * @author hufangting
 * @version 1.0.0 createTime: 2017/6/27 16:46
 * @see 链接到其他资源
 * @since 1.0
 */
public class QueryuserbyrolenameResponse {
    private String userName;
    private String userNo;
    private String value;

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

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
