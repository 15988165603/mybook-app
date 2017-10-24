package com.mybook.app.dto.loginDto;

/**
 * 类注释
 *
 * @author huzhen
 * @version 1.0.0
 * @createTime: 2017/8/16 20:42
 * @see
 * @since 1.0
 * 菜单数据
 */
public class MenuInfoDto {
    private String menuNo;
    private String name;
    private String linkUrl;
    private String imageUrl;

    public MenuInfoDto() {
    }

    public MenuInfoDto(String menuNo, String name) {
        this.menuNo = menuNo;
        this.name = name;
    }

    public String getMenuNo() {
        return menuNo;
    }

    public void setMenuNo(String menuNo) {
        this.menuNo = menuNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLinkUrl() {
        return linkUrl;
    }

    public void setLinkUrl(String linkUrl) {
        this.linkUrl = linkUrl;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
