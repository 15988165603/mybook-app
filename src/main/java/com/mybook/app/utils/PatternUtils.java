package com.mybook.app.utils;

import com.mybook.app.constants.Constant;

import java.util.regex.Pattern;

/**
 * Created by web on 2017/7/7.
 */
public class PatternUtils {


    /**
     * 匹配手机号码 是手机号码返回 true
     *
     * @param mobile
     * @return
     */
    public static boolean checkMobile(String mobile) {
        if (null == mobile) {
            return false;
        }
        Pattern pattern = Pattern.compile(Constant.REGEX_MOBILE);
        if (pattern.matcher(mobile).matches()) {
            return true;
        }
        return false;
    }

    public static boolean checkMail(String mail) {
        if (null == mail) {
            return false;
        }
        Pattern pattern = Pattern.compile(Constant.REGEX_EMAIL);
        if (pattern.matcher(mail).matches()) {
            return true;
        }
        return false;
    }

}
