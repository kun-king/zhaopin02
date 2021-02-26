package com.zhaopin.service;

import com.zhaopin.bean.UserIntroduction;

import java.util.List;

public interface UserIntroductionService {

    /*查询信息*/
    List<UserIntroduction> selectUserIntroduction(String userId);

    /*更新信息*/
    int updateUserIntroduction(UserIntroduction userIntroduction);

    /*删除信息*/
    int deleteUserIntroduction(String userId);

    /*增加信息*/
    int insertUserIntroduction(String userId);
}
