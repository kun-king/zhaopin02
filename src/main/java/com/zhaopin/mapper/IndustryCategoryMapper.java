package com.zhaopin.mapper;

import com.zhaopin.bean.IndustryCategory;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface IndustryCategoryMapper extends Mapper<IndustryCategory> {

    /*查询信息*/
    /*@Select("select * from industry_category where industry_id = #{industryId}")*/
    List<IndustryCategory> selectIndustryCategory(IndustryCategory industryCategory);

    /*删除信息*/
    int deleteIndustryCategory(IndustryCategory industryCategory);

    /*更新信息*/
    int updateIndustryCategory(IndustryCategory industryCategory);

    /*增加信息*/
    int insertIndustryCategory(IndustryCategory industryCategory);

}
