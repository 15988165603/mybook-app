package com.mybook.app.advise;


import com.mybook.app.core.BaseResponse;
import com.mybook.app.error.Error;
import com.mybook.app.exception.WebException;
import com.mybook.app.utils.Logger;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageConversionException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * 针对异常做处理
 * code
 * messages
 */
@ControllerAdvice(basePackages = {"com.web.project.controller"})
public class ExceptionHandlerAdvise {

    /**
     *  json  格式错误
     * @param ex
     * @return
     */
    @ExceptionHandler(HttpMessageConversionException.class)
    @Order(400)
    public ResponseEntity<BaseResponse> handleWandaException(HttpMessageConversionException ex) {
        Logger.info(this, ex.getMessage());
        return new ResponseEntity<BaseResponse>(BaseResponse.fail(Error.BAD_REQUEST_JSON.getCode(), Error.BAD_REQUEST_JSON.getMessage()), HttpStatus.BAD_REQUEST);
    }

    /**
     * 缺少必要的请求参数
     * @param ex
     * @return
     */
    @ExceptionHandler(MissingServletRequestParameterException.class)
    @Order(401)
    public ResponseEntity<BaseResponse> handleWandaException(MissingServletRequestParameterException ex) {
        Logger.info(this, ex.getMessage());
        return new ResponseEntity<BaseResponse>(BaseResponse.fail(Error.BAD_REQUEST_PARAMETER.getCode(), Error.BAD_REQUEST_PARAMETER.getMessage()), HttpStatus.BAD_REQUEST);
    }

    /**
     *
     * 错误的日志
     *
     * @param ex
     * @return
     */
    @ExceptionHandler(WebException.class)
    @Order(500)
    public ResponseEntity<BaseResponse> handleWandaException(WebException ex) {
        Logger.error(this, ex.getMessage(), ex);
        return new ResponseEntity<BaseResponse>(BaseResponse.fail(Error.UNKNOW_EXCEPTION.getCode(), ex.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
    }

    /**
     * 未捕获的异常
     * @param ex
     * @return
     */
    @ExceptionHandler(RuntimeException.class)
    @Order(2000)
    public ResponseEntity<BaseResponse> handleWandaException(RuntimeException ex) {
        Logger.error(this, "不受控异常" + ex.getMessage(), ex);
        return new ResponseEntity<BaseResponse>(BaseResponse.failure(), HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
