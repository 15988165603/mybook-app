package com.mybook.app.service.impl;

import com.mybook.app.core.BaseResponse;
import com.mybook.app.dto.loginDto.LoginRequestDto;
import com.mybook.app.dto.loginDto.LoginResponseDto;
import com.mybook.app.dto.userInfoDto.UserEntity;
import com.mybook.app.dto.verifyRecordDto.VerifyRecordEntity;
import com.mybook.app.dto.verifyRecordDto.VerifyRecordRequest;
import com.mybook.app.service.LoginService;
import org.springframework.stereotype.Service;

/**
 * Created by dell on 2017/10/24.
 */
@Service
public class LoginServiceImpl implements LoginService {
    /**
     * 登陆
     *
     * @param response
     * @param request
     */
    @Override
    public void login(BaseResponse<LoginResponseDto> response, LoginRequestDto request) {
        response.setCode("000000");
        response.setMessages("登陆成功!");

    }

    /**
     * 登出
     *
     * @param userNo
     */
    @Override
    public void out(String userNo) {

    }

    /**
     * 查询用户当天密码错误次数
     *
     * @param verifyRecordParam
     * @return
     */
    @Override
    public Integer selectVerifyRecordByData(VerifyRecordRequest verifyRecordParam) {
        return null;
    }

    /**
     * 登录记录增加，无论对错
     *
     * @param record
     * @return
     */
    @Override
    public int insertSelective(VerifyRecordEntity record) {
        return 0;
    }

    /**
     * 根据token查询用户
     *
     * @param toKen@return
     */
    @Override
    public UserEntity getUserByToKen(String toKen) {
        return null;
    }

    @Override
    public UserEntity getUser() {
        return null;
    }

    @Override
    public int deleteByPrimaryKey(Long id) {
        return 0;
    }

    @Override
    public int insert(UserEntity record) {
        return 0;
    }

    @Override
    public int insertSelective(UserEntity record) {
        return 0;
    }

    @Override
    public UserEntity selectByPrimaryKey(Long id) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(UserEntity record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(UserEntity record) {
        return 0;
    }

    @Override
    public UserEntity getUserByUserNo(String userNo) {
        return null;
    }
}
