package com.zhaopin.controller;

import com.alibaba.fastjson.JSON;
import com.google.gson.Gson;
import com.zhaopin.bean.Hr;
import com.zhaopin.bean.User;
import com.zhaopin.myResult.LoginMyResult;
import com.zhaopin.service.HrService;
import com.zhaopin.service.UserService;
import com.zhaopin.util.SendSmsUtil;
import com.zhaopin.util.VerificationCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
@RequestMapping("User")
@CrossOrigin(allowCredentials = "true")
public class UserController {

    @Autowired
    UserService userService;

    @Autowired
    HrService hrService;

    @Autowired
    private SendSmsUtil sendSmsUtil;


    public static class SmsData{
        String code;
        public SmsData(String code) {
            this.code = code;
        }
    }

    //查询user信息，不包括用户密码，并返回给前端渲染,管理员使用
    @RequestMapping(value = "select")
    public List<User> getUser(@RequestParam(value = "userId",defaultValue = "") String userId,
                              @RequestParam(value = "mobile",defaultValue = "")String mobile,
                              @RequestParam(value = "userName",defaultValue = "")String userName,
                              @RequestParam(value = "gender",required = false,defaultValue = "") String gender,
                              @RequestParam(value = "birth",defaultValue = "")String birth,
                              @RequestParam(value = "nickname",defaultValue = "")String nickname,
                              @RequestParam(value = "province",defaultValue = "")String province,
                              @RequestParam(value = "city",defaultValue = "")String city,
                              @RequestParam(value = "eduDegree",defaultValue = "")String eduDegree,
                              @RequestParam(value = "graduation",defaultValue = "")String graduation,
                              @RequestParam(value = "graYear",defaultValue = "")String graYear,
                              @RequestParam(value = "major",defaultValue = "")String major){
        List<User> users = userService.selectUser(userId,mobile,userName,gender,birth,nickname,province,city, eduDegree,
                graduation,graYear,major);
        return users;
    }


    //查看个人账户
    @PostMapping(value = "selectuser")
    public List<User> selectUser(@RequestParam(value = "userId") String userId){
        List<User> userList = userService.login(userId);
        return userList;
    }

        //@RequestParam(value = "传参的变量名",defaultValue = "不传值时默认的值",required = false （false为不必须传值，true为必须传值，默认为true）)

    /*发送验证码*/
    @RequestMapping(value = "/faSms",method = RequestMethod.GET)
    public boolean sendSms(@RequestParam(value = "mobile") String mobile,
                           HttpServletRequest request){
        HttpSession session = request.getSession();
        //随机生成验证码
        String numeral = VerificationCode.getNumeral();
        UserController.SmsData smsData = new UserController.SmsData(numeral);
        Gson gson = new Gson();
        String code = gson.toJson(smsData);
        String information = sendSmsUtil.aliSendSms(mobile, code);
        session.setAttribute(mobile,numeral);
        session.setMaxInactiveInterval(5 * 60);
        if(information.equals("ok")){
            return true;//发送成功
        }
        return false;//发送失败
    }

    //注册user账户
    @RequestMapping(value = "insertUser",method = RequestMethod.POST)
    public LoginMyResult insertUser(@RequestParam(value = "mobile") String mobile,
                                    @RequestParam(value = "password") String password,
                                    @RequestParam(value = "nickname") String nickname,
                                    @RequestParam(value = "code") String code,
                                    HttpServletRequest request){
        System.out.println(mobile+","+password+","+nickname+","+code+"\n");
        System.out.println(request);
        List<User> userList =userService.selectUser(null,mobile,null,null,null,
                null,null,null,null,null,null,null);
        List<Hr> hrList = hrService.selectHr(null,mobile,null,null,0);
        int users;
        boolean user2 =  false;
        String msg = "";
        HttpSession session = request.getSession();
        String ycode = (String)session.getAttribute(mobile);
        LoginMyResult loginMyResult = new LoginMyResult();
        if (userList.isEmpty() && hrList.isEmpty()){
            try{
                if (ycode.equals(code)){
                    users = userService.insertUser(mobile,password,nickname);
                    if (users > 0){
                        user2 = true;
                        msg = "注册成功";
                    }else {
                        user2 =false;
                        msg = "注册失败";
                    }
                }else {
                    user2 = false;
                    msg = "验证码错误";
                }
            }catch (Exception e){
                user2 = false;
                msg = "验证码错误";
                System.out.println(e);
            }
        }else{
            user2 = false;
            msg = "账户已存在";
        }
        loginMyResult.setBooleans(user2);
        loginMyResult.setMsg(msg);
        return loginMyResult;
    }

    /*注销user账户*/
    @RequestMapping(value = "zhuxiao",method = RequestMethod.POST)
    public int logoutUser(@RequestParam(value = "mobile") String mobile,
                          @RequestParam(value = "password") String password){
        int users =userService.logoutUser(mobile, password);
        return users;
    }

    /*更新user个人信息*/
    @RequestMapping(value = "update1",method = RequestMethod.POST)
    @ResponseBody
    public boolean updateUser(HttpServletRequest request) {
        User user = JSON.parseObject(request.getParameter("user"), User.class);
        int users = userService.updateUser(user);
        if (users > 0){
            return true;
        }else{
            return false;
        }
    }

    /*通过mobile来删除账户信息，管理员使用*/
    @PostMapping("deleteuser")
    public boolean deleteUser(@RequestParam(value = "mobile") String mobile){
        int users = userService.deleteUser(mobile);
        if (users > 0){
            return true;
        }else{
            return false;
        }
    }

}
