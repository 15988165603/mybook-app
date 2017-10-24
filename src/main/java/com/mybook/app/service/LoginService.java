package com.mybook.app.service;

import com.mybook.app.dto.verifyRecordDto.VerifyRecordRequest;
import com.mybook.app.core.BaseResponse;
import com.mybook.app.dto.loginDto.LoginRequestDto;
import com.mybook.app.dto.loginDto.LoginResponseDto;
import com.mybook.app.dto.verifyRecordDto.VerifyRecordEntity;
import com.mybook.app.dto.userInfoDto.UserEntity;

/**
 * 类注释
 *
 * @author huzhen
 * @version 1.0.0
 * @createTime: 2017/8/16 20:38
 * @see
 * @since 1.0
 */
public interface LoginService {


    /**
     * 登陆
     *
     * @param response
     * @param request
     */
    void login(BaseResponse<LoginResponseDto> response, LoginRequestDto request);

    /**
     * 登出
     *
     * @param userNo
     */
    void out(String userNo);

    /**
     * 查询用户当天密码错误次数
     *
     * @return
     */
    Integer selectVerifyRecordByData(VerifyRecordRequest verifyRecordParam);

    /**
     * 登录记录增加，无论对错
     *
     * @param record
     * @return
     */
    int insertSelective(VerifyRecordEntity record);

    /**
     * 根据token查询用户
     *
     * @param
     * @return
     */
    UserEntity getUserByToKen(String toKen);

//    /**
//     * 登录
//     *
//     * @param userEntity
//     * @return
//     */
//    UserEntity getUserByUserNoAndPassWord(LoginRequest loginRequest);

    UserEntity getUser();

    int deleteByPrimaryKey(Long id);

    int insert(UserEntity record);

    int insertSelective(UserEntity record);

    UserEntity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserEntity record);

    int updateByPrimaryKey(UserEntity record);

    UserEntity getUserByUserNo(String userNo);
}
