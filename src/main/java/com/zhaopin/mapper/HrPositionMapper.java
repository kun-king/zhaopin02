package com.zhaopin.mapper;

import com.zhaopin.bean.HrPosition;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface HrPositionMapper extends Mapper<HrPosition> {

    /*查询*/
    List<HrPosition> selectHrPosition(HrPosition hrPosition);

    /*最新发布查询*/
    List<HrPosition> newdatHrPosition(String title,String companyName,String workCity);

    /*最具价值查询*/
    List<HrPosition> valuableHrPosition(String title,String companyName,String workCity);

    //根据keyword查询
    List<HrPosition> selectkey(String Keyword);

    /*根据主键删除*/
    int deleteHrPosition(HrPosition hrPosition);

    /*根据截至时间删除*/
    int deleteHrPositionValid(HrPosition hrPosition);

    /*更新信息*/
    int updateHrPosition(HrPosition hrPosition);


    /*增加任务*/
    int insertHrPosition(HrPosition hrPosition);

}
