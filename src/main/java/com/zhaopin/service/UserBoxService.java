package com.zhaopin.service;

import com.zhaopin.bean.UserBox;
import com.zhaopin.vo.UserBoxVo;

import java.util.List;

public interface UserBoxService {

    /*通过userId查询*/
    List<UserBox> selectUserBox(String userId,String hrId);

    /*删除userBox一条数据*/
    int deleteUserBox(long boxId);

    /*用户user注销的所有数据*/
    int deleteUserBoxAll(String userId);

    //用户hr注销的所有数据
    int deleteHrBoxAll(String hrId);

    /*添加userBox*/
    int insertUserBox(UserBoxVo userBoxVo);

    /*更新userBox*/
    int updateUserBox(long boxId,String status);

}
