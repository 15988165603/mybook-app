package com.mybook.app.core;

/**
 * 类注释
 *
 * @author: hz
 * @date: 2017/6/15
 * @time: 12:52
 * @see: 链接到其他资源
 * @since: 1.0
 * 获取pageHandler分页，组装我们需要的分页数据
 */
public class SLPageInfo extends BaseBean {

    private Integer pageNum;
    private Integer pageSize;
    private Integer pages;
    private Long total;

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

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }


}
