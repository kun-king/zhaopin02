package com.zhaopin.service.Imp;

import com.zhaopin.bean.UserBox;
import com.zhaopin.mapper.UserBoxMapper;
import com.zhaopin.service.UserBoxService;
import com.zhaopin.vo.UserBoxVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "UserBoxService")
public class UserBoxServiceImp implements UserBoxService {

    @Autowired
    UserBoxMapper userBoxMapper;

    @Override
    public List<UserBox> selectUserBox(String userId,String hrId) {
        List<UserBox> userBoxList = userBoxMapper.selectUserBox(userId,hrId);
        return userBoxList;
    }

    @Override
    public int deleteUserBox(long boxId) {
        int userBoxs = userBoxMapper.deleteUserBox(boxId);
        return userBoxs;
    }

    @Override
    public int deleteUserBoxAll(String userId) {
        int userBoxs = userBoxMapper.deleteUserBoxAll(userId);
        return userBoxs;
    }

    @Override
    public int deleteHrBoxAll(String hrId) {
        int userBoxs = userBoxMapper.deleteHrBoxAll(hrId);
        return userBoxs;
    }

    @Override
    public int insertUserBox(UserBoxVo userBoxVo) {
        UserBox userBox = new UserBox();
        userBox.setTitle(userBoxVo.getTitle());
        userBox.setSalaryUp(Long.parseLong(userBoxVo.getSalaryUp()));
        userBox.setSalaryDown(Long.parseLong(userBoxVo.getSalaryDown()));
        userBox.setWorkCity(userBoxVo.getWorkCity());
        userBox.setHrMobile(userBoxVo.getHrMobile());
        userBox.setUserMobile(userBoxVo.getUserMobile());
        userBox.setHrEmail(userBoxVo.getHrEmail());
        userBox.setUserEmail(userBoxVo.getUserEmail());
        userBox.setHrId(userBoxVo.getHrId());
        userBox.setUserId(userBoxVo.getUserId());
        userBox.setStatus(userBoxVo.getStatus());
        int userBoxs = userBoxMapper.insertUserBox(userBox);
        return userBoxs;
    }

    @Override
    public int updateUserBox(long boxId,String status) {
        /*UserBox userBox = new UserBox();
        userBox.setBoxId(boxId);
        userBox.setStatus(status);*/
        int userBoxs = userBoxMapper.updateUserBox(boxId, status);
        return userBoxs;
    }
}
