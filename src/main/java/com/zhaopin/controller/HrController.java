package com.zhaopin.controller;

import com.alibaba.fastjson.JSON;
import com.google.gson.Gson;
import com.zhaopin.bean.Hr;
import com.zhaopin.bean.User;
import com.zhaopin.myResult.LoginMyResult;
import com.zhaopin.service.CompanyService;
import com.zhaopin.service.HrService;
import com.zhaopin.service.UserService;
import com.zhaopin.util.SendSmsUtil;
import com.zhaopin.util.VerificationCode;
import com.zhaopin.vo.HrVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
@RequestMapping("Hr")
@CrossOrigin(allowCredentials = "true")
public class HrController {

    @Autowired
    HrService hrService;

    @Autowired
    UserService userService;

    @Autowired
    CompanyService companyService;

    @Autowired
    private SendSmsUtil sendSmsUtil;


    public static class SmsData{
        String code;
        public SmsData(String code) {
            this.code = code;
        }
    }


    //查看个人账户
    @PostMapping(value = "selectHr")
    public List<Hr> selectHr(@RequestParam(value = "userId") String hrId){
        List<Hr> hrList = hrService.login(hrId);
        return hrList;
    }

    /*发送验证码*/
    @RequestMapping(value = "/faSms",method = RequestMethod.GET)
    public boolean sendSms(@RequestParam(value = "mobile") String mobile,
                           HttpServletRequest request){
        HttpSession session = request.getSession();
        //随机生成验证码
        String numeral = VerificationCode.getNumeral();
        HrController.SmsData smsData = new HrController.SmsData(numeral);
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

    //注册hr账户
    @PostMapping(value = "insertHr")
    public LoginMyResult insertHr(@RequestParam(value = "mobile") String mobile,
                                  @RequestParam(value = "password") String password,
                                  @RequestParam(value = "code") String code,
                                  @RequestParam(value = "hrName")String hrName,
                                  @RequestParam(value = "companyName") String companyName,
                                  @RequestParam(value = "companyAbbreviation") String companyAbbreviation,
                                  @RequestParam(value = "companyFullname") String companyFullname,
                                  @RequestParam(value = "type") String type,
                                  @RequestParam(value = "description") String description,
                                  HttpServletRequest request){
        List<User> userList =userService.selectUser(null,mobile,null,null,null,
                null,null,null,null,null,null,null);
        List<Hr> hrList = hrService.selectHr(null,mobile,null,null,0);
        int hrs = 0;
        boolean hrs1 =false;
        String msg = "";
        HttpSession session = request.getSession();
        String ycode = (String)session.getAttribute(mobile);
        LoginMyResult loginMyResult = new LoginMyResult();
        if (userList.isEmpty() && hrList.isEmpty()){
            try{
                if (ycode.equals(code)){
                    int company = companyService.insertCompany(companyName,companyAbbreviation, companyFullname,
                            type,description);
                    if (company >0){
                        Long companyId = companyService.selectCompanyIdName(companyName);
                        hrs = hrService.insertHr(mobile, password, hrName, companyId);
                        if (hrs > 0){
                            hrs1 = true;
                            msg = "注册成功";
                        }else {
                            hrs1 = false;
                            msg = "注册失败";
                        }
                    }else {
                        hrs1 = false;
                        msg = "公司注册失败";
                    }
                }else {
                    hrs1 = false;
                    msg = "验证码错误";
                }
            }catch (Exception e){
                hrs1 = false;
                msg = "验证码错误";
            }
        }else {
            hrs1 = false;
            msg = "账户已存在";
        }
        loginMyResult.setBooleans(hrs1);
        loginMyResult.setMsg(msg);
        return loginMyResult;
    }


    //注销hr账户
    @PostMapping(value = "zhuxiao")
    public boolean logoutHr(@RequestParam(value = "mobile") String mobile,
                            @RequestParam(value = "password") String password){
        int hrs = hrService.logoutHr(mobile, password);
        if (hrs > 0){
            return true;
        }else{
            return false;
        }
    }

    //查询hr信息，返回值里不包括密码
    @PostMapping(value = "select")
    public List<Hr> selectHr(@RequestParam(value = "hrId",defaultValue = "") String hrId,
                             @RequestParam(value = "mobile",required = false) String mobile,
                             @RequestParam(value = "hrName",required = false) String hrName,
                             @RequestParam(value = "description",required = false) String description,
                             @RequestParam(value = "companyId",defaultValue = "0") long companyId){
        List<Hr> hrList = hrService.selectHr(hrId,mobile, hrName, description, companyId);
        return  hrList;
    }

    //修改更新个人信息
    @PostMapping(value = "update")
    @ResponseBody
    public boolean updateHr(HttpServletRequest request){
        HrVo hrVo = JSON.parseObject(request.getParameter("hr"), HrVo.class);
        int hrs = hrService.updateHr(hrVo);
        if (hrs > 0){
            return true;
        }else {
            return false;
        }
    }

    /*删除hr，管理员使用*/
    @PostMapping(value = "delete")
    public boolean deleteHr(@RequestParam String mobile){
        int hrs = hrService.deleteHr(mobile);
        if (hrs > 0){
            return true;
        }else{
            return false;
        }
    }
}
