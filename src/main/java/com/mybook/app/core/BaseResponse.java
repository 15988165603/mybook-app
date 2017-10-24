package com.mybook.app.core;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.mybook.app.error.Error;

/**
 * 类注释
 *
 * @author: hz
 * @date: 2017/4/28
 * @time: 09:21
 * @see: 链接到其他资源
 * @since: 1.0
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class BaseResponse<T> extends BaseBean {

    @JsonIgnore
    private boolean isSuccess;

    private String code;

    private String messages;

    private T data;

    private WebPageInfo pageInfo;

    public BaseResponse() {
    }

    public BaseResponse(boolean isSuccess, String code, String messages) {
        super();
        this.isSuccess = isSuccess;
        this.code = code;
        this.messages = messages;
    }

    public BaseResponse(boolean isSuccess, String code, String messages, T data) {
        super();
        this.isSuccess = isSuccess;
        this.code = code;
        this.messages = messages;
        this.data = data;
    }

    public BaseResponse(String code, String messages, T data) {
        super();
        this.isSuccess = true;
        this.code = code;
        this.messages = messages;
        this.data = data;
    }

    public BaseResponse(String code, String messages) {
        super();
        this.isSuccess = true;
        this.code = code;
        this.messages = messages;
    }

    public BaseResponse(T data, WebPageInfo pageInfo) {
        super();
        this.isSuccess = true;
        this.code = Error.SUCCESS.getCode();
        this.messages = Error.SUCCESS.getMessage();
        this.data = data;
        this.pageInfo = pageInfo;
    }

    public BaseResponse(T data) {
        super();
        this.isSuccess = true;
        this.code = Error.SUCCESS.getCode();
        this.messages = Error.SUCCESS.getMessage();
        this.data = data;
    }

    public WebPageInfo getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(WebPageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessages() {
        return messages;
    }

    public void setMessages(String messages) {
        this.messages = messages;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void setSuccess(Boolean success) {
        isSuccess = success;
    }

//    public Boolean getSuccess() {
//        return isSuccess;
//    }

    public static BaseResponse ok() {
        return new BaseResponse(true, Error.SUCCESS.getCode(), Error.SUCCESS.getMessage());
    }

    public static BaseResponse fail(String code, String message) {
        return new BaseResponse(false, code, message);
    }

    public static BaseResponse failure() {
        return new BaseResponse(false, Error.UNKNOW_EXCEPTION.getCode(), Error.UNKNOW_EXCEPTION.getMessage());
    }
}
