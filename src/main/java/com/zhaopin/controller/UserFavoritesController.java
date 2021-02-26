package com.zhaopin.controller;

import com.zhaopin.bean.UserFavorites;
import com.zhaopin.myResult.UserBoxMyResult;
import com.zhaopin.service.UserFavoritesService;
import com.zhaopin.vo.UserFavoritesVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//收藏接口
@RestController
@RequestMapping("UserFavorites")
@CrossOrigin(allowCredentials = "true")
public class UserFavoritesController {

    @Autowired
    UserFavoritesService userFavoritesService;

    //根据userId查询user的收藏职位
    @PostMapping("select")
    public UserBoxMyResult selectUserFavorites(@RequestParam(value = "userId") String userId){
        UserBoxMyResult userBoxMyResult = new UserBoxMyResult();
        List<UserFavorites> userFavoritesList = userFavoritesService.selectUserFavorites(userId);
        if (userFavoritesList.size() != 0){
            userBoxMyResult.setList(userFavoritesList);
            userBoxMyResult.setBooleans(true);
        }else{
            userBoxMyResult.setBooleans(false);
            userBoxMyResult.setList(userFavoritesList);
        }
        return  userBoxMyResult;
    }

    /*删除UserFavorites的一条收藏数据*/
    @PostMapping(value = "delete")
    public boolean deleteUserFavorites(@RequestParam(value = "favoritesId") String favoritesId){
        long favoritesIds = Long.parseLong(favoritesId);
        int userFavoritess = userFavoritesService.deleteUserFavorites(favoritesIds);
        if (userFavoritess>0){
            return true;
        }else{
            return false;
        }
    }

    /*删除UserFavorites的user下所有数据，注：user注销使用*/
    @PostMapping(value = "deleteUserAll")
    public boolean deleteUserFavoritesAll(@RequestParam(value = "userId") String userId){
        int userFavoritess = userFavoritesService.deleteUserFavoritesAll(userId);
        if (userFavoritess>0){
            return true;
        }else{
            return false;
        }
    }

    /*添加UserFavorites*/
    @PostMapping(value = "insert")
    public boolean insertUserFavorites(@RequestParam(value = "title") String title,
                                       @RequestParam(value = "salaryUp") String salaryUp,
                                       @RequestParam(value = "salaryDown") String salaryDown,
                                       @RequestParam(value = "workCity") String workCity,
                                       @RequestParam(value = "userId") String userId,
                                       @RequestParam(value = "positionId") String positionId){
        UserFavoritesVo userFavoritesVo = new UserFavoritesVo();
        userFavoritesVo.setTitle(title);
        userFavoritesVo.setSalaryUp(salaryUp);
        userFavoritesVo.setSalaryDown(salaryDown);
        userFavoritesVo.setWorkCity(workCity);
        userFavoritesVo.setUserId(userId);
        userFavoritesVo.setPositionId(positionId);
        int userFavorites1 = userFavoritesService.insertUserFavorites(userFavoritesVo);
        if (userFavorites1 > 0){
            return true;
        }else {
            return false;
        }
    }

    /*更新UserFavorites*/
    @PostMapping(value = "update")
    public boolean updateUserFavorites(@RequestParam(value = "favoritesId") String favoritesId,
                                       @RequestParam(value = "title") String title,
                                       @RequestParam(value = "salaryUp") String salaryUp,
                                       @RequestParam(value = "salaryDown") String salaryDown,
                                       @RequestParam(value = "workCity") String workCity,
                                       @RequestParam(value = "userId") String userId,
                                       @RequestParam(value = "positionId") String positionId){
        UserFavoritesVo userFavoritesVo = new UserFavoritesVo();
        userFavoritesVo.setFavoritesId(favoritesId);
        userFavoritesVo.setTitle(title);
        userFavoritesVo.setSalaryUp(salaryUp);
        userFavoritesVo.setSalaryDown(salaryDown);
        userFavoritesVo.setWorkCity(workCity);
        userFavoritesVo.setUserId(userId);
        userFavoritesVo.setPositionId(positionId);
        int userFavoritess = userFavoritesService.updateUserFavorites(userFavoritesVo);
        if (userFavoritess > 0){
            return true;
        }else {
            return false;
        }

    }

}
