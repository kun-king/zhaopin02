package com.zhaopin.controller;


import com.alibaba.fastjson.JSON;
import com.zhaopin.bean.UserBox;
import com.zhaopin.myResult.UserBoxMyResult;
import com.zhaopin.service.UserBoxService;
import com.zhaopin.vo.UserBoxVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("UserBox")
@CrossOrigin(allowCredentials = "true")
public class UserBoxController {

    @Autowired
    UserBoxService userBoxService;

    //查询user的投件箱，并把数据返回给前端渲染
    @PostMapping(value = "select")
    public UserBoxMyResult selectUserBox(@RequestParam(value = "userId",defaultValue = "") String userId,
                                         @RequestParam(value = "hrId",defaultValue = "") String hrId){
        UserBoxMyResult userBoxMyResult = new UserBoxMyResult();
        List<UserBox> userBoxList = userBoxService.selectUserBox(userId,hrId);
        if (userBoxList.size() != 0){
            userBoxMyResult.setList(userBoxList);
            userBoxMyResult.setBooleans(true);
        }else{
            userBoxMyResult.setBooleans(false);
            userBoxMyResult.setList(userBoxList);
        }
        return userBoxMyResult;
    }

    /*删除userBox一条数据*/
    @PostMapping(value = "deleteboxId")
    public boolean deleteUserBox(@RequestParam(value = "boxId") String boxId) {
        long boxIds = Long.parseLong(boxId);
        int userBoxs = userBoxService.deleteUserBox(boxIds);
        if (userBoxs > 0){
            return true;
        }else{
            return false;
        }
    }

    //删除投件记录,user账户注销使用
    @PostMapping("deleteUserBoxAll")
    public boolean deleteUserBoxAll(@RequestParam(value = "userId") String userId){
        int userBoxs = userBoxService.deleteUserBoxAll(userId);
        if (userBoxs > 0){
            return true;
        }else{
            return false;
        }
    }

    //用户hr注销的所有数据
    @PostMapping("deleteHrBoxAll")
    public boolean deleteHrBoxAll(@RequestParam(value = "hrId") String hrId) {
        int userBoxs = userBoxService.deleteHrBoxAll(hrId);
        if (userBoxs > 0){
            return true;
        }else{
            return false;
        }
    }

    /*添加userBox*/
    @PostMapping("insert")
    @ResponseBody
    public boolean insertUserBox(HttpServletRequest request){
        UserBoxVo userBoxVo = JSON.parseObject(request.getParameter("userBox"), UserBoxVo.class);
        int userBoxs = userBoxService.insertUserBox(userBoxVo);
        if (userBoxs > 0){
            return true;
        }else{
            return false;
        }
    }

    /*更新userBox，修改投件状态*/
    @PostMapping("update")
    public boolean updateUserBox(@RequestParam(value = "boxId") String boxId,
                                 @RequestParam(value = "status") String status){
        long boxIds = Long.parseLong(boxId);
        int userBoxs = userBoxService.updateUserBox(boxIds, status);
        if (userBoxs > 0){
            return true;
        }else{
            return false;
        }
    }

}
