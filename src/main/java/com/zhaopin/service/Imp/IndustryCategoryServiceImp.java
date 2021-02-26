package com.zhaopin.service.Imp;

import com.zhaopin.bean.IndustryCategory;
import com.zhaopin.mapper.IndustryCategoryMapper;
import com.zhaopin.service.IndustryCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "IndustryCategoryService")
public class IndustryCategoryServiceImp implements IndustryCategoryService {

    @Autowired
    IndustryCategoryMapper industryCategoryMapper;


    @Override
    public List<IndustryCategory> selectIndustryCategory(long industryId) {
        IndustryCategory industryCategory = new IndustryCategory();
        industryCategory.setIndustryId(industryId);
        List<IndustryCategory> industryCategoryList = industryCategoryMapper.selectIndustryCategory(industryCategory);
        return industryCategoryList;
    }

    @Override
    public int deleteIndustryCategory(long categoryId) {
        IndustryCategory industryCategory = new IndustryCategory();
        industryCategory.setCategoryId(categoryId);
        int industryCategorys = industryCategoryMapper.deleteIndustryCategory(industryCategory);
        return industryCategorys;
    }

    @Override
    public int updateIndustryCategory(long categoryId, String categoryName, String description) {
        IndustryCategory industryCategory = new IndustryCategory();
        industryCategory.setCategoryId(categoryId);
        industryCategory.setCategoryName(categoryName);
        industryCategory.setDescription(description);
        int industryCategorys = industryCategoryMapper.updateIndustryCategory(industryCategory);
        return industryCategorys;
    }

    @Override
    public int insertIndustryCategory(String categoryName, String description, long industryId) {
        IndustryCategory industryCategory = new IndustryCategory();
        industryCategory.setCategoryName(categoryName);
        industryCategory.setDescription(description);
        industryCategory.setIndustryId(industryId);
        int industryCategorys = industryCategoryMapper.insertIndustryCategory(industryCategory);
        return industryCategorys;
    }
}
