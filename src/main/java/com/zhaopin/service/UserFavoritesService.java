package com.zhaopin.service;

import com.zhaopin.bean.UserFavorites;
import com.zhaopin.vo.UserFavoritesVo;

import java.util.List;

public interface UserFavoritesService {

    //根据userId查询user的收藏职位
    List<UserFavorites> selectUserFavorites(String userId);

    /*删除UserFavorites*/
    int deleteUserFavorites(long favoritesId);

    /*删除UserFavorites的user下所有数据，注：user注销使用*/
    int deleteUserFavoritesAll(String userId);

    /*添加UserFavorites*/
    int insertUserFavorites(UserFavoritesVo userFavoritesVo);

    /*更新UserFavorites*/
    int updateUserFavorites(UserFavoritesVo userFavoritesVo);
}
