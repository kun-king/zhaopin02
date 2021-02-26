package com.zhaopin.service.Imp;

import com.zhaopin.bean.UserIntroduction;
import com.zhaopin.mapper.UserIntroductionMapper;
import com.zhaopin.service.UserIntroductionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "UserIntroductionService")
public class UserIntroductionServiceImp implements UserIntroductionService {

    @Autowired
    UserIntroductionMapper userIntroductionMapper;

    @Override
    public List<UserIntroduction> selectUserIntroduction(String userId) {
        UserIntroduction userIntroduction = new UserIntroduction();
        userIntroduction.setUserId(userId);
        List<UserIntroduction> userIntroductionList = userIntroductionMapper.selectUserIntroduction(userIntroduction);
        return userIntroductionList;
    }

    @Override
    public int updateUserIntroduction(UserIntroduction userIntroduction) {
        int userIntroductions = userIntroductionMapper.updateUserIntroduction(userIntroduction);
        return userIntroductions;
    }

    @Override
    public int deleteUserIntroduction(String userId) {
        UserIntroduction userIntroduction = new UserIntroduction();
        userIntroduction.setUserId(userId);
        int userIntroductions = userIntroductionMapper.deleteUserIntroduction(userIntroduction);
        return userIntroductions;
    }

    @Override
    public int insertUserIntroduction(String userId) {
        UserIntroduction userIntroduction = new UserIntroduction();
        userIntroduction.setIntroductionId(userId);
        userIntroduction.setUserId(userId);
        int userIntroductions = userIntroductionMapper.insertUserIntroduction(userIntroduction);
        return userIntroductions;
    }
}
