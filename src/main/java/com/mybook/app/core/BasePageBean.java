package com.mybook.app.core;

/**
 * 类注释
 *
 * @author huzhen
 * @version 1.0.0
 * @createTime: 2017/8/17 10:02
 * @see
 * @since 1.0
 */
public class BasePageBean extends BaseRequest{
    // 页码
    private Integer pageNum = 1;
    // 每页显示记录数
    private Integer pageSize = 30;

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
}
