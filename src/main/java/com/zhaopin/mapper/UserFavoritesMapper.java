package com.zhaopin.mapper;

import com.zhaopin.bean.UserFavorites;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface UserFavoritesMapper extends Mapper<UserFavorites> {

    //根据userId查询user的收藏职位
    List<UserFavorites> selectUserFavorites(String userId);

    /*删除UserFavorites*/
    int deleteUserFavorites(long favoritesId);

    /*删除UserFavorites的user下所有数据，注：user注销使用*/
    int deleteUserFavoritesAll(String userId);

    /*添加UserFavorites*/
    int insertUserFavorites(UserFavorites userFavorites);

    /*更新UserFavorites*/
    int updateUserFavorites(UserFavorites userFavorites);

}
