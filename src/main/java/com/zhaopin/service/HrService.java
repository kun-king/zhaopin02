package com.zhaopin.service;

import com.zhaopin.bean.Hr;
import com.zhaopin.vo.HrVo;

import java.util.List;

public interface HrService {

    /*login登录*/
    String loginHr(String mobile,String password);

    /*查看个人账户*/
    List<Hr> login(String hrId);

    /*注册*/
    int insertHr(String mobile,String password,String hrName,long companyId);

    /*注销*/
    int logoutHr(String mobile,String password);

    /*查询*/
    List<Hr> selectHr(String hrId,String mobile,String hrName,String description,long companyId);

    /*更新信息*/
    int updateHr(HrVo hrVo);

    /*删除hr，管理员使用*/
    int deleteHr(String mobile);

}
