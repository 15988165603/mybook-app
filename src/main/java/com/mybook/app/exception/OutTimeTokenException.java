package com.mybook.app.exception;

import com.mybook.app.error.Error;

/**
 * token 失效
 */
public class OutTimeTokenException extends WebException {
    private static final long serialVersionUID = -7051836414685780479L;

    @Override
    public Error getCode() {
        return Error.OUT_TIME_TOKEN;
    }

    @Override
    public String getErrorMessage() {
        return String.format(Error.OUT_TIME_TOKEN.getMessage());
    }
}
