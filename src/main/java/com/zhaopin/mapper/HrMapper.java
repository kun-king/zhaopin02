package com.zhaopin.mapper;

import com.zhaopin.bean.Hr;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface HrMapper extends Mapper<Hr> {

    /*login登录*/
    @Select("select hr_name from hr where mobile=#{mobile} and password=#{password}")
    String loginHr(String mobile,String password);

    /*查看个人账户*/
    List<Hr> login(Hr hr);

    /*注销账号*/
    int logoutHr(Hr hr);

    /*查询信息*/
    List<Hr> selectHr(Hr hr);

    /*删除信息*/
    int deleteHr(Hr hr);

    /*更新信息*/
    int updateHr(Hr hr);

    /*注册*/
    int insertHr(Hr hr);

}
