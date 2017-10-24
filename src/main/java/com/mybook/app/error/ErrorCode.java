package com.mybook.app.error;


public interface ErrorCode {
    public String SUUCCESS = "000000";// 表示成功
    public String UNKNOW_EXCEPTION = "999999"; // 未知异常
    public String NOT_EXIST_USER = "000001"; // 不存在的用户
    public String OUT_TIME_TOKEN = "000002";// token 失效
    public String NOT_LOGIN = "000003"; // 用户未登录
    public String NOT_EXIST_TOKEN = "000004";// token 不存在
    public String EXIST_LOGIN_WITH_OTHER = "000005"; // 用户未登录
    public String PWD_EXCEPTION = "000006";// 密码为默认密码
    public String EXCEED_COUNT_EXCPTION = "000007";// 用户当天错误次数超过20次
    public String DEFAULT_PWD_EXCEPTION = "000008";// 不允许修改为默认密码
    public String REST_PWD_EXCEPTION = "000009";// 重置密码失败
    public String VER_EXCEPTION = "000010";// 重置密码失败
    public String BAD_REQUEST_JSON = "000011";// json 格式错误
    public String BAD_REQUEST_PARAMETER = "000012";// 缺少必要的参数
    public String FEIGN_EXCEPTION = "000013";// FEIGN 异常
    public String USER_EXIST_FORBIDDEN = "000014";// 用户被禁用

}
