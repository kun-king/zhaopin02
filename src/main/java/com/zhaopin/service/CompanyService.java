package com.zhaopin.service;

import com.zhaopin.bean.Company;
import com.zhaopin.vo.CompanyVo;

import java.util.List;

public interface CompanyService {

    /*查询*/
    List<Company> selectCompany(long companyId,String companyName,String companyFullname);

    /*根据公司名查询*/
    List<Company> selectCompanyName(String companyName);

    /*通过公司名得到公司id*/
    Long selectCompanyIdName(String companyName);

    /*注册*/
    int insertCompany(String companyName, String companyAbbreviation,
                      String companyFullname, String type, String description);

    /*删除*/
    int deleteCompany(long companyId);

    /*更新*/
    int updateCompany(CompanyVo companyVo );

}
