package com.zhaopin.service.Imp;

import com.zhaopin.bean.User;
import com.zhaopin.mapper.UserMapper;
import com.zhaopin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "userService")
public class UserServiceImp implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public List<User> selectUser(String userId,String mobile, String userName, String gender, String birth,
                                 String nickname, String province, String city, String eduDegree,
                                 String graduation, String graYear, String major) {
        User user =new User();
        user.setUserId(userId);
        user.setMobile(mobile);
        user.setUserName(userName);
        user.setGender(gender);
        user.setBirth(birth);
        user.setNickname(nickname);
        user.setProvince(province);
        user.setCity(city);
        user.setEduDegree(eduDegree);
        user.setGraduation(graduation);
        user.setGraYear(graYear);
        user.setMajor(major);
        List<User> userList = userMapper.selectUser(user);
        return userList;
    }

    @Override
    public List<User> login(String userId) {
        User user =new User();
        user.setUserId(userId);
        List<User> userList =userMapper.login(user);
        return userList;
    }

    @Override
    public String loginUser(String mobile, String password) {
        User user =new User();
        user.setMobile(mobile);
        user.setPassword(password);
        String userList =userMapper.loginUser(mobile,password);
        return userList;
    }

    @Override
    public int insertUser(String mobile,String password,String nickname){
        User user = new User();
        user.setUserId(mobile);
        user.setMobile(mobile);
        user.setPassword(password);
        user.setNickname(nickname);
        int users = userMapper.insertUser(user);
        return users;
    }

    @Override
    public int logoutUser (String mobile,String password){
        User user = new User();
        user.setMobile(mobile);
        user.setPassword(password);
        int users = userMapper.logoutUser(user);
        return users;
    }

    @Override
    public int updateUser(User user){
        int users = userMapper.updateUser(user);
        return users;
    }

    /*通过mobile来删除账户信息*/
    @Override
    public int deleteUser(String mobile){
        User user = new User();
        user.setMobile(mobile);
        int users = userMapper.deleteUser(user);
        return users;
    }


}
