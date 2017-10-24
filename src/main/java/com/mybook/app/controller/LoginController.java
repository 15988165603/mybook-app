package com.mybook.app.controller;

import com.mybook.app.core.BaseResponse;
import com.mybook.app.dto.loginDto.LoginRequestDto;
import com.mybook.app.dto.loginDto.LoginResponseDto;
import com.mybook.app.service.LoginService;
import com.mybook.app.utils.UserContext;
import com.mybook.app.utils.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * 类注释
 *
 * @author: hz
 * @date: 2017/6/27
 * @time: 16:52
 * DESC
 */
@RestController
@RequestMapping("/login")
public class LoginController {
    @Autowired
    private LoginService newLoginService;

    //登录
    @RequestMapping("/login")
    //TODO  考虑，用户被禁用了，不能够登录
    public BaseResponse<LoginResponseDto> login(@RequestBody @Valid LoginRequestDto request) {
    
        Logger.info(this, "---登录----" + request.getUserNo());
        BaseResponse<LoginResponseDto> response = new BaseResponse<>();
        newLoginService.login(response, request);
        return response;
    }

    //登出
    @RequestMapping("/login/out")
    public BaseResponse<String> loginOut() {
        Logger.debug(this, "登出");
        String userNo;
        if (!UserContext.getCurrentuserNo().isPresent()) {
            Logger.info(this, "已经登出");
            return BaseResponse.ok();
        }
        userNo = UserContext.getCurrentuserNo().get();
        newLoginService.out(userNo);
        return BaseResponse.ok();
    }

    @GetMapping("/getPing")
    public String getPing() {
        return  "123";
    }
}
