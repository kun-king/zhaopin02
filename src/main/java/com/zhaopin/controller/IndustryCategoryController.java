package com.zhaopin.controller;


import com.zhaopin.bean.IndustryCategory;
import com.zhaopin.service.IndustryCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(value = "/IndustryCategory")
@ResponseBody
public class IndustryCategoryController {

    @Autowired
    IndustryCategoryService industryCategoryService;

    /*查询信息*/
    @GetMapping("/select")
    public List<IndustryCategory> selectIndustryCategory(@RequestParam long industryId){
        List<IndustryCategory> industryCategoryList = industryCategoryService.selectIndustryCategory(industryId);
        return industryCategoryList;
    }

    /*删除信息*/
    @GetMapping("delete")
    public boolean deleteIndustryCategory(@RequestParam long categoryId) {
        int industryCategorys = industryCategoryService.deleteIndustryCategory(categoryId);
        if (industryCategorys > 0){
            return true;
        }else{
            return false;
        }
    }

    /*更新信息*/
    @GetMapping("update")
    public boolean updateIndustryCategory(@RequestParam long categoryId,@RequestParam String categoryName,@RequestParam String description){
        int industryCategorys = industryCategoryService.updateIndustryCategory(categoryId, categoryName, description);
        if (industryCategorys > 0){
            return true;
        }else{
            return false;
        }
    }

    /*增加信息*/
    @GetMapping("insert")
    public boolean insertIndustryCategory(@RequestParam String categoryName,@RequestParam String description,@RequestParam long industryId){
        int industryCategorys = industryCategoryService.insertIndustryCategory(categoryName, description, industryId);
        if (industryCategorys > 0){
            return true;
        }else{
            return false;
        }
    }

}
