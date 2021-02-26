package com.zhaopin.controller;

import com.alibaba.fastjson.JSON;
import com.zhaopin.bean.UserIntroduction;
import com.zhaopin.service.UserIntroductionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

//简历接口
@RestController
@RequestMapping("UserIntroduction")
@CrossOrigin(allowCredentials = "true")
public class UserIntroductionController {

    @Autowired
    UserIntroductionService userIntroductionService;

    //查询简历数据，返回给前端渲染
    @PostMapping(value = "select")
    public List<UserIntroduction> selectUserIntroduction(@RequestParam(value = "userId") String userId){
        List<UserIntroduction> userIntroductionList = userIntroductionService.selectUserIntroduction(userId);
        return userIntroductionList;
    }

    /*更新简历数据*/
    @PostMapping(value = "update")
    @ResponseBody
    public boolean updateUserIntroduction(HttpServletRequest request){
        UserIntroduction userIntroduction = JSON.parseObject(request.getParameter("userIntroduction"), UserIntroduction.class);
        int userIntroductions = userIntroductionService.updateUserIntroduction(userIntroduction);
        if (userIntroductions > 0){
            return true;
        }else {
            return false;
        }
    }

    //删除一条简历
    @PostMapping(value = "delete")
    public boolean deleteUserIntroduction(@RequestParam(value = "userId") String userId){
        int userIntroductions = userIntroductionService.deleteUserIntroduction(userId);
        if (userIntroductions > 0){
            return true;
        }else{
            return false;
        }
    }

    //新建一条简历
    @PostMapping(value = "insert")
    public boolean insertUserIntroduction(@RequestParam(value = "userId") String userId){
        int userIntroductions = userIntroductionService.insertUserIntroduction(userId);
        if (userIntroductions > 0){
            return true;
        }else{
            return false;
        }
    }

}
