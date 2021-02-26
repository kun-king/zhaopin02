package com.zhaopin.service.Imp;

import com.zhaopin.bean.Industry;
import com.zhaopin.mapper.IndustryMapper;
import com.zhaopin.service.IndustryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "IndustryService")
public class IndustryServiceImp implements IndustryService {

    @Autowired
    IndustryMapper industryMapper;

    @Override
    public List<Industry> selectIndustry() {
        List<Industry> industryList = industryMapper.selectIndustry();
        return industryList;
    }

    @Override
    public int deleteIndustry(String industryName) {
        Industry industry = new Industry();
        industry.setIndustryName(industryName);
        int industrys = industryMapper.deleteIndustry(industry);
        return industrys;
    }

    @Override
    public int updateIndustry(long industryId, String industryName) {
        Industry industry = new Industry();
        industry.setIndustryId(industryId);
        industry.setIndustryName(industryName);
        int industrys = industryMapper.updateIndustry(industry);
        return industrys;
    }

    @Override
    public int insertIndustry(String industryName) {
        Industry industry = new Industry();
        industry.setIndustryName(industryName);
        int industrys = industryMapper.insertIndustry(industry);
        return industrys;
    }
}
