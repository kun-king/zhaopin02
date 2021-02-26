package com.zhaopin.service;

import com.zhaopin.bean.Industry;

import java.util.List;

public interface IndustryService {

    /*查询信息*/
    List<Industry> selectIndustry();

    /*删除信息*/
    int deleteIndustry(String industryName);

    /*更新信息*/
    int updateIndustry(long industryId,String industryName);

    /*增加信息*/
    int insertIndustry(String industryName);
}
