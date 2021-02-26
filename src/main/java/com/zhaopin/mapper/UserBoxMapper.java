package com.zhaopin.mapper;

import com.zhaopin.bean.UserBox;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface UserBoxMapper extends Mapper<UserBox> {

    /*通过userId查询*/
    List<UserBox> selectUserBox(String userId,String hrId);

    /*删除userBox*/
    int deleteUserBox(long boxId);

    /*用户user注销的所有数据*/
    int deleteUserBoxAll(String userId);

    //用户hr注销的所有数据
    int deleteHrBoxAll(String hrId);

    /*注册/添加user*/
    int insertUserBox(UserBox userBox);

    /*更新user*/
    int updateUserBox(long boxId,String status);

}
