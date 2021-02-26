package com.zhaopin.mapper;

import com.zhaopin.bean.Company;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface CompanyMapper extends Mapper<Company> {

    /*查询*/
    List<Company> selectCompany(Company company);

    /*通过公司名得到公司id*/
    @Select("select company_id from company where company_name = #{companyName}")
    Long selectCompanyIdName(String CompanyName);

    /*根据公司名查询*/
    List<Company> selectCompanyName(String companyName);

    /*增加*/
    int insertCompany(Company company);

    /*删除*/
    int deleteCompany(Company company);

    /*修改*/
    int updateCompany(Company company);

}
