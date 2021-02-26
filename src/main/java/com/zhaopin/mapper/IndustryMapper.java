package com.zhaopin.mapper;

import com.zhaopin.bean.Industry;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface IndustryMapper extends Mapper<Industry> {

    /*查询信息*/
    /*@Select("select * from industry where 1=1")*/
    List<Industry> selectIndustry();

    /*删除信息*/
    int deleteIndustry(Industry industry);

    /*更新信息*/
    int updateIndustry(Industry industry);

    /*增加信息*/
    int insertIndustry(Industry industry);

}
