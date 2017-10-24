package com.mybook.app.exception;

import com.mybook.app.error.Error;

/**
 * 用户在其他设备登录
 */
public class ExistLoginWithOtherException extends WebException {
    private static final long serialVersionUID = -6664597933525995502L;

    @Override
    public Error getCode() {
        return Error.EXIST_LOGIN_WITH_OTHER;
    }

    @Override
    public String getErrorMessage() {
        return String.format(Error.EXIST_LOGIN_WITH_OTHER.getMessage());
    }
}
