package com.mybook.app.error;


public  enum  Error {
	 SUCCESS(ErrorCode.SUUCCESS, "success")
    ,UNKNOW_EXCEPTION(ErrorCode.UNKNOW_EXCEPTION,"内部错误")
    ,NOT_EXIST_USER(ErrorCode.NOT_EXIST_USER,"用户名或密码错误")
    ,OUT_TIME_TOKEN(ErrorCode.OUT_TIME_TOKEN,"token 失效")
    ,NOT_LOGIN(ErrorCode.NOT_LOGIN,"用户未登录,请重新登录")
    ,EXIST_LOGIN_WITH_OTHER(ErrorCode.EXIST_LOGIN_WITH_OTHER,"用户在其他设备登录,请重新登录")
    ,NOT_EXIST_TOKEN(ErrorCode.NOT_EXIST_TOKEN,"不存在的token")
    ,PWD_EXCEPTION(ErrorCode.PWD_EXCEPTION,"密码为默认密码")
    ,EXCEED_COUNT_EXCPTION(ErrorCode.EXCEED_COUNT_EXCPTION,"密码输入错误次数已达上限，请明日再登录")
    ,DEFAULT_PWD_EXCEPTION(ErrorCode.DEFAULT_PWD_EXCEPTION,"不允许修改为默认密码")
    ,REST_PWD_EXCEPTION(ErrorCode.REST_PWD_EXCEPTION,"重置密码失败")
    ,VER_EXCEPTION(ErrorCode.VER_EXCEPTION,"验证码错误")
    ,BAD_REQUEST_JSON(ErrorCode.BAD_REQUEST_JSON,"JSON 数据格式错误")
    ,FEIGN_EXCEPTION(ErrorCode.FEIGN_EXCEPTION,"FEIGN 调用异常 : %s" )
    ,BAD_REQUEST_PARAMETER(ErrorCode.BAD_REQUEST_PARAMETER,"缺少必要的参数")
    ,USER_EXIST_FORBIDDEN(ErrorCode.USER_EXIST_FORBIDDEN,"用户被禁用")

   ;

    private String code;
    private String message;

    Error(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

}
