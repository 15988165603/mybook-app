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
 * 二级菜单
 */
public class MenuTwoDto extends MenuInfoDto {
    private List<MenuThreeDto> children;

    public MenuTwoDto() {
    }

    public MenuTwoDto(String menuNo, String name) {
        super(menuNo, name);
    }

    public List<MenuThreeDto> getChildren() {
        return children;
    }

    public void setChildren(List<MenuThreeDto> children) {
        this.children = children;
    }
}
