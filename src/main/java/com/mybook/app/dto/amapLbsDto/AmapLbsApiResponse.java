package com.mybook.app.dto.amapLbsDto;

import java.util.List;

/**
 * 类注释
 *
 * @author huzhen
 * @version 1.0.0 createTime: 2017/7/18 13:51
 * @see 链接到其他资源
 * @since 1.0
 */
public class AmapLbsApiResponse {
//    返回结果状态值 返回值为 0 或 1，0 表示请求失败；1 表示请求成功
    private String status;
//    返回结果数目
    private String count;
//    返回状态说明 当 status 为 0 时，info 会返回具体错误原因，否则返回“OK”
    private String info;
//    地理编码信息列表
    private List<AmapLbsApiDetailResponse> geocodes;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public List<AmapLbsApiDetailResponse> getGeocodes() {
        return geocodes;
    }

    public void setGeocodes(List<AmapLbsApiDetailResponse> geocodes) {
        this.geocodes = geocodes;
    }
}
