package com.zhaopin.controller;

import com.zhaopin.bean.Admin;
import com.zhaopin.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping(value = "admin")
public class AdminController {

    @Autowired
    AdminService adminService;

    @PostMapping(value = "loginAdmin")
    public List<Admin> loginAdmin(@RequestParam(value = "idName") String idName,
                                  @RequestParam(value = "pwd") String pwd){
        List<Admin> adminList = adminService.login(idName,pwd);
        return adminList;
    }

    @PostMapping(value = "updateAdmin")
    public int updateAdmin(String adminName,
                           String pwd,
                           String mobil){
        int admins = adminService.updateAdmin(adminName, pwd, mobil);
        return admins;
    }

    @PostMapping(value = "insetAdmin")
    public int insetAdmin(@RequestParam(value = "idName") String idName, @RequestParam(value = "adminName") String adminName,
                          @RequestParam(value = "pwd") String pwd,@RequestParam(value = "mobil") String mobil){
        int admins = adminService.insetAdmin(idName,adminName,pwd,mobil);
        return admins;
    }

    @PostMapping(value = "deleteAdmin")
    public int deleteAdmin(String idName,String pwd){
        int admins = adminService.deleteAdmin(idName, pwd);
        return admins;
    }

   /* @ResponseBody
    @PostMapping("/login")
    public MyResult login(Admin admin){
        MyResult myResult = adminService.login(admin);
        return myResult;
    }*/



}
