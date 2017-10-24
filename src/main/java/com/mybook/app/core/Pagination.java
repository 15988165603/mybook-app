package com.mybook.app.core;

import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * 类注释
 *
 * @author: hz
 * @date: 2017/4/28
 * @time: 09:21
 * @see: 链接到其他资源
 * @since: 1.0
 */
@EqualsAndHashCode
public class Pagination<T> {

    // 传参或指定
    private int pageNum; // 当前页号, 采用自然数计数 1,2,3,...
    private int pageSize; // 页面大小:一个页面显示多少个数据

    // 需要从数据库中查找出
    private long rowCount;// 数据总数：一共有多少个数据
    private List<T> list;

    // 可以根据上面属性：pageNum,pageSize,rowCount计算出
    private int pageCount; // 页面总数
    private int startRow;// 当前页面开始行, 第一行是0行
    private int first = 1;// 第一页 页号
    private int last;// 最后页 页号
    private int next;// 下一页 页号
    private int prev;// 前页 页号
    private int start;// 页号式导航, 起始页号
    private int end;// 页号式导航, 结束页号
    private int numCount = 10;// 页号式导航, 最多显示页号数量为numCount+1;这里显示11页。
    private T queryBean;//保存查询条件

    public void setPageNum(int pageNum) {
        if (pageNum <= 0) {
            this.pageNum = 1;
        } else {
            this.pageNum = pageNum;
        }
    }

    public int getPageNum() {
        return pageNum;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public long getRowCount() {
        return rowCount;
    }

    public void setRowCount(long rowCount) {
        this.rowCount = rowCount;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public void setStartRow(int startRow) {
        this.startRow = startRow;
    }

    public int getFirst() {
        return first;
    }

    public void setFirst(int first) {
        this.first = first;
    }

    public int getLast() {
        return last;
    }

    public void setLast(int last) {
        this.last = last;
    }

    public int getNext() {
        return next;
    }

    public void setNext(int next) {
        this.next = next;
    }

    public int getPrev() {
        return prev;
    }

    public void setPrev(int prev) {
        this.prev = prev;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public int getNumCount() {
        return numCount;
    }

    public void setNumCount(int numCount) {
        this.numCount = numCount;
    }

    public T getQueryBean() {
        return queryBean;
    }

    public void setQueryBean(T queryBean) {
        this.queryBean = queryBean;
    }

    public Pagination(T bean) {

    }


    public Pagination(int pageSize, int pageNum, long rowCount) {
        if (pageNum <= 0) {
            pageNum = 1;
        }
        this.pageNum = pageNum;
        this.pageSize = pageSize;
        this.rowCount = rowCount;

        this.pageCount = (int) Math.ceil((double) rowCount / pageSize);
        this.pageNum = Math.min(this.pageNum, pageCount);
        this.pageNum = Math.max(1, this.pageNum);

        this.startRow = (this.pageNum - 1) * pageSize;
        this.last = this.pageCount;
        this.next = Math.min(this.pageCount, this.pageNum + 1);
        this.prev = Math.max(1, this.pageNum - 1);

        // 计算page 控制
        start = Math.max(this.pageNum - numCount / 2, first);
        end = Math.min(start + numCount, last);
        if (end - start < numCount) {
            start = Math.max(end - numCount, 1);
        }

    }

    public Pagination() {
    }

    /**
     * 通过每页条数,页码计算起始行号
     *
     * @param size 每页条数
     * @param num  页码
     * @return 起始行号
     */
    public static int calculateStartRow(int size, int num) {
        return (num - 1) * size;
    }

    public int getStartRow() {
        return this.pageSize * (this.pageNum - 1);
    }
}
