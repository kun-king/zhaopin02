package com.zhaopin.controller;

import com.alibaba.fastjson.JSON;
import com.zhaopin.bean.Company;
import com.zhaopin.service.CompanyService;
import com.zhaopin.vo.CompanyVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("Company")
@CrossOrigin(allowCredentials = "true")
public class CompanyController {

    @Autowired
    CompanyService companyService;

    /*查询出公司的数据返回给前端渲染，公司名是模糊查询*/
    @GetMapping("select")
    public List<Company> selectCompany(@RequestParam(value = "companyId",defaultValue = "0") Long companyId,
                                       @RequestParam(value = "companyName",defaultValue = "") String companyName,
                                       @RequestParam(value = "companyFullname",defaultValue = "") String companyFullname){
        /*Long companyIds = Long.parseLong(companyId);*/
        List<Company> companyList = companyService.selectCompany(companyId, companyName,companyFullname);
        return companyList;
    }

    /*根据公司名查询，这个是“=”查询*/
    @GetMapping("selectName")
    public List<Company> selectCompanyName(@RequestParam String companyName){
        List<Company> companyList = companyService.selectCompanyName(companyName);
        return companyList;
    }

    /*注册公司信息*//*
    @PostMapping("inset")
    @ResponseBody
    public boolean insertCompany(HttpServletRequest request){
        CompanyVo companyVo = JSON.parseObject(request.getParameter("company"), CompanyVo.class);
        int company = companyService.insertCompany(companyVo);
        if (company >0){
            return true;
        }else{
            return false;
        }
    }*/

    /*删除公司信息*/
    @PostMapping("delete")
    public boolean deleteCompany(@RequestParam long companyId){
        int company = companyService.deleteCompany(companyId);
        if (company > 0){
            return true;
        }else {
            return false;
        }
    }

    /*更新公司信息*/
    @PostMapping("update")
    @ResponseBody
    public boolean updateCompany(HttpServletRequest request){
        CompanyVo companyVo = JSON.parseObject(request.getParameter("company"), CompanyVo.class);
        int company = companyService.updateCompany(companyVo);
        if (company > 0){
            return true;
        }else {
            return false;
        }
    }

}
