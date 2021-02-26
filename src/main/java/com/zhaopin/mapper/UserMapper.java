package com.zhaopin.mapper;


import com.zhaopin.bean.User;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

//import org.apache.ibatis.annotations.Mapper;

public interface UserMapper extends Mapper<User>{

    /*用户登录*/
    //@Select(value = "select * from user where mobile = #{mobile} and password = #{password}")
    @Select("select nickname from user where mobile = #{mobile} and password = #{password}")
    String loginUser(String mobile, String password);

    /*用户个人信息*/
    List<User> login(User user);

    /*注销账户*/
    int logoutUser (User user);

    /*通过userId/手机号/姓名/昵称查询user*/
    List<User> selectUser(User user);

    /*删除user（Admin使用）*/
    int deleteUser(User user);

    /*注册/添加user*/
    int insertUser(User user);

    /*更新user*/
    int updateUser(User user);

    /**/
    User getUser(String moblie);

}
