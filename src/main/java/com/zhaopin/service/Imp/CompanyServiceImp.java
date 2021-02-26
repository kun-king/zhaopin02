package com.zhaopin.service.Imp;


import com.zhaopin.bean.Company;
import com.zhaopin.mapper.CompanyMapper;
import com.zhaopin.service.CompanyService;
import com.zhaopin.vo.CompanyVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "CompanyService")
public class CompanyServiceImp implements CompanyService {

    @Autowired
    CompanyMapper companyMapper;

    @Override
    public List<Company> selectCompany(long companyId, String companyName,String companyFullname) {
        Company company = new Company();
        company.setCompanyId(companyId);
        company.setCompanyName(companyName);
        company.setCompanyFullname(companyFullname);
        List<Company> companyList = companyMapper.selectCompany(company);
        return companyList;
    }

    @Override
    public List<Company> selectCompanyName(String companyName) {
        List<Company> companyList = companyMapper.selectCompanyName(companyName);
        return companyList;
    }

    @Override
    public Long selectCompanyIdName(String companyName) {
        Long companyId = companyMapper.selectCompanyIdName(companyName);
        return companyId;
    }

    @Override
    public int insertCompany(String companyName, String companyAbbreviation,
                             String companyFullname, String type, String description) {
        Company company = new Company();
        company.setCompanyName(companyName);
        company.setCompanyAbbreviation(companyAbbreviation);
        company.setCompanyFullname(companyFullname);
        company.setType(type);
        company.setDescription(description);
        int companys = companyMapper.insertCompany(company);
        return companys;
    }

    @Override
    public int deleteCompany(long companyId) {
        Company company = new Company();
        company.setCompanyId(companyId);
        int companys = companyMapper.deleteCompany(company);
        return companys;
    }

    @Override
    public int updateCompany(CompanyVo companyVo){
        Company company = new Company();
        company.setCompanyId(Long.parseLong(companyVo.getCompanyId()));
        company.setCompanyName(companyVo.getCompanyName());
        company.setCompanyAbbreviation(companyVo.getCompanyAbbreviation());
        company.setCompanyFullname(companyVo.getCompanyFullname());
        company.setType(companyVo.getType());
        company.setDescription(companyVo.getDescription());
        int companys = companyMapper.updateCompany(company);
        return companys;
    }

}
