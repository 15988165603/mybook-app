package com.mybook.app.dto.amapLbsDto;

/**
 * 类注释
 *
 * @author huzhen
 * @version 1.0.0 createTime: 2017/7/18 13:53
 * @see
 * @since 1.0
 */
public class AmapLbsApiDetailResponse {
//    结构化地址信息
    private String formatted_address;

    private String location;

    public String getFormatted_address() {
        return formatted_address;
    }

    public void setFormatted_address(String formatted_address) {
        this.formatted_address = formatted_address;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
