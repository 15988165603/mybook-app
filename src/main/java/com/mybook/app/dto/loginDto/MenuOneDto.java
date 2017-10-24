package com.mybook.app.dto.loginDto;

import java.util.List;

/**
 * 类注释
 *
 * @author huzhen
 * @version 1.0.0
 * @createTime: 2017/8/16 20:42
 * @see
 * @since 1.0
 * 一级菜单
 */
public class MenuOneDto extends MenuInfoDto{
    private List<MenuTwoDto> children;

    public MenuOneDto() {

    }

    public MenuOneDto(String menuNo, String name) {
        super(menuNo, name);
    }

    public List<MenuTwoDto> getChildren() {
        return children;
    }

    public void setChildren(List<MenuTwoDto> children) {
        this.children = children;
    }
}
