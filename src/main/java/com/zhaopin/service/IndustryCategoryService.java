package com.zhaopin.service;

import com.zhaopin.bean.IndustryCategory;

import java.util.List;

public interface IndustryCategoryService {

    /*查询信息*/
    List<IndustryCategory> selectIndustryCategory(long industryId);

    /*删除信息*/
    int deleteIndustryCategory(long categoryId);

    /*更新信息*/
    int updateIndustryCategory(long categoryId,String categoryName,String description);

    /*增加信息*/
    int insertIndustryCategory(String categoryName,String description,long industryId);

}
