package com.mybook.app.exception;


import com.mybook.app.error.Error;

/**
 * 不存在的token
 */
public class NotExistTokenException extends WebException {

    private static final long serialVersionUID = 8867783841194312911L;

    public NotExistTokenException() {

    }

    @Override
    public Error getCode() {
        return Error.NOT_EXIST_TOKEN;
    }

    @Override
    public String getErrorMessage() {
        return String.format(getCode().getMessage());
    }

}
