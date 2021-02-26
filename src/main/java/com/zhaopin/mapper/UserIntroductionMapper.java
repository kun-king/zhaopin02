package com.zhaopin.mapper;

import com.zhaopin.bean.UserIntroduction;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface UserIntroductionMapper extends Mapper<UserIntroduction> {

    /*查询信息*/
    List<UserIntroduction> selectUserIntroduction(UserIntroduction userIntroduction);

    /*更新信息*/
    int updateUserIntroduction(UserIntroduction userIntroduction);

    /*删除信息*/
    int deleteUserIntroduction(UserIntroduction userIntroduction);

    /*增加信息*/
    int insertUserIntroduction(UserIntroduction userIntroduction);

}
