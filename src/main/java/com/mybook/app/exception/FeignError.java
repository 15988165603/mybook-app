package com.mybook.app.exception;

import com.mybook.app.error.Error;

/**
 * FEIGN 调用异常
 */
public class FeignError extends RuntimeException {

    private String message;

    public FeignError(String message) {
        this.message = message;
    }


    public Error getCode() {
        return Error.FEIGN_EXCEPTION;
    }


    public String getErrorMessage() {
        return String.format(Error.FEIGN_EXCEPTION.getMessage(), message);
    }


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
