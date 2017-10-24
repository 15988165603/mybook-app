package com.mybook.app.exception;

import com.mybook.app.error.Error;

/**
 * 用户名或密码错误
 */
public class NotExistUserException extends WebException {

    private static final long serialVersionUID = 4367670873598595923L;

    private String userNo = null;

    public NotExistUserException(String userNo) {
        this.userNo = userNo;
    }

    public NotExistUserException() {
        this.userNo = "";
    }

    @Override
    public Error getCode() {
        return Error.NOT_EXIST_USER;
    }

    @Override
    public String getErrorMessage() {
        return String.format(getCode().getMessage(), this.userNo);
    }
}
