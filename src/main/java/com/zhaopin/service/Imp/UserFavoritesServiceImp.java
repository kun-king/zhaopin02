package com.zhaopin.service.Imp;

import com.zhaopin.bean.UserFavorites;
import com.zhaopin.mapper.UserFavoritesMapper;
import com.zhaopin.service.UserFavoritesService;
import com.zhaopin.vo.UserFavoritesVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "UserFavoritesService")
public class UserFavoritesServiceImp implements UserFavoritesService {

    @Autowired
    UserFavoritesMapper userFavoritesMapper;

    @Override
    public List<UserFavorites> selectUserFavorites(String userId) {
        List<UserFavorites> userFavoritesList = userFavoritesMapper.selectUserFavorites(userId);
        return userFavoritesList;
    }

    @Override
    public int deleteUserFavorites(long favoritesId) {
        int userFavoritess = userFavoritesMapper.deleteUserFavorites(favoritesId);
        return userFavoritess;
    }

    @Override
    public int deleteUserFavoritesAll(String userId) {
        int userFavoritess = userFavoritesMapper.deleteUserFavoritesAll(userId);
        return userFavoritess;
    }

    @Override
    public int insertUserFavorites(UserFavoritesVo userFavoritesVo) {
        UserFavorites userFavorites = new UserFavorites();
        userFavorites(userFavoritesVo, userFavorites);
        int userFavoritess = userFavoritesMapper.insertUserFavorites(userFavorites);
        return userFavoritess;
    }

    @Override
    public int updateUserFavorites(UserFavoritesVo userFavoritesVo) {
        long favoritesId = Long.parseLong("0");
        if (userFavoritesVo.getFavoritesId()!=null && userFavoritesVo.getFavoritesId() != ""){
            favoritesId=Long.parseLong(userFavoritesVo.getFavoritesId());
        }
        UserFavorites userFavorites = new UserFavorites();
        userFavorites.setFavoritesId(favoritesId);
        userFavorites(userFavoritesVo, userFavorites);
        int userFavoritess = userFavoritesMapper.updateUserFavorites(userFavorites);
        return userFavoritess;
    }

    public void userFavorites(UserFavoritesVo userFavoritesVo, UserFavorites userFavorites) {
        Long salaryUp = Long.parseLong("0");
        Long salaryDown = Long.parseLong("0");
        if (userFavoritesVo.getSalaryUp()!=null && userFavoritesVo.getSalaryDown() != ""){
            salaryUp=Long.parseLong(userFavoritesVo.getSalaryUp());
        }
        if (userFavoritesVo.getSalaryDown() != null && userFavoritesVo.getSalaryDown() != ""){
            salaryDown=Long.parseLong(userFavoritesVo.getSalaryDown());
        }
        userFavorites.setTitle(userFavoritesVo.getTitle());
        userFavorites.setSalaryUp(salaryUp);
        userFavorites.setSalaryDown(salaryDown);
        userFavorites.setWorkCity(userFavoritesVo.getWorkCity());
        userFavorites.setUserId(userFavoritesVo.getUserId());
        userFavorites.setPositionId(userFavoritesVo.getPositionId());
    }
}
