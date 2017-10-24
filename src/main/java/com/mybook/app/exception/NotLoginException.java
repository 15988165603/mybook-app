package com.mybook.app.exception;

import com.mybook.app.error.Error;

/**
 * 用户未登录
 */
public class NotLoginException extends WebException {

    private static final long serialVersionUID = -6664597933525995502L;

    @Override
    public Error getCode() {
        return Error.NOT_LOGIN;
    }

    @Override
    public String getErrorMessage() {
        return String.format(Error.NOT_LOGIN.getMessage());
    }
}
