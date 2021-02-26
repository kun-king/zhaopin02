package com.zhaopin.service;

import com.zhaopin.bean.User;

import java.util.List;

public interface UserService {

    /*查询数据*/
    List<User> selectUser(String userId,String mobile,String userName,String gender,
                          String birth,String nickname,String province,String city,
                          String eduDegree,String graduation,String graYear,String major);

    /*查看个人信息*/
    List<User> login(String userId);

    /*登录*/
    String loginUser(String mobile, String password);

    /*注册*/
    int insertUser(String mobile,String password,String nickname);

    /*注销账户*/
    int logoutUser (String mobile,String password);

    /*更新账户信息*/
    int updateUser(User user);

    /*通过mobile来删除账户信息*/
    int deleteUser(String mobile);

}
