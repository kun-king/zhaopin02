package com.zhaopin.util;

public class VerificationCode {
    /**
     * 1.纯数字随机验证码
     * @return
     */

    String code = "";

    public static String getNumeral(){
        String code = "";
        for (int i = 0; i < 6; i++) {
            code = code + (int)(Math.random() * 9);
        }
        return code;
    }

}
