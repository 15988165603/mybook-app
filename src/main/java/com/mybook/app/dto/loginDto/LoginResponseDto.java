package com.mybook.app.dto.loginDto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * 类注释
 *
 * @author huzhen
 * @version 1.0.0
 * @createTime: 2017/8/16 20:42
 * @see 链接到其他资源
 * @since 1.0
 */
public class LoginResponseDto {
    private String token;
    @JsonProperty("isUpdate")
    private Boolean isUpdate = false;
    private String userNo;
    private List<MenuOneDto> menuDtoList;// 权限信息

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getUserNo() {
        return userNo;
    }

    public void setUserNo(String userNo) {
        this.userNo = userNo;
    }

    public Boolean getIsUpdate() {
        return isUpdate;
    }

    public void setIsUpdate(Boolean update) {
        isUpdate = update;
    }

    public List<MenuOneDto> getMenuDtoList() {
        return menuDtoList;
    }

    public void setMenuDtoList(List<MenuOneDto> menuDtoList) {
        this.menuDtoList = menuDtoList;
    }
}
