package com.zhaopin.service.Imp;

import com.zhaopin.bean.Hr;
import com.zhaopin.mapper.HrMapper;
import com.zhaopin.service.HrService;
import com.zhaopin.vo.HrVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("HrService")
public class HrServiceImp implements HrService {

    @Autowired
    HrMapper hrMapper;

    @Override
    public String loginHr(String mobile,String password) {
        String hrName = hrMapper.loginHr(mobile,password);
        return hrName;
    }

    @Override
    public List<Hr> login(String hrId) {
        Hr hr = new Hr();
        hr.setHrId(hrId);
        List<Hr> hrList = hrMapper.login(hr);
        return hrList;
    }

    @Override
    public int insertHr(String mobile, String password,String hrName ,long companyId) {
        Hr hr = new Hr();
        hr.setHrId(mobile);
        hr.setMobile(mobile);
        hr.setPassword(password);
        hr.setHRName(hrName);
        hr.setCompanyId(companyId);
        int hrs = hrMapper.insertHr(hr);
        return hrs;
    }

    @Override
    public int logoutHr(String mobile, String password) {
        Hr hr = new Hr();
        hr.setMobile(mobile);
        hr.setPassword(password);
        int hrs = hrMapper.logoutHr(hr);
        return hrs;
    }

    @Override
    public List<Hr> selectHr(String hrId,String mobile, String hrName, String description, long companyId) {
        Hr hr = new Hr();
        hr.setHrId(hrId);
        hr.setMobile(mobile);
        hr.setHRName(hrName);
        hr.setDescription(description);
        hr.setCompanyId(companyId);
        List<Hr> hrList = hrMapper.selectHr(hr);
        return hrList;
    }

    @Override
    public int updateHr(HrVo hrVo) {
        Hr hr = new Hr();
        hr.setMobile(hrVo.getMobile());
        hr.setPassword(hrVo.getPassword());
        hr.setHRName(hrVo.getHrName());
        hr.setEmail(hrVo.getEmail());
        hr.setDescription(hrVo.getDescription());
        int hrs = hrMapper.updateHr(hr);
        return hrs;
    }

    @Override
    public int deleteHr(String mobile) {
        Hr hr = new Hr();
        hr.setMobile(mobile);
        int hrs = hrMapper.deleteHr(hr);
        return hrs;
    }

}
