package com.zhaopin.mapper;

import com.zhaopin.bean.Admin;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface AdminMapper extends Mapper<Admin> {

    /*管理员登录*/
    @Select("select * from admin where id_name = #{idName} and pwd = #{pwd}")
    List<Admin> login(Admin admin);

    /*注册管理员*/
    int insetAdmin(Admin admin);

    /*删除管理员*/
    int deleteAdmin(Admin admin);

    /*更新管理员信息*/
    int updateAdmin(Admin admin);

}
