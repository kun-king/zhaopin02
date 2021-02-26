package com.zhaopin.service.Imp;

import com.zhaopin.bean.Admin;
import com.zhaopin.mapper.AdminMapper;
import com.zhaopin.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "AdminService")
public class AdminServiceImp implements AdminService {

    @Autowired
    AdminMapper adminMapper;

    @Override
    public List<Admin> login(String idName, String pwd) {
        Admin admin = new Admin();
        admin.setIdName(idName);
        admin.setPwd(pwd);
        List<Admin> adminList = adminMapper.login(admin);
        return adminList;

    }

    @Override
    public int insetAdmin(String idName, String adminName, String pwd, String mobil) {
        Admin admin = new Admin();
        admin.setIdName(idName);
        admin.setAdminName(adminName);
        admin.setPwd(pwd);
        admin.setMobil(mobil);
        int admins = adminMapper.insetAdmin(admin);
        return admins;
    }

    @Override
    public int deleteAdmin(String idName, String pwd) {
        Admin admin = new Admin();
        admin.setIdName(idName);
        admin.setPwd(pwd);
        int admins = adminMapper.deleteAdmin(admin);
        return admins;
    }

    @Override
    public int updateAdmin(String adminName, String pwd, String mobil) {
        Admin admin = new Admin();
        admin.setAdminName(adminName);
        admin.setPwd(pwd);
        admin.setMobil(mobil);
        int admins = adminMapper.updateAdmin(admin);
        return admins;
    }

    /*@Override
    public MyResult login(Admin admin){
        Admin admin1=new Admin();
        List<Admin> list = new ArrayList<>();
        list = (List<Admin>) adminMapper.login(admin);
        MyResult result = new MyResult();
        if (list.size()!=0){
            result.setCode(0);
            result.setMsg("登录成功");
            result.setList(list);
            result.setObj(list.get(0));
        }else{
            result.setCode(1);
            result.setMsg("登陆失败！");
        }
        return result;
    }*/



}
