package com.mybook.app.exception;

import com.mybook.app.error.Error;


public abstract class WebException extends RuntimeException {

    private static final long serialVersionUID = 5702618461006406732L;

    public WebException() {
    }

    public WebException(String message) {
        super(message);
    }

    public WebException(String message, Throwable cause) {
        super(message, cause);
    }

    public WebException(Throwable cause) {
        super(cause);
    }

    public WebException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public abstract Error getCode();

    public abstract String getErrorMessage();

}
