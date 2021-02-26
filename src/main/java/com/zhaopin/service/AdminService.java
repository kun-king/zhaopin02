package com.zhaopin.service;

import com.zhaopin.bean.Admin;

import java.util.List;

public interface AdminService {

    //MyResult login(Admin admin);
    /*登录管理员*/
    List<Admin> login(String idName,String pwd);

    /*注册管理员*/
    int insetAdmin(String idName,String adminName,String pwd,String mobil);

    /*删除管理员*/
    int deleteAdmin(String idName,String pwd);

    /*更新管理员信息*/
    int updateAdmin(String adminName,String pwd,String mobil);

}
