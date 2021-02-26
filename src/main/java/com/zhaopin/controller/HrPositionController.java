package com.zhaopin.controller;

import com.alibaba.fastjson.JSON;
import com.zhaopin.bean.HrPosition;
import com.zhaopin.service.HrPositionService;
import com.zhaopin.vo.HrPositionVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.List;

@RestController
@RequestMapping("HrPosition")
@CrossOrigin(allowCredentials = "true")
public class HrPositionController {

    @Autowired
    HrPositionService hrPositionService;


    /*最新推荐*/
    @GetMapping("newdate")
    public List<HrPosition> newdatHrPosition(@RequestParam(value = "title",defaultValue = "") String title,
                                             @RequestParam(value = "companyName",defaultValue = "") String companyName,
                                             @RequestParam(value = "workCity",defaultValue = "") String workCity){
        List<HrPosition> hrPositionList = hrPositionService.newdatHrPosition(title,companyName,workCity);
        return  hrPositionList;
    }

    /*最具价值查询*/
    @GetMapping("valuable")
    public List<HrPosition> valuableHrPosition(@RequestParam(value = "title",defaultValue = "") String title,
                                               @RequestParam(value = "companyName",defaultValue = "") String companyName,
                                               @RequestParam(value = "workCity",defaultValue = "") String workCity){
        List<HrPosition> hrPositionList = hrPositionService.valuableHrPosition(title,companyName,workCity);
        return  hrPositionList;
    }

    /*普通搜索*/
    @GetMapping("select")
    public List<HrPosition> selectHrPosition(@RequestParam(value = "title",defaultValue = "") String title,
                                             @RequestParam(value = "companyName",defaultValue = "") String companyName,
                                             @RequestParam(value = "hrId",defaultValue = "") String hrId,
                                             @RequestParam(value = "workCity",defaultValue = "") String workCity){
        List<HrPosition> hrPositionList = hrPositionService.selectHrPosition(hrId,0,0,
                0,title,companyName,workCity);
        return hrPositionList;
    }

    //根据keyword查询
    @GetMapping("selectkey")
    public List<HrPosition> selectkey(@RequestParam(value = "Keyword",defaultValue = "") String Keyword){
        List<HrPosition> hrPositionList =hrPositionService.selectkey(Keyword);
        return hrPositionList;
    }

    /*职位详情*/
    @PostMapping(value = "selectPosition")
    public List<HrPosition> selectPosition(@RequestParam(value = "positionId",defaultValue = "0") String positionId){
        long positionIds=0;
        if(positionId != null && positionId !=""){
            positionIds = Long.parseLong(positionId);
        }
        List<HrPosition> hrPositionList = hrPositionService.selectHrPosition(null, 0, positionIds,0,
                null,null,null);
        return  hrPositionList;
    }



    /*根据主键删除*/
    @PostMapping(value = "deleteID")
    public boolean deleteHrPosition(@RequestParam(value = "positionId") String positionId){
        long positionIds = Long.parseLong(positionId);
        int hrPositions = hrPositionService.deleteHrPosition(positionIds);
        if (hrPositions > 0){
            return true;
        }else {
            return false;
        }
    }

    /*根据截至时间删除*/
    @PostMapping(value = "deleteValid")
    public boolean deleteHrPositionValid(@RequestParam(value = "validDate") String validDate){
        java.sql.Date validDates = HrPositionController.strToDate(validDate);
        int hrPositions = hrPositionService.deleteHrPositionValid(validDates);
        if (hrPositions > 0){
            return true;
        }else {
            return false;
        }
    }

    /*更新信息*/
    @PostMapping(value = "update")
    @ResponseBody
    public boolean updateHrPosition(HttpServletRequest request){
        HrPositionVo hrPositionVo = JSON.parseObject(request.getParameter("HrPosition"), HrPositionVo.class);
        int hrPositions = hrPositionService.updateHrPosition(hrPositionVo);
        if (hrPositions > 0){
            return true;
        }else {
            return false;
        }
    }


    /*增加职位*/
    @PostMapping("insert")
    @ResponseBody
    public boolean insertHrPosition(HttpServletRequest request){
        HrPositionVo hrPositionVo = JSON.parseObject(request.getParameter("HrPosition"), HrPositionVo.class);
        int hrPositions = hrPositionService.insertHrPosition(hrPositionVo);
        if (hrPositions > 0){
            return true;
        }else {
            return false;
        }
    }

    /*字符串型转换成java.sql.Date*/
    public static java.sql.Date strToDate(String strDate) {
        String str = strDate;
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        java.util.Date d = null;
        try {
            d = format.parse(str);
        } catch (Exception e) {
            e.printStackTrace();
        }
        java.sql.Date date = new java.sql.Date(d.getTime());
        return date;
    }

}
