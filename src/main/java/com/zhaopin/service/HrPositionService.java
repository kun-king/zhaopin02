package com.zhaopin.service;

import com.zhaopin.bean.HrPosition;
import com.zhaopin.vo.HrPositionVo;

import java.util.List;

public interface HrPositionService {

    /*查询*/
    List<HrPosition> selectHrPosition(String hrId, long categoryId, long positionId, long companyId, String title,
                                      String companyName,String workCity);

    /*最新发布查询*/
    List<HrPosition> newdatHrPosition(String title,String companyName,String workCity);

    /*最具价值查询*/
    List<HrPosition> valuableHrPosition(String title,String companyName,String workCity);

    //根据keyword查询
    List<HrPosition> selectkey(String Keyword);

    /*根据主键删除*/
    int deleteHrPosition(long positionId);

    /*根据截至时间删除*/
    int deleteHrPositionValid(java.sql.Date validDate);

    /*更新信息*/
    int updateHrPosition(HrPositionVo hrPositionVo );


    /*增加任务*/
    int insertHrPosition(HrPositionVo hrPositionVo);

}
