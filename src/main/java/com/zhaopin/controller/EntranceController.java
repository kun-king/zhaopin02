package com.zhaopin.controller;

import com.zhaopin.bean.Hr;
import com.zhaopin.bean.User;
import com.zhaopin.myResult.LoginMyResult;
import com.zhaopin.service.HrService;
import com.zhaopin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
@CrossOrigin(allowCredentials = "true")
public class EntranceController {

    @Autowired
    UserService userService;

    @Autowired
    HrService hrService;


    /*user/hr的登录*/
    @PostMapping(value = "login")
    public LoginMyResult login(@RequestParam(value = "mobile") String mobile,
                               @RequestParam(value = "password") String password){
        boolean Booleas = false;
        String msg = "";
        String name = "";
        LoginMyResult loginMyResult =new LoginMyResult();
        List<Hr> hrList = hrService.selectHr(null,mobile,null,null,0);
        List<User> userList =userService.selectUser(null,mobile,null,null,null,
                null,null,null,null,null,null,null);
        String hrs = hrService.loginHr(mobile, password);
        String users =userService.loginUser(mobile,password);
        if ((hrList.size()!=0) || (userList.size()!=0)){
            if (hrs != null){
                Booleas = true;
                msg = "Hr";
                name = hrs;
            }else if (users != null){
                Booleas = true;
                msg = "User";
                name = users;
            }else {
                Booleas = false;
                msg = "账号或密码错误";
            }
        }else{
            Booleas = false;
            msg ="账号不存在";
        }
        loginMyResult.setBooleans(Booleas);
        loginMyResult.setMsg(msg);
        loginMyResult.setName(name);
        return loginMyResult;
    }






}
