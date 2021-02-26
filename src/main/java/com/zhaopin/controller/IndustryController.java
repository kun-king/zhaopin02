package com.zhaopin.controller;


import com.zhaopin.bean.Industry;
import com.zhaopin.service.IndustryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = "industry")
@ResponseBody
public class IndustryController {

    @Autowired
    IndustryService industryService;

    /*查询信息*/
    @GetMapping("select")
    public List<Industry> selectIndustry(){
        List<Industry> industryList = industryService.selectIndustry();
        return industryList;
    }

    /*删除信息*/
    @GetMapping("delete")
    public boolean deleteIndustry(@RequestParam String industryName){
        int industries = industryService.deleteIndustry(industryName);
        if (industries > 0){
            return true;
        }else{
            return false;
        }
    }

    /*更新信息*/
    @GetMapping("update")
    public boolean updateIndustry(@RequestParam long industryId,@RequestParam String industryName){
        int industries = industryService.updateIndustry(industryId, industryName);
        if(industries > 0){
            return true;
        }else{
            return false;
        }
    }

    /*增加信息*/
    @GetMapping("insert")
    public boolean insertIndustry(@RequestParam String industryName){
        int industries = industryService.insertIndustry(industryName);
        if (industries > 0){
            return true;
        }else{
            return false;
        }
    }

}
