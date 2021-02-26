package com.zhaopin.service.Imp;

import com.zhaopin.bean.HrPosition;
import com.zhaopin.mapper.HrPositionMapper;
import com.zhaopin.service.HrPositionService;
import com.zhaopin.vo.HrPositionVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.List;

@Service(value = "HrPositionService")
public class HrPositionServiceImp implements HrPositionService {

    @Autowired
    HrPositionMapper hrPositionMapper;

    @Override
    public List<HrPosition> selectHrPosition(String hrId, long categoryId, long positionId, long companyId,
                                             String title, String companyName,String workCity) {
        HrPosition hrPosition = new HrPosition();
        hrPosition.setPositionId(positionId);
        hrPosition.setHrId(hrId);
        hrPosition.setCategoryId(categoryId);
        hrPosition.setCompanyId(companyId);
        hrPosition.setTitle(title);
        hrPosition.setCompanyName(companyName);
        hrPosition.setWorkCity(workCity);
        List<HrPosition> hrPositionList = hrPositionMapper.selectHrPosition(hrPosition);
        return hrPositionList;
    }

    /*最新发布查询*/
    @Override
    public List<HrPosition> newdatHrPosition(String title,String companyName,String workCity) {
        List<HrPosition> hrPositionList = hrPositionMapper.newdatHrPosition(title,companyName,workCity);
        return hrPositionList;
    }

    /*最具价值查询*/
    @Override
    public List<HrPosition> valuableHrPosition(String title,String companyName,String workCity) {
        List<HrPosition> hrPositionList = hrPositionMapper.valuableHrPosition(title,companyName,workCity);
        return hrPositionList;
    }

    @Override
    public List<HrPosition> selectkey(String Keyword) {
        List<HrPosition> hrPositionList = hrPositionMapper.selectkey(Keyword);
        return hrPositionList;
    }

    @Override
    public int deleteHrPosition(long positionId) {
        HrPosition hrPosition = new HrPosition();
        hrPosition.setPositionId(positionId);
        int hrPositions = hrPositionMapper.deleteHrPosition(hrPosition);
        return hrPositions;
    }

    @Override
    public int deleteHrPositionValid(Date validDate) {
        HrPosition hrPosition = new HrPosition();
        hrPosition.setValidDate(validDate);
        int hrPositions = hrPositionMapper.deleteHrPositionValid(hrPosition);
        return hrPositions;
    }

    @Override
    public int updateHrPosition(HrPositionVo hrPositionVo ) {
        HrPosition hrPosition = new HrPosition();
        hrPosition.setPositionId(Long.parseLong(hrPositionVo.getPositionId()));
        hrPosition.setTitle(hrPositionVo.getTitle());
        hrPosition.setEducation(hrPositionVo.getEducation());
        hrPosition.setExperience(hrPositionVo.getExperience());
        hrPosition.setWelfare(hrPositionVo.getWelfare());
        hrPosition.setPositionDescription(hrPositionVo.getPositionDescription());
        hrPosition.setQuantity(Long.parseLong(hrPositionVo.getQuantity()));
        hrPosition.setWorkCity(hrPositionVo.getWorkCity());
        hrPosition.setWorkAddress(hrPositionVo.getWorkAddress());
        hrPosition.setWorkTime(hrPositionVo.getWorkTime());
        hrPosition.setSalaryUp(Long.parseLong(hrPositionVo.getSalaryUp()));
        hrPosition.setSalaryDown(Long.parseLong(hrPositionVo.getSalaryDown()));
        long salaryAverage =(hrPosition.getSalaryUp()+hrPosition.getSalaryDown());
        hrPosition.setSalaryAverage(salaryAverage);
        java.sql.Date releaseDate = HrPositionServiceImp.strToDate(hrPositionVo.getReleaseDate());
        java.sql.Date validDate = HrPositionServiceImp.strToDate(hrPositionVo.getValidDate());
        hrPosition.setReleaseDate(releaseDate);
        hrPosition.setValidDate(validDate);
        hrPosition.setLabel(hrPositionVo.getLabel());
        hrPosition.setKeyword(hrPositionVo.getKeyword());
        hrPosition.setPositionType(hrPositionVo.getPositionType());
        hrPosition.setHrId(hrPositionVo.getHrId());
        int hrPositions = hrPositionMapper.updateHrPosition(hrPosition);
        return hrPositions;
    }


    @Override
    public int insertHrPosition(HrPositionVo hrPositionVo) {
        HrPosition hrPosition = new HrPosition();
        hrPosition.setTitle(hrPositionVo.getTitle());
        hrPosition.setEducation(hrPositionVo.getEducation());
        hrPosition.setExperience(hrPositionVo.getExperience());
        hrPosition.setWelfare(hrPositionVo.getWelfare());
        hrPosition.setPositionDescription(hrPositionVo.getPositionDescription());
        hrPosition.setQuantity(Long.parseLong(hrPositionVo.getQuantity()));
        hrPosition.setWorkCity(hrPositionVo.getWorkCity());
        hrPosition.setWorkAddress(hrPositionVo.getWorkAddress());
        hrPosition.setWorkTime(hrPositionVo.getWorkTime());
        hrPosition.setSalaryUp(Long.parseLong(hrPositionVo.getSalaryUp()));
        hrPosition.setSalaryDown(Long.parseLong(hrPositionVo.getSalaryDown()));
        long salaryAverage =(hrPosition.getSalaryUp()+hrPosition.getSalaryDown());
        hrPosition.setSalaryAverage(salaryAverage);
        java.sql.Date releaseDate = HrPositionServiceImp.strToDate(hrPositionVo.getReleaseDate());
        java.sql.Date validDate = HrPositionServiceImp.strToDate(hrPositionVo.getValidDate());
        hrPosition.setReleaseDate(releaseDate);
        hrPosition.setValidDate(validDate);
        hrPosition.setLabel(hrPositionVo.getLabel());
        hrPosition.setKeyword(hrPositionVo.getKeyword());
        hrPosition.setPositionType(hrPositionVo.getPositionType());
        hrPosition.setCompanyId(Long.parseLong(hrPositionVo.getCompanyId()));
        hrPosition.setCompanyName(hrPositionVo.getCompanyName());
        hrPosition.setCompanyType(hrPositionVo.getCompanyType());
        hrPosition.setCompanyDescription(hrPositionVo.getCompanyDescription());
        hrPosition.setHrId(hrPositionVo.getHrId());
        hrPosition.setHrMobile(hrPositionVo.getHrMobile());
        hrPosition.setHrEmail(hrPositionVo.getHrEmail());
        hrPosition.setCategoryId(1);
        int hrPositions = hrPositionMapper.insertHrPosition(hrPosition);
        return hrPositions;
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
